import java.util.Collections;
import java.util.PriorityQueue;  
class Solution {
    public int[] solution(String[] operations) {
        // 이중 우선순위 큐 = 우선 순위 큐 두 개
        // 1. 내림차순 정렬 - [5, 4, 3, 2, 1, 0] 0(최소값)부터 삭제
        // 2. 오름차순 정렬 - [0, 1, 2, 3, 4, 5] 5(최대값)부터 삭제
        PriorityQueue<Integer> pqMin = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>(Collections.reverseOrder());
        // ["I 16", "D 1"] - 16 삽입, 최대값 삭제
        // 명령어 종류, 값
        String[] strCommand = new String[2];
        for(int i=0; i<operations.length; i++) {
            strCommand = operations[i].split(" ");
            if("I".equals(strCommand[0])) {
                pqMin.offer(Integer.parseInt(strCommand[1]));
                pqMax.offer(Integer.parseInt(strCommand[1]));
            } else { // D
                if("1".equals(strCommand[1])) {
                    // 최댓값 삭제
                    if(!pqMax.isEmpty()) {
                        int max = pqMax.poll();
                        pqMin.remove(max);
                    }
                } else if("-1".equals(strCommand[1]))
                    // 최솟값 삭제
                    if(!pqMin.isEmpty()) {
                        int min = pqMin.poll();
                        pqMax.remove(min);
                    }
            }
        }
        int[] answer = new int[2];
        if(pqMin.isEmpty() && pqMax.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = pqMax.poll();
            answer[1] = pqMin.poll();
        }
        return answer;
    }
}

// *우선순위 큐 - 우선순위가 가장 높은 데이터를 먼저 삭제하는 자료구조, 데이터를 우선순위에 따라 처리하고 싶을 때 사용
// (1) 스택 - FILO
// (2) 큐 - FIFO
// (3) 우선순위큐 - 가장 우선순위가 높은 데이터 추출
// *우선순위 큐 구현 방법
// (1) 리스트 이용
    // 데이터 N개에 대한 시간복잡도
        // 삽입: O(1)
        // 삭제: O(N)
// (2) 힙 이용
    // 데이터 N개에 대한 시간복잡도
        // 삽입: O(logN)
        // 삭제: O(logN)
    // cf. N개의 데이터를 힙에 삽입 후 모두 꺼내는 작업은 '힙 정렬'과 동일함
        // 시간복잡도 - O(NlogN)
// *힙 자료구조 - 완전 이진 트리 구조의 일종, 항상 루트 노드를 제거
// (1) 최소 힙(minHeap) 
    // 루트 노드가 가장 작은 값
    // 가장 작은 값 우선 제거
// (2) 최대 힙(maxHeap) 
    // 루트 노드가 가장 큰 값
    // 가장 큰 값 우선 제거
// *완전 이진 트리 구조 - 루트 노드부터 시작하여 왼쪽 자식 노드, 오른쪽 자식 노드 순으로 데이터가 차례대로 삽입되는 트리 구조
// *최소 힙 구성 함수(minHeapify)
    // (상향식) 부모 노드로 거슬러 올라감. 부모보다 자신이 더 작은 경우 위치 교체
// *Collection.reverseOrder() - 최댓값 기준 우선순위 큐를 만듦
// *remove : 제거, *poll: 가장 우선순위 높은 데이터 추출(제거)
// *offer: 값 생성 

// *시간 복잡도 - 입력 크기(n)가 커질 때, 알고리즘의 실행 시간이 얼마나 증가하는지 수학적으로 표현한 것
// *O(logN) - 시간 복잡도가 O(logN)이 나오는 구조적 이유는 '반씩 줄이기'이다.
// *이진 탐색 - 매번 절반씩 탐색 범위를 줄임.

// *자료구조 - 메모리상에서 자료를 구조적으로 처리하는 방법
// *컬렉션 - 자바에서 제공하는 자료구조를 담당하는 프레임워크
// *패키지 - 서로 관련된 클래스의 묶음