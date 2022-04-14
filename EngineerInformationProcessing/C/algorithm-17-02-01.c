// 2017년 2회 기사 실기 1번

#include <stdio.h>
int isprime(int number)
{
	int i;
	for(i = 2; i < number; i++)
			if( number % i == 0)
				return 0;
	return 1;	
}
int main()
{
		int number = 100, cnt = 0, i;
		for(i = 2; i < number; i++)
			cnt = cnt + isprime(i);
		printf("%d를 넘지 않는 소수는 %d개입니다.\n", number, cnt);
		return 0;
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-C-1-2285c28e7af34ab9aae1c107244ccba2