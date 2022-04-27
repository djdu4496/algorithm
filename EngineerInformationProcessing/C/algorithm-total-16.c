// NCS 천기누설 단원종합문제 16번

#include <stdio.h>
void main() {               // ①
	int a = 10;               // ②
	int *p = &a;              // ③
	printf("%d %d\n", a, *p); // ④

	a = 30;                   // ⑤
	printf("%d %d\n", a, *p); // ⑥
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-16-5f59a6a1837c45d9af36176e3fd1807e