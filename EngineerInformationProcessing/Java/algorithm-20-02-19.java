// 2020년 2회 기사 실기 19번

class	A	{ // ⑥
	private int	a; // ⑦
	public A(int	a)	{ // ⑧
		this.a	=	a; // ⑨
	}
	void	display(){ // ⑪
		System.out.println("a="+a); // ⑫
	}
}

class	B	extends	A	{ // ⑧
	public	B(int	a)	{ // ④
		super(a); // ⑤
		super.display(); // ⑩
	}
}

public class	Main	{ // ①
	public	static	void	main(String[]	args){ // ②
		B	obj	=	new	B(10); // ③
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-JAVA-19-7b6289fac7aa4c6fb75c3e3143133c2a