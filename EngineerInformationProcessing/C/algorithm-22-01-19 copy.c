// 2022년 1회 기사 실기 19번

#include <stdio.h> 
int isPrime(int number) { 
	int i; 
	for (i=2; i<number; i++) { 
		if (number % i == 0) 
			return 0; 
	} 
	return 1; 
} 
int main(void) {                                          // ①
	int number = 13195, max_div=0, i;                       // ②
	for (i=2; i<number; i++)                                // ③
		if (isPrime(i) == 1 && number % i == 0) max_div = i;  // ④
	printf("%d", max_div);                                  // ⑤
	return 0; 
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-C-19-9ebc5c1f10834dd2b48566286cbc0933