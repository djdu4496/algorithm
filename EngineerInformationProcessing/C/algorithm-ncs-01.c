// NCS 천기누설 예상문제 1번

#include <stdio.h>
void main() {            // ①
	int a = 5;             // ②
	int s = 0;             // ③

	switch(a/2){           // ④ 
		case 2 : s++;        // ⑤
		case 3 : a += s;     // ⑥
		default : a++;       // ⑦
	}

	printf("%d %d", s, a); // 
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-01-398c047ce3eb462e86736c11c8a28529