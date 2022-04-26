// NCS 천기누설 예상문제 2번

#include <stdio.h>
void main() {            // ①
	int a = 3;             // ②
	int b = 7;             // ③

	switch(a%2){           // ④
		case 3 : b += a;     // ⑤
	}

	printf("%d %d", a, b); // ⑥
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-02-81d1d2ff62f74045913c0951647b757b