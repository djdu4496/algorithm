// 2021년 2회 기사 실기 6번

#include <stdio.h>
void main(){
	int ary[3] = {1};       // ①
	int s = 0;              // ②
	int i = 0;              // ③

	ary[1] = *(ary + 0) + 2;// ④
	ary[2] = *ary + 3;      // ⑤

	for(i = 0; i < 3; i++) {// ⑥
		s = s + ary[i];       // ⑦
	}

	printf("%d", s);        // ⑧
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-C-6-23ceeb026a26492aad3d8b7d35e01d4a