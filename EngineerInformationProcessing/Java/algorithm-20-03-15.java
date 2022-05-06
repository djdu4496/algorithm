// 2020년 3회 기사 실기 15번

public static void main(String[] args) { // ①
	int i = 0;                 // ②
	int sum = 0;               // ③

	while (i < 10) {           // ④ 
		i++;                     // ⑤ 
		if(i % 2 == 1)           // ⑥
			continue;              // ⑦
		sum += i;                // ⑧
	}
	System.out.println(sum);   // 
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-JAVA-15-b18bfb04907d466b820df9d7b871df42