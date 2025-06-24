class Solution_BottomTop {
    // '정수 삼각형' 문제는 순간의 최대값이 최종 최대값을 보장할 수 없는 케이스.

    // cf. 탐욕 알고리즘: 문제를 해결하는 과정에서 현재 단계에서 가장 이득이 되는 선택만 반복하여 전체 최적 해를 도출하는 알고리즘 방식 
    // 탐욕 알고리즘은 순간의 최대값을 쫓음.
    // 따라서 바텀엄 방식으로 최종 최대값을 구함.

    // 바텀업 방식은 모든 경우의 수를 고려한 누적 계산 방식이기 때문에 최종 최대값을 놓치지 않음.
    public int solution(int[][] triangle) {
        int answer = 0;
        int intLength = triangle.length;
        int[][] arrDp = new int[intLength][intLength];

        // DP 배열 마지막 줄 초기화
        for(int i = 0; i<intLength; i++) {
            arrDp[intLength-1][i] = triangle[intLength-1][i];
        }

        // 바텀업 방식으로 최댓값 누적 계산
        for(int i = intLength-2; i>=0; i--) {
            for(int j = 0; j<i+1; j++) {
                arrDp[i][j] = triangle[i][j] + Math.max(arrDp[i+1][j], arrDp[i+1][j+1]);
            }
        }
        return arrDp[0][0];
    }
}

class  Solution_TopDown {
    // 탑다운 방식도 메모이제이션을 사용하면 모든 경로를 계산하여 바텀업 방식과 같이 최종 최대값을 구할 수 있음.
    // *장점 : 코드가 재귀적으로 깔끔함. 불필요한 중복 계산을 memo[i][j]로 방지하여 성능도 좋음.
    int[][] memo = null; // memoization 배열 선언 <클래스 변수>

    public int solution(int[][] triangle) {
        int intLength = triangle.length;
        memo = new int[intLength][intLength];
        return dfs(0, 0, triangle);
    }
    
    public int dfs(int i, int j, int[][] triangle) {
        int intLength = triangle.length;
        // escape condition - 마지막 줄이면 자기 자신 반환
        if(i == intLength-1) {
            return triangle[i][j];
        }
        // use memoization - 이미 계산한 값이 있다면 재사용
        if(memo[i][j] > 0) {
            return memo[i][j];
        }
        int left = dfs(i+1,j, triangle);
        int right = dfs(i+1,j+1, triangle);
        memo[i][j] = triangle[i][j] + Math.max(left, right);
        return memo[i][j];
    }
}