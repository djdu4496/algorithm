# NCS 천기누설 단원종합문제 20번

sum = 0                      # ①
a = [1, 2, 3, 4, 5, 6, 7, 8] # ②
b = a[ : : 2]                # ③
for i in range(0, 3):        # ④
	sum += b[i]                # ⑤
print(sum)                   # ⑥ 

# 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-Python-20-b329570698ca4c98921b7d2c811c4436