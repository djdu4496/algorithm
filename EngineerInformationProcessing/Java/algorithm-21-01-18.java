// 2021년 1회 기사 실기 18번

public class Soojebi{
	public static void main(String[] args) {
		int i, j;
		for(j = 0, i = 0; i <= 5; i++) {
			j += i;
			System.out.print(i);
			if(i == 5){
				System.out.print("=");
				System.out.print(j);
			}	
			else {
				System.out.print("+");
			}
		}
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-JAVA-18-862ae73a8c1b43e0a36b8d331a515922