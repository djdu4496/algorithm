class Solution {
    public int solution(int[] sticker) {
        int n = sticker.length;
        if (n == 1)             // 스티커가 1개인 경우
            return sticker[0];      //  그 스티커에 적힌 수가 최대값

        // Case 1. 1 ~ N-1 번째 스티커 고려
            // 첫 번째 스티커부터 마지막 바로 앞의 스티커까지 고려(마지막 스티커는 못 뜯음)
        int[] dpFirst = new int[n]; 
        dpFirst[0] = sticker[0];
        dpFirst[1] = Math.max(sticker[0], sticker[1]); /** 첫 번째와 두 번째 중 더 큰 값 선택 **/
        for (int i = 2; i < n-1; i++) { 
            dpFirst[i] = Math.max(dpFirst[i-1], dpFirst[i-2] + sticker[i]);  // 현재 스티커를 뜨는 경우와 안 =뜯는 경우 비교 후 최댓값
        }

        // Case 2. 2 ~ N 번재 스티커 고려
            // 마지막 스티커 뜯을 수 있음
        int[] dpSecond = new int[n];
        dpSecond[0] = 0;            // 첫 번째 스티커를 뜯지 않음.
        dpSecond[1] = sticker[1];   // 두 번째 스티커부터 뜯는 것을 고려
        for (int i = 2; i < n; i++) { 
            dpSecond[i] = Math.max(dpSecond[i-1], dpSecond[i-2] + sticker[i]); // 현재 스티커를 뜨는 경우와 안 =뜯는 경우 비교 후 최댓값
        }

        return Math.max(dpFirst[n-2], dpSecond[n-1]);  // 첫 번째를 선택한 경우는 n-2까지, 선택 안 한 경우는 n-1까지 비교
    }
}


/*
*포인트
    - 스티커 배열이 원형이기 때문에 인접한 스티커를 동시에 뜯을 수 없음.
    - 두 가지 경우로 나눠서 풀어야 함
        1) 첫 번째 스티커를 뜯는 경우 → 마지막 스티커는 못 뜯음
        2) 첫 번째 스티커를 안 뜯는 경우 → 마지막 스티커는 뜯을 수 있음
    - 각 경우를 선형 DP(<-> 원형)로 계산한 뒤, 두 경우의 최대값을 비교.
*주의
    - dpFirst[i], dpSecond[i]: 0번째부터 i번째까지 스티커 중에, 뜯을 수 있는 조합의 최대값
    - DP 점화식: dp[i] = Math.max(dp[i - 1], dp[i - 2] + sticker[i]);
    - 첫 번째를 선택한 경우: i < n - 1 까지만 계산
    - 첫 번째를 선택하지 않은 경우: i < n 까지 계산 가능
    - 스티커 개수가 1개인 경우는 예외 처리
*DP가 뭐에요?
    - 복잡한 문제를 작은 하위 문제들로 나누어, 
    - 그 결과를 저장(Memoization) 해두고 중복 계산을 피하는 방식의 알고리즘 기법
*/