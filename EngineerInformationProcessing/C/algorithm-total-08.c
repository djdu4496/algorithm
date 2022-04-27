// NCS 천기누설 단원종합문제 8번

#include <stdio.h>
int num(int a, int b){                     // ③
	if(a > b) {                              // ④
		return a;                              // ⑤
	}
	else {                                   // ⑥
		return b;                              // ⑦
	}
}

void main() {                              // ①
	printf("%d", num(10, 20) + num(30, 20)); // ②
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-08-754530dee7084f22b547a075e5a89d3f