import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<String> queue = new LinkedList<String>(); // BFS 탐색을 위한 큐
        boolean[] visited = new boolean[words.length];  // 단어 방문 여부를 추적하기 위한 배열
                
        queue.offer(begin);                             // 시작 단어를 큐에 추가
        
        while(!queue.isEmpty()) {                       // 큐가 비어 있지 않은 동안 반복
            int size = queue.size();                    // 현재 레벨의 큐 크기 저장
            
            for(int i=0; i<size; i++) {                 // 현재 큐에 들어있는 노드들에 대해 전부 반복
                String current = queue.poll();          // 큐에서 현재 단어 추출
                
                if(current.equals(target)) {            // 현재 단어가 타겟 단어인 경우
                    return answer;                          // 최소 단계 수 반환
                }
                
                for(int j=0; j<words.length;j++) {
                    if(!visited[j] && canTransform(current, words[j])) {
                        visited[j] = true;
                        queue.offer(words[j]);
                    }
                }
            }
            answer++;
        }
        return 0;
    }
    private boolean canTransform(String from, String to) {
        int diffNumbers = 0;                            // 문자 차이 변수 초기화
        for(int i=0;i<from.length();i++) {
            if(from.charAt(i) != to.charAt(i)) {        // 다른 문자 발견 될 때 마다 증가
                diffNumbers++;
            }
        }
        if(diffNumbers>1) {                             // 문자 차이가 1 초과 시 변환 불가
            return false;
        }
        return diffNumbers == 1;                        // 문자 차이가 1인 경우만 변환 가능
    }
}

// *BFS - 너비 우선 탐색
    // 그래프에서 가까운 노드부터 우선적으로 탐색하는 알고리즘
    // (1) 탐색 시작 노드를 큐에 삽입하고 방문처리한다.
    // (2) 큐에서 노드를 꺼낸 뒤, 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문처리한다.
    // (3) (2) 과정을 더 이상 수행할 수 없을 때 까지 반복한다.

// *LinkedList를 큐로 만드는 이유
    // Java에서 Queue는 인터페이스 - 직접 객체를 생성할 수 없고 이를 구현한 클래스를 통해 객체를 생성하여 사용해야 함.

// *ArrayList가 아닌, LinkedList
    // 비효율적 - ArrayList는 앞쪽 요소를 제거하면 나머지를 모두 한 칸씩 당겨야 하기 때문.
    // LinkedList는 노드 기반이라 앞뒤 삽입/삭제가 O(1).