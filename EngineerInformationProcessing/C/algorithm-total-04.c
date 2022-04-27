// NCS 천기누설 단원종합문제 4번

#include <stdio.h>
void main() {             // ①
	int ret = 4;            // ②

	switch(++ret){          // ③
		case 5: ret += 2;     // ④
		case 3: ret++; break; // ⑤
		case 4: ret++;
		default: ret *= 2;
	}	
		printf("%d\n ", ret); // ⑥
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-05-7409c8d90b084b77a3b68bd1c6b97c95