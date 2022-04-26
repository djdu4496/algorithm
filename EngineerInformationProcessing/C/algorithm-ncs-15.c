// NCS 천기누설 예상문제 15번

#include <stdio.h>
void main() {               // ①
	int a = 3, b = 4, c = 2;  // ②
	int r1, r2, r3;           // ③

	r1 = b <= 4 || c == 2;    // ④
	r2 = (a > 0) && (b < 5);  // ⑤
	r3 = !c;                  // ⑥

	printf("%d", r1+r2+r3);   // ⑦
	return 0;
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-15-7b4e07881d1b4297991c02265b97f953