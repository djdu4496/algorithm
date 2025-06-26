import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        // 제곱의 합이 최소값이 되려면, 최대값을 찾아서 -1 처리한다.
        // 최대값 찾는 방법: 최대 힙
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // 힙에 각 작업량 추가
        for(int work: works) {
            maxHeap.offer(work);
        }
        
        // 퇴근까지 남은 시간 N시간이므로, N번 순회
        // 최대값을 제거후, 최대값-1을 추가하는 로직을 N번 반복
        for(int i=0; i<n; i++) {
            int max = maxHeap.poll();
            // 최대값이 0이면, 남은 작업량도 0
            if(max==0)
                break;
            maxHeap.offer(max-1);
        }
        
        // 야근 피로도 계산
        long tiredRate = 0;
        while(!maxHeap.isEmpty()) {
            tiredRate += (long)Math.pow(maxHeap.poll(), 2);
        }
        return tiredRate;
    }
}