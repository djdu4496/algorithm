// 2017년 3회 기사 실기 1번

#include <stdio.h>
int res10() {
	return 4;
}
int res30() {
	return 30 + res10();
}
int res200() {
	return 200 + res30();
}
int main() {
	int result;
	result = res200();
	printf("%d\n", result);
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-C-1-8c1f1bf590b14760828b0c56227e67ba