// NCS 천기누설 예상문제 9번

#include <stdio.h>
void main() {                // ①
	int a = 4;                 // ②
	int r = 3 > 5 ? ++a : --a; // ③

	printf("%d", r);           // ④
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-09-ba5d34651b2643199dfe7bad7e99f135