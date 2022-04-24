# 2020년 4회 기사 실기 9번

lol=[[1, 2, 3], [4, 5], [6, 7, 8, 9]] # ①
print(lol[0])                         # ②
print(lol[2][1])                      # ③
for sub in lol:                       # ④
	for item in sub:                    # ⑤
		print(item, end='')               # ⑥
	print()                             # ⑦

# 블로그 링크: https://cooing-silicon-7ae.notion.site/04-9-64253c9153504b99bc6131e3aabeaeac