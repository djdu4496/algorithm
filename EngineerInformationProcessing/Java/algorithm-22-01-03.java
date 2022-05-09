// 2022년 1회 기사 실기 3번

class A {
	int a;
	int b;
}

public class Main {
	
	static void func1(A m){                 // ⑤
	  m.a *= 10;                            // ⑥
	}

  static void func2(A m){                       // ⑨
	  m.a += m.b;                           // ⑩
}

	public static void main(String args[]){ // ①
	
	  A m = new A();                        // ②
	
	  m.a = 100;                            // ③
	  func1(m);                             // ④
	  m.b = m.a;                            // ⑦
	  func2(m);                             // ⑧
	
	  System.out.printf("%d", m.a);         // ⑪

  }
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-JAVA-3-fc907a36a73746b3a3d6951d90b14eb5