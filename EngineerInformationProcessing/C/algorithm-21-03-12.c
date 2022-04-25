// 2021년 3회 기사 실기 12번

#include <stdio.h>
void main(){                    // ①
	int *arr[3];                  // ②
	int a = 12, b = 24, c = 36;   // ③
	arr[0] = &a;                  // ④
	arr[1] = &b;                  // ⑤
	arr[2] = &c;                  // ⑥

	printf("%d\n", *arr[1] + **arr + 1) // ⑦
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-C-12-f807c2e3149a4628966d57d1d4771163d