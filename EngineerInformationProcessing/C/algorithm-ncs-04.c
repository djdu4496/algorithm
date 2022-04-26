// NCS 천기누설 예상문제 4번

#include <stdio.h>
void main() {            // ①
	int a = 2;             // ②
	int b = 5;             // ③
	int c = 3;             // ④

	b /= a;                // ⑤
	c %= a;                // ⑥

	printf("%d %d", b, c); // ⑦
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-04-8928914715fa4b08a8e9d7d6b678450b