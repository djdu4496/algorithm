// NCS 천기누설 단원종합문제 3번

#include <stdio.h>
void main() {                      // ①
	int i, j;                        // ②
	int temp;                        // ③
	int a[5] = {14, 22, 53, 45, 1};  // ④

	for(i = 0; i < 4; i++) {         // ⑤
		for(j = 0; j < 4 - i; j++) {   // ⑥
			if(a[j] > a[j + 1]){         // ⑦
				temp = a[j];               // ⑧
				a[j] = a[j + 1];           // ⑨
				a[j + 1] = temp;           // ⑩
			}
		}
	}
	
	for(i = 0; i < 3; i++) {         // ⑪
		printf("%d ", a[i]);           // ⑫
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-03-e3c857c0317342cf9b7d6fc4b40772bb