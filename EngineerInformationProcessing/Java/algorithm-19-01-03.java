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

// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-JAVA-2-29f051b226d74c0cb625665250aa34d0