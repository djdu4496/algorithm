// 2019년 3회 기사 실기 3번

#include <stdio.h>

main() {
	int i;
	printf("숫자를 입력하시오: ");
	scanf("%d", &i);
	recursive(i);
}

int recursive(int n) {
	int i;
	if (n < 1)
		return 2;
	else {
		i = (2 * ( ) ) + 1;
		printf("%d ", i);
		return i;
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-C-3-7caaa3336dba4e459f0f4a08cbc29cf9