// NCS 천기누설 예상문제 19번

#include <stdio.h>
int fn(int n){           // ③
	if( n <= 0 ) return 0; // Base case - 문제를 더 이상 쪼갤 수 없는 경우(재귀의 기초)
	return n +fn(n - 1)    // Recursive Case - 그렇지 않은 경우
}

void main() {            // ①
	printf("%d", fn(12))   // ②
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-19-79df29ebe4bc4735ac1c55e3daacb657