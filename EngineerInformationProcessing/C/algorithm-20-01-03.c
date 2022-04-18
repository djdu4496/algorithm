// 2020년 1회 기사 실기 1번

#include <stdio.h>

void main() {
	int i, j;
	int temp;
	int a[5] = {75, 95, 85, 100, 50};

	for(i = 0, i < 4; i++){
		for(j = 0, j < 4 - i; j++){
			if(a[j] > a[j + 1]) {
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}

	for(i = 0; i < 5; i++){
		printf("%d ", a[i]);	
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-C-12-2ead9c3a68d74939ac9dd8a3f3eaf801