// 2020년 4회 기사 실기 5번

class Exam {
	public static void main(String[] args) {  // ①
		int[] a = new int[8];                   // ②

		int i = 0;                              // ③
		int n = 10;                             // ④

		while ( ① ) {                           // ⑤
			a[i++] = ②;                           // ⑥
			n /= 2;                               // ⑦
		}

		for(i = 7; i >= 0; i--) {               // ⑧
			System.out.print(a[i]);               // ⑨
		}
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/04-JAVA-5-f3a8fa8959c349049bb3f5a2fba558dd