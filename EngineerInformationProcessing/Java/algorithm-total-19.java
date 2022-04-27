// NCS 천기누설 단원종합문제 19번

interface ICar {              // 인터페이스 선언
	void move();                // 구현체 없이 선언만 존재
}

class ConCar (   ) ICar {
	public void move() {
		System.out.println("move!!");
	}
}

class Main {
	public static void main(String[] args) {
		ICar car = new ConCar(); // 구현클래스 객체 생성
		car.move();              // ConCar 클래스의 move 호출
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-JAVA-19-4d335bd21fa14f6db63d643ce0a7f203