// NCS 천기누설 예상문제 6번

public static void main(String[] args){ // ①
	int k = 10;                           // ②
	int a = 3;                            // ③

	switch(k++){                          // ④
		case 10 : a += 2;                   // ⑤                   
		case 11 : a *= k;                   // ⑥
		case 8 : break;                     // ⑦
		case 9 : a %= 2;                    
	}

	System.out.println(a);                // ⑦
	System.out.println(k);                // ⑧
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-JAVA-05-be738f7f1ec246c2afb838479872fb59