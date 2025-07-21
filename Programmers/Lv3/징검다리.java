class Solution {
    public int solution(int[] stones, int k) {
        int left = 1;
        int right = 200000000;  // 최대값 설정

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canCross(stones, k, mid)) {
                left = mid + 1;  // 더 많은 사람이 가능할 수 있음
            } else {
                right = mid - 1; // 너무 많음, 줄이자
            }
        }

        return right;
    }

    private boolean canCross(int[] stones, int k, int people) {
        int cnt = 0;
        for (int stone : stones) {
            if (stone - people < 0) {
                cnt++;
                if (cnt >= k) return false;
            } else {
                cnt = 0;  // 연속이 아니면 리셋
            }
        }
        return true;
    }
}