// 2019년 2회 기사 실기 4번

#include <stdio.h>
main()
{
		char ch, str[] = "12345000";
		int i, j;

		for (i = 0; i < 8; i++) {
			ch = str[i];
			if ( ( ) )
				break;
		
		}

		i--;
		for (j = 0; j < i; j++) {
			ch = str[j];
			str[j] = str[i];
			str[i] = ch;
			i--;
		}

		printf("%s", str);
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/04-C-4fd977e7682e42089524f7a9f1a46150