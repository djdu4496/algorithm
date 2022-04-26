// NCS 천기누설 예상문제 14번

class A {
	private String s;
	A(String s){
		this.s = s + "A";
	}
	public void fn(String s) {
		System.out.println(this.s + s);
	}
}

class B extends A {
	private String s;
	B(String B){                           // ③
		this.s = s + "B";                    // ④
	}
	public void fn(String s){              // ⑥
		System.out.println(this.s + s);      // ⑦
	}
}

public static void main(String[] args) { // ①
	A a = new B("Hello");                  // ②
	a.fn("Hi");                            // ⑤
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-JAVA-14-0a41f80cf8724b2da4285930508aa52e