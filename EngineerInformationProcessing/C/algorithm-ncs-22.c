// NCS 천기누설 예상문제 2단원 05번

#include <stdio.h>
#include <String.h>
void main() {              // ① 
	char str[50] = "nation"; // ②
	char *p2 = "alter";      // ③
	strcat(str, p2);         // ④
	printf("%s", str);       // ⑤
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-05-2-8bf4b990f1644622b401222aa9abcc11