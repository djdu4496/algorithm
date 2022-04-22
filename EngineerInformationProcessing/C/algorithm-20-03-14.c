// 2020년 3회 기사 실기 14번

#include <stdio.h>

int r1() {                // ⑦
	return 4;               // ⑧
}

int r10() {               // ⑤
	return (30 + r1());     // ⑥ ⑨
}

int r100() {              // ③
	return (200 + r10());   // ④ ⑩
}

int main() {              // ①
	printf("%d\n", r100()); // ② ⑪
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-C-14-0a86e3f2cfcc486e98b8ec97a7997422