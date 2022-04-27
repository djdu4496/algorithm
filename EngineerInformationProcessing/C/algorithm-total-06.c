// NCS 천기누설 단원종합문제 6번

#include <stdio.h>
void main() {                // ①
	char *str = "zjavb";       // ②
	int i;                     // ③
	for(i = 4; i >= 0; i--) {  // ④
		print("%c", *(str + i)); // ⑤
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-06-3a012d52f05940b7b1430c7910b06cf0