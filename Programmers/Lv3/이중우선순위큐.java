import java.util.Collections;
import java.util.PriorityQueue;  
class Solution {
    public int[] solution(String[] operations) {
        // 이중 우선순위 큐 = 우선 순위 큐 두 개
        // 1. 최소 힙(minHeap) - 최소값 제거
        // 2. 최대 힙(maxHeap) - 최대값 제거
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        // ["I 16", "D 1"] - 16 삽입, 최대값 제거
        // 명령어 종류, 값
        String[] strCommand = new String[2];
        for(int i=0; i<operations.length; i++) {
            strCommand = operations[i].split(" ");
            // 앞 명령어가 'I'일 경우, 두 힙에 값 추가
            if("I".equals(strCommand[0])) {
                minHeap.offer(Integer.parseInt(strCommand[1]));
                maxHeap.offer(Integer.parseInt(strCommand[1]));
            } else { // 앞 명령어가 'D'
                // 뒷 명령어가 1
                if("1".equals(strCommand[1])) {
                    // 최대값 제거 
                    if(!maxHeap.isEmpty()) {
                        int max = maxHeap.poll();
                        minHeap.remove(max);
                    }
                // 뒷 명령어가 '-1'
                } else if("-1".equals(strCommand[1]))
                    // 최솟값 삭제
                    if(!minHeap.isEmpty()) {
                        int min = minHeap.poll();
                        maxHeap.remove(min);
                    }
            }
        }
        int[] answer = new int[2];
        // 최대 힙, 최소 힙이 비어 있으면 [0,0] 반환
        if(minHeap.isEmpty() && maxHeap.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        } else { // 최댓값, 최솟값 제거하여 배열에 저장 후 반환
            answer[0] = maxHeap.poll();
            answer[1] = minHeap.poll();
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
// *remove : 제거, *poll: 가장 우선순위 높은 데이터 제거
// *offer: 값 생성 

// *시간 복잡도 - 입력 크기(n)가 커질 때, 알고리즘의 실행 시간이 얼마나 증가하는지 수학적으로 표현한 것
// *O(logN) - 시간 복잡도가 O(logN)이 나오는 구조적 이유는 '반씩 줄이기'이다.
// *이진 탐색 - 매번 절반씩 탐색 범위를 줄임.

// *자료구조 - 메모리상에서 자료를 구조적으로 처리하는 방법
// *컬렉션 - 자바에서 제공하는 자료구조를 담당하는 프레임워크
// *패키지 - 서로 관련된 클래스의 묶음