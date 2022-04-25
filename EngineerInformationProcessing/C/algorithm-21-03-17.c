// 2021년 3회 기사 실기 17번

#include <stdio.h>
struct Soojebi{           // ①
	char name[20];          // ②
	int os, db, hab1, hab2; // ③
};

void main() {             // ④
	struct Soojebi s[3] = { 
													{"데이터1", 95, 88}, 
													{"데이터2", 84, 91}, 
													{"데이터3", 86, 75}}; // ⑤
	struct Soojebi *p;                          // ⑥

	p = &s[0];                                  // ⑦
	(p+1)->hab1 = (p+1)->os + (p+2)->db;        // ⑧
	(p+1)->hab2 = (p+1)->hab1 + p->os + p->db;  // ⑨

	printf("%d\n", (p+1)->hab1 + (p+1)->hab2);  // ⑩
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-C-17-684b1256c80541d18aa641067cb68de7