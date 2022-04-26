// NCS 천기누설 예상문제 18번

#include <stdio.h>
int fn(int n){
	if( n <= 0 ) // Base case - 문제를 더 이상 쪼갤 수 없는 경우(재귀의 기초)
		return 1;
	else         // Recursive Case - 그렇지 않은 경우
		printf("%d ", n);
	
	fn(n-1);
}

int main() { // ①
	fn(5);     // ②
	return 0;
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-18-3e3d370bf3cc4e4ba0a6af77174b9755