// 2021년 1회 기사 실기 15번

#include <stdio.h>
struct Soojebi { // ①
	char name[10]; // ②
	int age;       // ③
}
void main(){
	struct Soojebi s[] = { "kim", 28, "Lee", 38, "Seo", 50, "Park", 35}; // ④
	struct Soojebi *p;                                                   // ⑤
	
	p = s;                    // ⑥
	p++;                      // ⑦
	printf("%s\n", p->name);  // ⑧
	printf("%d\n", p->age);   // ⑨
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-C-15-16b453c7904e47a889f69f80cd765d61