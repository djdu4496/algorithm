// NCS 천기누설 최종모의고사 1회 05번

#include <stdio.h>
void main() {           // ①
	int a = 5;            // ②
	int b = 8;            // ③
		
	a /= 3;               // ④

	switch(++a){          // ⑤
		case 2: b -= 3;     // ⑥ 
		case 5: b++;        // ⑦
		case 3:             // ⑧
			if(b % 2 == 0) {  // ⑨
				b += 2;         // ⑩
			}
			else {
				b--;
			}
		default: b *= 2;    // ⑪
	}

	printf("%d\n", b++);  // ⑫
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-1-C-05-51555bf244344c2882c6558b5b88dcf3