// NCS 천기누설 예상문제 19번

public class Soojebi {
	public static void main(String[] args){ // ①
		String s = "red";                     // ②
		boolean [] b = new boolean[1];        // ③
		if(b[0]) s = "blue";                  // ④
		System.out.println(s);                // ⑤
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-JAVA-19-16b1547a55e84dbda44dd2db90784f34