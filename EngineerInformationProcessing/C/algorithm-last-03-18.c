// NCS 천기누설 최종모의고사 1회 18번

#include <stdio.h>
int main() {                         // ①
	int n = 4;                         // ② 
	int *pt = NULL;                    // ③
	pt = &n;                           // ④

	printf("%d", &n + *pt - *&pt + n); // ⑤
	return 0;
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-3-C-18-e97c6466005e458d80a61561db2ff6af