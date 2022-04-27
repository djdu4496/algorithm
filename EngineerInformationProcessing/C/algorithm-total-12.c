// NCS 천기누설 단원종합문제 12번

#include <stdio.h>
void main() {                                // ①
	int i = 1;                                 // ②
	for(; i < 10; ){                           // ③
		switch(i % 2) {                          // ④
			case 0: printf("짝수: %d\n", i); break; // ⑦ 
			default: printf("홀수: %d\n", i);       // ⑤ ⑨
		}

		i += 3;                                  // ⑥ ⑧
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-12-4a5676a437e343fdace2e2dd6017b4ea