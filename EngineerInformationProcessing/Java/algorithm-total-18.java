// NCS 천기누설 단원종합문제 18번

public class ExamSample {
	void fn(){
		System.out.println("없음");
	}
	void fn(int i){
		System.out.println(i);	
	}
	void fn(int i, int j) {                  // ④
		int k = i + j;                         // ⑤
		System.out.println(k);		             // ⑥
	}
}

public class Main {
	public static void main(String[] args) { // ①
		ExamSample es = new ExamSample();      // ②
		es.fn(2, 3);                           // ③
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-JAVA-18-87e1d5cd21b14989aa62dd806e9f6581