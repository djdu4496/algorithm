// NCS 천기누설 단원종합문제 2번

#include <stdio.h>
void main() {         // ①
	int a = 105;        // ②
	char c = 'Z';       // ③
	
	switch(a/10) {      // ④
		case 10:          // ⑤
		case 9: c = 'A';  // ⑥
			break;
		case 8: c = 'B';
			break;
		default: c = 'F'; 
	}

	printf("%c\n", c)
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-02-d185876b57a84ca0892ec8e220e73114