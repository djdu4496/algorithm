// NCS 천기누설 예상문제 12번

#include <stdio.h>
void main() {                  // ①
	int a = 5;                   // ②
	int b = 7;                   // ③

	printf("%d\n", a++ + ++b);   // ④
	printf("%d %d\n", ++a, ++b); // ⑤
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-12-511f9f01372041e2a647e7a86e9f4b15