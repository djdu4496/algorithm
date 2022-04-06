// 2019년 2회 기사 실기 2번
public class Test {
	public static void main(String[] args) {
		int numAry[] = new int[5];
		int result = 0;

		for(int i = 0; i < 5; i++)
			numAry[i] = i+1;

		for(int i:numAry)
			result += i;

		System.out.printf("%d", result);
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-JAVA-2-cbe545d0af6442eab4ec6bbec2ea7343