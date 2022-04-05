// 2019년 1회 기사 실기 3번
public class Test {
	public static void main(String[] args) {
		int i, sum = 0;
		for(i = 1; i <= 110; i++) {
			if(i%4 == 0) 
				sum = sum + 1;
		}
		System.out.printf("%d", sum);
	}
}