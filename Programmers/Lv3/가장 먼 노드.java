import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>(); // 각 노드 번호에 연결된 이웃 노드들을 리스트로 저장
        for(int i=0; i<=n; i++) graph.add(new ArrayList<Integer>());    // 1-based index
        
        // 무방향 그래프
        for(int[] e: edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        // 차이 배열
        int[] dist = new int[n+1];  // 각 노드까지의 최단 거리 저장 
        Arrays.fill(dist, -1);      // 방문 여부 체크
        
        // BFS
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); // 시작 노드 삽입
        dist[1] = 0;    // 자기 자신까지의 거리는 0
        
        while(!queue.isEmpty()) {
            int now = queue.poll();
            for(int next: graph.get(now)) {
                if(dist[next] == -1) {
                    dist[next] = dist[now]+1;
                    queue.offer(next);
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int d: dist) max = Math.max(max, d);
        
        int cnt = 0;
        for(int d: dist) {
            if(d == max)
                cnt++;
        }
        
        return cnt;
    }
}
/*
 *1번 노드로부터 가장 멀리 있는 노드가 몇 개인지 BFS로 구하는 문제
 */
/*
 *graph - 인접 리스트를 표현하는 자료구조
*/

/*
 *1번 노드로부터 가장 멀리 있는 노드가 몇 개인지 BFS로 구하는 문제
 *BFS - 너비 우선 탐색
    - 그래프에서 가까운 노드부터 우선적으로 탐색하는 알고리즘
    - (1) 탐색 시작 노드를 큐에 삽입하고 방문처리한다.
    - (2) 큐에서 노드를 꺼낸 뒤, 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문처리한다.
    - (3) (2) 과정을 더 이상 수행할 수 없을 때 까지 반복한다.
 */