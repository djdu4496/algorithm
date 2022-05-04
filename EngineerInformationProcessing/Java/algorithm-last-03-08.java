// NCS 천기누설 최종모의고사 3회 08번

public class Soojebi {
	public static void main(String() args) { // ①
		int cnt = 0;                           // ②
		do {                                   // ③
			cnt++;                               // ④
		} while (cnt < 0);                     // ⑤
		if(cnt == 1)                           // ⑥
			cnt++;                               // ⑦
		else 
			cnt = cnt + 3;
		System.out.printf("%d", cnt);          // ⑧
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-3-JAVA-08-32e50126d8eb452088aa033427cbc5f0