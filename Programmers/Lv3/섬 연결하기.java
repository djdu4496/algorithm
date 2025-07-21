import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        // 1. 비용 오름차순 정렬
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);

        // 2. 각 섬의 그룹 번호를 저장 (초기엔 자기 자신이 그룹)
        int[] group = new int[n];
        for (int i = 0; i < n; i++) group[i] = i;

        int answer = 0;
        int connected = 0;

        // 3. 간선을 하나씩 확인
        for (int[] cost : costs) {
            int a = cost[0];
            int b = cost[1];
            int c = cost[2];

            // 두 섬이 같은 그룹이면 사이클 생김 (패스)
            if (group[a] == group[b]) continue;

            // 연결하고 비용 더함
            answer += c;
            connected++;

            // 두 그룹을 하나로 합치기 (그룹 병합)
            int oldGroup = group[b];
            int newGroup = group[a];
            for (int i = 0; i < n; i++) {
                if (group[i] == oldGroup) {
                    group[i] = newGroup;
                }
            }

            // 모두 연결되면 종료
            if (connected == n - 1) break;
        }

        return answer;
    }
}
/*
 * 1. 탐욕법  - 최소의 비용으로 모든 섬이 서로 통행 가능하도록
 * 2. 최소 신장 트리(MST) 알고리즘 - 그래프 내 모든 노드를 최소 비용으로 연결하는 트리 구조
 * 2.1 크루스칼 알고리즘 - 간선을 비용 기준으로 정렬해서, 가장 싼 것부터 연결 (사이클은 제거)
 * 2.2 프림 알고리즘 - 	한 정점에서 시작해, 인접한 가장 싼 간선을 점차 확장해나가는 방식
 */
/*
 *MST - "최단거리 연결 네트워크 만들기"라는 문제 자체
 *크루스칼/프림 - 그 문제를 푸는 전략(방법)
 */