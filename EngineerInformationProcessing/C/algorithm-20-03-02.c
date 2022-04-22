// 2020년 3회 기사 실기 2번

#include <stdio.h>

void main() {
	int i = 0, c = 0; // ①
	
	while(i < 10) {   // ②
		i++;            // ③
		c *= i;         // ④
	}
 
	printf("%d", c);  // ⑤
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-C-2-1-af192c3176364b5d96afe3c20583b6b6