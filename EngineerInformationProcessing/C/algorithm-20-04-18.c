// 2020년 4회 기사 실기 18번

#include <stdio.h>

void main(){
	char *p = "KOREA";       // ①
	printf("%s\n", p);       // ②
	printf("%s\n", p + 3);   // ③
	printf("%c\n", *p);      // ④
	printf("%c\n", *(p + 3));// ⑤
	printf("%c\n", *p + 2);  // ⑥
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/04-C-18-20e1442d0d824806b29f23e311e898ff