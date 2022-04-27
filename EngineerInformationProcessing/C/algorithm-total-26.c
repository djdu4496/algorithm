// NCS 천기누설 단원종합문제 26번

#include <stdio.h>
void main() {                        // ①
	int *pnum, Num1 = 200, Num2 = 300; // ②
	pnum = &Num1;                      // ③
	(*pnum) += 40;                     // ④
	pnum = &Num2;                      // ⑤
	(*pnum) -= 50;                     // ⑥
	printf("%d %d", Num1, Num2);       // ⑦
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-C-26-3357f2ded505496ba150efaf73765463