// NCS 천기누설 단원종합문제 5번

#include <stdio.h>
void main() {                 // ①
	int a[] = {1, 2, 3, 4};     // ②
	int b[] = {5, 6, 7, 8};     // ③
	int *pa[] = {a, b};         // ④
	printf("%d", *(pa[1] + 1)); // ⑤
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-05-1-7409c8d90b084b77a3b68bd1c6b97c95