// 2017년 3회 기사 실기 10번

#include <stdio.h>
int power(int data, int exp) {
	int i, result = 1;              // ③
	for(i = 0; i < exp; i++)        // ④
			result = result * data;     // ⑤
	return result;                  // ⑥
}
int main() {                      // ①
		printf("%d\n", power(2, 10)); // ②
		return 0;
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-C-10-d567933a9a4c4bd5b8a0fd449b8e514c