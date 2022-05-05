// 2020년 2회 기사 실기 19번

class	A	{ 
	private int	a;
	public A(int a)	{                          // ⑤
		this.a = a;                              // ⑥
	}
	void display(){                            // ⑧
		System.out.println("a="+a);              // ⑨
	}
}

class	B extends	A	{ 
	public B(int a)	{                          // ③
		super(a);                                // ④
		super.display();                         // ⑦
	}
}

public class	Main	{ 
	public	static	void	main(String[]	args){ // ①
		B obj = new B(10);                       // ②
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-JAVA-19-7b6289fac7aa4c6fb75c3e3143133c2a