// NCS 천기누설 단원종합문제 21번

#include <stdio.h>
void main() {        // ①
	int x = 7;         // ②
	int y = 7;         // ③
	int a = ++x + y--; // ④

	printf("%d\n", a); // ⑤
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-16-5f59a6a1837c45d9af36176e3fd1807e