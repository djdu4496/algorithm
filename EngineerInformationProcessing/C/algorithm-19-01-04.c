// 2019년 1회 기사 실기 4번

#include <stdio.h>

main() {
	int input, sum = 0;
	scanf("%d", &input);
	while (1) {
		if (( input ) == 0)
			break;
		sum = sum + input % 10;
		input = input / ( 10 );
	}
	printf("%d\n", sum);
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/04-C-7dcc117c3c414d6cabf0bce9bce878ae