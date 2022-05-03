# NCS 천기누설 최종모의고사 1회 15번

class FourCal:                 # FourCal 클래스 선언
	def setdata(sel, fir, sec):  # ③
		sel.fir = fir              # ④
		sel.sec = sec              # ⑤
	def add(sel):                # ⑦
		result = sel.fir + sel.sec # ⑧
		return result              # ⑨
a = FourCal()                  # ①
a.setdata(4, 2)                # ②
print(a.add())                 # ⑥

# 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-1-Python-15-bffbef58e1b3498c90af7698418d2f3d