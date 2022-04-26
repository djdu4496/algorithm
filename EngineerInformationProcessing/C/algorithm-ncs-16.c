// NCS 천기누설 예상문제 16번

#include <stdio.h>
int fn(int n){         // ③
	if( n <= 1 )         // ④
		return 1;          // ⑦
	else                 // ⑤
		return n*fn(n-1);  // ⑥
}

void main() {          // ①
	printf("%d", fn(4)); // ②
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-16-dc4af4a9421a4b7d9fc2f60d31bdc578