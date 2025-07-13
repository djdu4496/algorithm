import java.util.*;

class Solution {
    Set<String> result = new HashSet<>();

    public int solution(String[] user_id, String[] banned_id) {
        boolean[] visited = new boolean[user_id.length];
        dfs(0, user_id, banned_id, visited);
        return result.size();
    }

    private void dfs(int depth, String[] user_id, String[] banned_id, boolean[] visited) {
        if (depth == banned_id.length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) sb.append(user_id[i]).append(",");
            }
            result.add(sortKey(sb.toString()));
            return;
        }

        String pattern = banned_id[depth].replace("*", ".");

        for (int i = 0; i < user_id.length; i++) {
            if (visited[i]) continue;
            if (!user_id[i].matches(pattern)) continue;

            visited[i] = true;
            dfs(depth + 1, user_id, banned_id, visited);
            visited[i] = false;
        }
    }

    private String sortKey(String users) {
        String[] arr = users.split(",");
        Arrays.sort(arr);
        return String.join(",", arr);
    }

}


/*

1. 문제 유형
    - 백트래킹 + 정규표현식 + 중복 조합 제거

2. 접근 방법
   - banned_id 배열을 순서대로 탐색하면서
   - user_id 중 정규식에 매칭되는 유저를 하나씩 선택
   - 선택한 유저는 visited[] 배열로 중복 사용 방지
   - 조합이 완성되면 String으로 정렬해서 Set에 저장 (중복 제거)

3. 정규식 변환
   - banned_id[i]의 *는 .으로 바꿔서 regex 패턴 생성
   - user.matches(regex)로 비교

4. 최종 결과
   - Set<String>에 정렬된 유저 조합을 넣어
   - 순서는 달라도 같은 조합은 1번만 카운트

5. 포인트
   - depth == banned_id.length → 조합 완성 조건
   - visited[i] = true → 선택
   - visited[i] = false → 백트래킹 (선택 취소)
   - 조합은 String으로 만들고 정렬 후 Set에 저장하여 중복 제거

*/