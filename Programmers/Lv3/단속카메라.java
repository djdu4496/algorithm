import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        int answer = 0;
        int cctv = (-1) * (30_001);
        for(int[] route: routes) {
            int start = route[0]; 
            int end = route[1];
            if(start > cctv) {
                cctv = end;
                answer++;
             }
}
        
        return answer;
    }
}

/*
*그리디 알고리즘 문제
    - 진출 시점 기준으로 차량들을 오름차순 정렬
    - 이미 설치한 카메라가 해당 차량의 구간 안에 있지 않다면 새 카메라 설치 필요
    - start > cctv이면 카메라 새로 설치
*/
/*
*Comparator<T>
    - 자바에서 정렬 기준을 직접 설정할 수 있게 해주는 함수형 인터페이스
    - new Comparator<>() { ... }: 인터페이스를 익명 구현함.
        - 익명 클래스를 만들어서 compare() 메서드를 바로 구현함.
    - new Comparator<int[]>() {
          @Override
          public int compare(int[] o1, int[] o2) {
              return o1[1] - o2[1];  // 진출 지점 기준 정렬
          }
      }
    - 람다식: (a, b) -> a[1] - b[1] (JAVA 8+)
        - import java.util.Comparator; 생략 가능
*/