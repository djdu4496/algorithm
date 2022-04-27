// NCS 천기누설 단원종합문제 25번

publc static void main(String[] args) { // ①
	int sum = 0;                          // ②

	for(int i = 1; i <= 7; i++) {         // ③
		if(i % 2 == 0) {                    // ④
			sum += i;                         // ⑤
		}
		else {                              // ⑥
			sum %= i;                         // ⑦
		}
	}
	System.out.println(sum);              // ⑧
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-JAVA-25-ff411241ce124c96afb8c91ca2d7f186