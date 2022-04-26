// NCS 천기누설 예상문제 8번

#include <stdio.h>
void main() {                            // ①
	int a[5] = {2, 4, 1, 3, 0};            // ②
	int s = 0;                             // ③

	printf("%d %d", a[a[4]], a[3] + a[1]); // ④
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-08-8a7cf36b865442ca90f1b4690a60997d