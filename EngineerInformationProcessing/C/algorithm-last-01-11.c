// NCS 천기누설 최종모의고사 1회 11번

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
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-1-C-11-dd9df3d12b6643b4b8734da0b47743f5