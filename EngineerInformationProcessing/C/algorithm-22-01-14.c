// 2022년 1회 기사 실기 14번

#include <stdio.h>
int func(int a) {          // ⑤
  if (a <= 1) return 1;    // ⑥
  return a * func(a - 1);  // ⑦
}
int main() {               // ①
	int a;                   // ②
	scanf(""%d"", &a);       // ③
	printf(""%d"", func(a)); // ④
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-C-14-eea346b9442e4ea6aa2ab7bcbf27ab27