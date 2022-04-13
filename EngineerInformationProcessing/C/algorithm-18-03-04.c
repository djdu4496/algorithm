// 2018년 3회 기사 실기 4번 ⚠️ 미해결

#include <stdio.h>
#include <stdlib.h>

struct NODE {
	int data;
	struct NODE *Next;
}

struct NODE *head;

void Push(int data){ 
	struct NODE *end = malloc(sizeof(struct NODE));
	end->( ① ) = head->( ① );
	end->data = data;
	head->( ① ) = end;
}

int Pop() { 
	int a;
	
	struct NODE *del = head->( ① );
	head->( ① ) = del->( ① );
	a = del->data;
	free(del);
	return a;
}

main() {
	int r;
	
	head = malloc(sizeof(struct NODE));
	head->( ① ) = NULL;
	
	Push(10);
	Push(20);
	Push(30);
	
	r = ( ② );
	printf("%d\n", r);
	r = ( ② );
	printf("%d\n", r);
	r = ( ② );
	printf("%d\n", r);
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-C-4-d738d97afb204edaadfb284b6dce0362