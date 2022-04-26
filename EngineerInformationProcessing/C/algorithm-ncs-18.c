// NCS 천기누설 예상문제 18번

#include <stdio.h>
int f(int n);

void main() {                            // ①
	printf("%d %d %d", f(1), f(5), f(-2)); // ②
}

int f(int i){
	if(i<=2)   // Base case - 문제를 더 이상 쪼갤 수 없는 경우(재귀의 기초)
		return 1;
	else       // Recursive Case - 그렇지 않은 경우
		return f(i-1) + f(i-2);
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-17-51c079a8a37745e3a326ccbbc42c4b73