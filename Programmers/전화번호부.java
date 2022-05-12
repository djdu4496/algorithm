class Solution {
  public boolean solution(String[] phone_book) {
    boolean answer = true;
    for (int i = 0; i < phone_book.length; i++) {
      for (int j = i + 1; j < phone_book.length; j++) {
        String prefix = phone_book[i];
        String obj = phone_book[j];
        if (obj.contains(prefix)) {
          answer = false;
          return answer;
        }
      }
    }
    return answer;
  }
}

/* 
 * 코딩 실행 : 통과
 * 제출 후 채점하기 : 탈락
*/