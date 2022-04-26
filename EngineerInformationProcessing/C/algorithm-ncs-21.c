// NCS 천기누설 예상문제 21번

#include <stdio.h>
int main(int argc, char *argv[]){     // ①
	int a[2][2] = {{11, 22}, {44, 55}}; // ②
	int i, sum = 0;                     // ③
	int *p;                             // ④
	p = a[0];                           // ⑤
	for(i = 1; i < 4; i++){             // ⑥
		sum += *(p + i);	                // ⑦
	printf("%d", sum);                  // ⑧
	return 0;        
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-21-744b95c2a54c4914bf7eb1ff21cca16c