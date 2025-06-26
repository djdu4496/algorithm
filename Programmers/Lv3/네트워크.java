class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] isVisited = new boolean[n];
        for(int i=0; i<n; i++){
                if(!isVisited[i]){
                     dfs(computers, i, isVisited);
                    answer++;
                }
        }
        return answer;
    }
    private void dfs(int[][] computers, int i, boolean[] isVisited) {
        isVisited[i] = true;
        for(int j=0; j < computers[i].length; j++){
    if(i != j && computers[i][j] == 1 && !isVisited[j])
       dfs(computers, j, isVisited);
}
    }
} 
// *DSF - 깊이 우선 탐색
    // (1) 탐색 시작 노드를 스택 삽입하고 방문처리한다.
    // (2) 스택 최상위 노드에 방문한 적 없는 인접한 노드가 하나라도 있으면 그 노드를 스택에 삽입하고 방문처리한다.
    //    방문하지 않은 인접 노드가 없으면 스택에서 최상위 노드를 꺼낸다.
    // (3) (2) 과정을 더 이상 수행할 수 없을 때 까지 반복한다.