// NCS 천기누설 단원종합문제 22번

public class Exam1{
	public static void main(String[] args) { // ①
		int n = 10;                            // ②
		increase(n);                           // ③
		System.out.println(n);                 // ⑥
	}

	static void increase(int n) {            // ④
		n = n + 1;                             // ⑤
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-JAVA-22-4358106488214336b1df12a076bbae0e