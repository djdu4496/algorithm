// 2021년 2회 기사 실기 18번

class ovr1 {
	public stativ void main(String[] args) {
		ovr1 a1 = new ovr1(); // ovr1인스턴스를 생성하여 ovr1의 주소값을 참조하는 참조변수 a1에 저장
		ovr2 a2 = new ovr2(); // ovr2 인스턴스를 생성하여 ovr2의 주소값을 참조하는 참조변수 a2에 저장

		System.out.print(a1.san(3, 2) + a2.san(3, 2));
		// 참조변수 a1이 참조하고 있는 ovr1인스턴스의 san메서드를 매개변수 자리에 3, 2를 대입하여 호출한다.
		// 참조변수 a2이 참조하고 있는 ovr2인스턴스의 san메서드를 매개변수 자리에 3, 2를 대입하여 호출한다.
	}

	int san(int x, int y){
		return x + y;
	}
}

class ovr2 {
	int san(int x, int y){
		return x - y + super.san(x, y); // ovr2클래스는 ovr1클래스로부터 상속받기 때문에 
																		// super.san(x,y)는 a1.san(x, y)와 같다.
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-JAVA-10-0663f7468de44eafb1dd3518efdcd93d