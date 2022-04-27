// NCS 천기누설 단원종합문제 9번

#include <stdio.h>
void main() {               // ①
	int sum = 0;              // ②
	int i = 0;                // ③
	for(i = 0; i < 10; i++) { // ④
		sum += i;               // ⑤
	}
	printf("%d", sum);        // ⑥
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-09-2d36c245be1b4eae84ef48e8dbdc09a3