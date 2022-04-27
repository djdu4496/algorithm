// NCS 천기누설 단원종합문제 13번

#include <stdio.h>
void main() {                             // ①
	int i, j;                               // ②
	int a[3][2] = {{1, 2}, {3, 4}, {5, 6}}; // ③
	int sum = 0;                            // ④
	for(i = 0; i < 3; i++) {                // ⑤
		for(j = 0; j < 2; j++) {              // ⑥
			sum += a[i][j];                     // ⑦
		}
	}

	printf("%.2f", (float)sum/(3*2));       // ⑧
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-13-c75e4b8b6dc043dcb6637932819be212