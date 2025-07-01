class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] road = new int[n][m];
        
        
        for(int[] puddle: puddles) {             // 웅덩이 -1 저장
            road[puddle[1]-1][puddle[0]-1] = -1;
        }
        
        road[0][0] = 1;                          // 시작 노드 1 저장
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                if(road[i][j]  == -1) {          // 웅덩이일 경우
                    road[i][j] = 0;                 // 0으로 바꾸고
                    continue;                       // continue
                }
                
                    
                // 숫자가 이 값을 초과할 수 있기 때문에 계산 과정에서 나머지 구하기
                if(i != 0)                                      // 맨 위가 아니라면    
                    road[i][j] += road[i-1][j] % 1000000007;        // 윗쪽 값을 더해준다.   
                if(j != 0)                                      // 맨 왼쪽이 아니라면
                    road[i][j] += road[i][j-1] % 1000000007;        // 왼쪽 값을 더해준다.
            }
        }
        
        return road[n-1][m-1] % 1000000007;
    }
    @Test
    public void tdd() {
        Assert.assertEquals(4, solution(4, 3, new int[][]{{2,2}}));
        Assert.assertEquals(7, solution(4, 4, new int[][]{{3,2}, {2,4}}));
    }
}
// *@Test
    // 해당 메서드를 테스트로 인식하게 하는 애너테이션
    // Assert 대신 static import 가능 - import static org.junit.Assert.assertEquals
// *JUnit
    // 자바 단위 테스트 프레임워크
// *Assert.assertEquals()
    // JUnit에서 제공하는 단위 테스트 메서드
    // TDD 방식에서 자주 사용하는 테스트 코드

// *1000000007로 나누는 이유
    // (1) 경로가 수십억 이상이어도 충분히 커버 가능
    // (2) int(32bit), long(64bit) 타입 범위 초과 방지
    // (3) 소수이기 때문.

// *웅덩이를 -1 처리하는 이유
    // 명확한 금지 표시 cf. 0은 아직 경로의 수가 없다 해석될 여지 있음.