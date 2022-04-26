// NCS 천기누설 예상문제 13번

public class Soojebi{
	public static void main(String[] args){        // ①
		int x=5, y=0, z=0;                           // ②
		y = x++;                                     // ③
		z = --x;                                     // ④
		System.out.println(x + ", " + y + ", " + z); // ⑤
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-JAVA-13-39022dc6da284cd294ee7c7ff864ea4e