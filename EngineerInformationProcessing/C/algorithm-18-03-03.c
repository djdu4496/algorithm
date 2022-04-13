// 2018년 3회 기사 실기 3번

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

main(){
	int hist[6] = { 0, };
	int n, i = 0;
	srand(time(NULL));

	do {
				i++;
				n = rand() % 6 + 1;
				hist[n - 1] += 1;
		 } while (i < 100);

	for(i = 0; i < 6; i++)
		printf("[%d] = %d\n", i+1, hist[i]);
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-C-3-2c5b79487ca449709e25c4d379a1a490