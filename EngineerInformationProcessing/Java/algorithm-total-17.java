// NCS 천기누설 단원종합문제 17번

public class Parent{
	String className = "Parent Class";
	public void info(){
		System.out.println(className);
	}
}

public class Child ( ① ) Parent { // ①
	// Child 클래스가 Parent 클래스를 상속
	String className = "Child Class";
	public void info() {
		super.info();
		System.out.println(className);
	}
}

public class Soojebi{
	public static voic main(String args[]) {
		Parent p = ( ② ) Parent();    // ②
		// Parent 클래스의 객체를 생성
		p.info();
		Child c = ( ② ) Child();      // ②
		// Child 클래스의 객체를 생성
		c.info();
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-JAVA-17-b588aaa930a547a08ef537128b213143