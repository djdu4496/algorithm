// NCS 천기누설 예상문제 3번

#include <stdio.h>

struct KEY{          // KEY라는 이름의 구조체 타입 정의
	int a;             // int형 변수 a 선언
	int b;             // int형 변수 b 선언
}
void main() {        // ①
	struct KEY y;      // ②
	struct KEY *p;     // ③
	p = &y;            // ④
	y.a = 100;
	y.b = 200;
	printf("%d", p->a);
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-03-70f306d467d04ce297829a0b37bfe25d