// 2021년 2회 기사 실기 11번

#include <stdio.h>
int Soojebi(int base, int exp) { // ③
	int i, result = 1;             // ④
	for(i=0; i<exp; i++){          // ⑤
		result *= base;              // ⑥
	return result;                 // ⑦
	}
}

void main(){                     // ①
	printf("%d", Soojebi(2, 10));  // ②
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-C-11-e95807c76f4342b783cc20c143522fd1