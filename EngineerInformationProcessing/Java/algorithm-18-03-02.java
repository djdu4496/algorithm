// 2018년 3회 기사 실기 2번

public class Problem {
	public static void main(String[] args) {
		int a, b, c, sum;
		a = b = 1;
		sum = a + b;
		
		for(int i = 3; i <= 5; i++) 
		{
			c = a + b;
			sum += c;
			a = b;
			b = c;
		}
		System.out.println(sum);
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-JAVA-2-9cce907d5c9949fe95f50dc08c340cd5