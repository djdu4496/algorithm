// 2018년 2회 기사 실기 4번

#include <stdio.h>

main() {
	int i, a[5], cnt = 0;
	
	for(i = 0; i < 5; i++)
		scanf("%d", &a[i]);

	for(i = 0; i < 5; i++){
		if(a[i] % 2 != 0)
			cnt = cnt + 1;	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-C-4-e4d2ac16b60e4da7aa795363b778358f