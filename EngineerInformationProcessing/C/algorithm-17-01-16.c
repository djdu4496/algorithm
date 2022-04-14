// 2017년 1회 기사 실기 16번

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

main(){
	int num[10];
	int min = 9999;
	int i;
	for(i = 0; i < 10; i++) {
		scanf("%d", &num[i]);
	}
	for(i = 0; i < 10; i++) {
		if(min > ( ① )) {
			min = num[i];
		}
	}
	printf("가장 작은 값은 %d이다.", min);
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-C-16-51a5f352dc19462896a541204438f611