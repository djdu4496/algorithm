import java.util.*;
class Solution {
    public int[] solution(String[] gems) {
        // 보석 종류 
        HashSet<String> kinds = new HashSet<>(Arrays.asList(gems));
        int kindsLength = kinds.size();
        
        Map<String, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int minLength = Integer.MAX_VALUE;
        int[] answer = {0, gems.length-1};
        
        while(end < gems.length) {
            // 1. END를 늘려 보석 추가 - 윈도우 확장
            map.put(gems[end], map.getOrDefault(gems[end], 0)+1);   // end에 위치한 보석을 윈도우(map)에 추가 또는 +1
            end++;                                                      // 슬라이딩 윈도우를 오른쪽으로 +1 확장하여
            // 2. 정답 후보 구간                                              // 다음 보석으로 이동
                // start++하면서 더 짧게 만들 수 있는지 확인.
            while(map.size() == kindsLength) {
                if(end-start<minLength) {       // 현재 윈도우의 길이가 이전까지 발견한 최소 길이보다 작은 경우
                    minLength = end-start;          // 최소 길이 갱신
                    answer[0] = start+1;        // 문제 요구에 맞게 1-based index로 변환 후 저장
                    answer[1] = end;                // end는 이미 end++됐기 때문에 그대로 저장
                }
                // 3. start++하면서 더 짧게 만들 수 있는지 확인 - 윈도우 축소                                    
                map.put(gems[start], map.get(gems[start])-1);  // 현재 윈도우의 왼쪽 끝 보석을 1개만큼 줄임.
                if(map.get(gems[start])==0) {                  // 줄인 이후, 보석 개수가 0개라면
                    map.remove(gems[start]);                        //  윈도우(map)에서 삭제
                }
                start++;                                       // 슬라이딩 윈도우 왼쪽을 한 칸 줄임
            }
        }
        return answer;
    }
}
/*
 *슬라이딩 윈도우
    - 1. 고정 길이 윈도우 - "연속된 3개 숫자중 최대 합"
    - 2. 가변 길이 윈도우(2 포인터) - "모든 보석을 포함하는 가장 짧은 구간"
        - 조건: start ~ end 범위에 모든 보석 종류가 다 들어있는가
            - 조건을 만족하면 최소 길이 갱신
            - 조건을 더 만족시킬 수 있는지 start++로 줄여봄.
 */
/*
 *map.getOrDefault(key, defaultKey)
    - key가 map에 있으면 해당 값 반환하고, 없으면 defaultValue 반환.
    - NPE 피할 수 있음
 */
/*
 *HashSet
    - 보석의 총 종류 개수를 구하기 위해 사용
 *HashMap
    - 현재 윈도우 내 보석 개수를 세기 위해 사용
 */