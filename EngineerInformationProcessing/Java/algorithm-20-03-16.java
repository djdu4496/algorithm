// 2020년 3회 기사 실기 16번

abstract class Vehicle {
	private String name;
	abstract public String getName(String val);
	public String getName() {          // ⑨
		return "Vehicle name:" + name;   // ⑩
	}

	public void setName(String val){   // ⑥ 
		name = val;                      // ⑦
	}
}

class Car extends Vehicle {
	public Car(String val) {           // ④
		setName(val);                    // ⑤
	}

	public String getName(String val) {
		return "Car name:" + val;
	}
}

public class Test {
	public static void main(String[] args) {
		Vehicle obj = new Car("Spark");  // ③
		System.out.print(obj.getName()); // ⑧
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-JAVA-16-230d6177b9364b3ea95d0a2170eb8bb7