class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int scope = 2*w+1;// 커버 범위
        int idx = 0;      // 현재 커버하고 있는 아파트 위치
        int s = 0;        // stations 배열의 인덱스(다음 기지국 위치 참조)
        while(idx<n){     // 아직 n번 집까지 커버 못 했으면 계속 돔
            if(s<stations.length && idx+1>=stations[s]-w) {    // 현재 위치가 기존 기지국 커버 범위 안에 있으면
                // idx를 그 기지국의 최종 커버 지점으로 이동시킴
                idx = stations[s]+w;                               // 지금 커버하려는 집(idx+1)이 기존 기지국의 전파 범위에 들어가 있는지
                s++;                                               // 다음 기지국 보기 위해 s++
            } else {                                           // 현재 위치는 어떤 기지국도 커버 불가 
                answer++;                                          // 기지국을 직접 설치해야 함 - 기지국 추가
                idx += scope;                                      // 기지국을 하나 설치해 커버 범위만큼 전진함 
            }
        }

        return answer;
    }
}
/*
* 그리디 알고리즘 문제
    - 초기 기지국 전파 커버 범위 파악
    - 커버되지 않는 구간 발생 시, 필요한 최소 개수의 기지국 설치
    - 한 번에 2*w + 1만큼 커버 가능
*/
/*
*초기
    - idx = 0, answer = 0, s = 0
*1회차
    - idx+1 = 1 → 1 >= 3 (x)
    - 조건 거짓 → 새로 설치 → answer = 1, idx = 0 + 3 = 3
*2회차
    - idx+1 = 4 → 4 >= 3 (o)
    - 기지국 4번이 커버하니까 → idx = 5, s = 1
*3회차
    - idx+1 = 6 → 기지국 11번은 10~12 → 6은 못 덮음 (x)
    - 새로 설치 → answer = 2, idx = 5 + 3 = 8
*4회차
    - idx+1 = 9 → 9 >= 10 (x)
    - 새로 설치 → answer = 3, idx = 8 + 3 = 11
*5회차
    - idx+1 = 12 → 12 >= 10 (0)
    - 기지국 11번이 커버 → idx = 12(fin)
*/