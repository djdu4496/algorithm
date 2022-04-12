// 2018년 2회 기사 실기 7번

#include <stdio.h>

main() {
	int i, j;
	for(i = 1; i <= 5; i++)
		printf("%d의 약수 ㅣ ", i);
		for(j = 1; j <= 5; j++){
			if( i % j == 0 )
				printf("%d ", j);
		}
		printf("\n");
	}
	return 0;
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-C-7-a593eff821ad4765bb46d025a9c5f641