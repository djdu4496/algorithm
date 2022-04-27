// NCS 천기누설 단원종합문제 24번

#include <stdio.h>
int fn(int k) {                   // ③
	if(k <= 2)                      // ④
		return 1;                     // ⑥
	else
		return fn(k - 1) + fn(k - 2); // ⑤
}

int main() {                      // ①
	printf("%d", fn(5));            // ②
	return 0;
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-24-1325f6d98d144613a80549b19d0d9a89