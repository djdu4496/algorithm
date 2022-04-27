// NCS 천기누설 단원종합문제 11번

#include <stdio.h>
void main() {             // ①
	int a = 3, b = 4;       // ②
	int ret = 0;            // ③

	ret = a > b ? a : b;    // ④
	
	switch(ret) {           // ⑤
		case 0: printf("A");  // ⑥
		case 4: printf("B");  // ⑦
		case 3: printf("C");  // ⑧
		case 7: printf("D");  // ⑨
		default: printf("E"); // ⑩
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-11-b08fc0af46da496d92e2c05090c662a5