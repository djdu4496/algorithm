import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        // 점수 역순으로 pQueue에 삽입
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int a : A)
            pQueue.offer(a);
        
        // 점수순으로 정렬하여 Deque에 삽입
        Arrays.sort(B);
        ArrayDeque<Integer> dQueue = new ArrayDeque();
        for(int i : B)
            dQueue.add(i);
        while(!pQueue.isEmpty()) {
            int aScore = pQueue.poll();
            if(aScore < dQueue.peekLast()) {
            dQueue.pollLast();
            answer++;
        } else {
            dQueue.pollFirst();
        }
            
}
        return answer;
    }
}

// A와 B의 길이는 1 이상 100,000 이하입니다.
    // 반복문 2개를 이용해 검사 시
        // 1초에 대략 1억번의 연산이 가능
            // 시간초과를 받을 확률이 높다.

// 정렬 통해 B의 최대 승점 계산
    // A의 최댓값 vs B의 최댓값
        // 승리
            // B: 가장 적은 차이 값(최솟값)
        // 패배
            // B: 가장 큰 차이 값(최솟값)
// *ArrayDeque(Double-Ended Queue)
    // 양쪽(앞뒤)에서 삽입과 삭제가 모두 가능한 큐(Deque의 자료구현 중 하나)
    // 삽입
        // deque.addLast(1);  // 뒤에 추가 (큐처럼)
        // deque.addFirst(2); // 앞에 추가 (스택처럼)

    // 삭제
        // deque.pollFirst(); // 앞에서 꺼냄
        // deque.pollLast();  // 뒤에서 꺼냄

    // 조회
        // deque.peekFirst(); // 앞 요소 보기
        // deque.peekLast();  // 뒤 요소 보기
// *Priority Queue(우선순위 큐)
    // 우선순위가 가장 높은 데이터를 먼저 삭제하는 자료구조, 데이터를 우선순위에 따라 처리하고 싶을 때 사용