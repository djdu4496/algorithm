// 2021년 3회 기사 실기 11번

public class Soojebi2{
	public static void main(String[] args){
		int a = 3, b = 4, c = 3, d = 5;                           // ①
		if((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d)) {    // ②
			a = b + c;                                              // ③
			if(7 == b ^ c != a) {                                   // ④
				System.out.println(a);                                // ⑤
			}
			else {                                                  // ⑥

				System.out.println(b);
			}
		}
		else {
			a = c + d;
			if(7 == c ^ d != a) {
				System.out.println(a);
			}
			else {
				System.out.println(d);
			}
		}
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-JAVA-11-03a4aae47f2d4778b2ce01a0c0e0d0fd