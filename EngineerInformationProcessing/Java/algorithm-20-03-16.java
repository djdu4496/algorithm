// 2020년 3회 기사 실기 16번

abstract class Vehicle {
	private String name;
	abstract public String getName(String val);
	public String getName() {                   // ⑧
		return "Vehicle name:" + name;            // ⑨
	}

	public void setName(String val){            // ⑤ 
		name = val;                               // ⑥
	}
}

class Car extends Vehicle {                  
	public Car(String val) {                    // ③
		setName(val);                             // ④
	}

	public String getName(String val) {
		return "Car name:" + val;
	}
}

public class Test {
	public static void main(String[] args) {    // ①
		Vehicle obj = new Car("Spark");           // ②
		System.out.print(obj.getName());          // ⑦
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-JAVA-16-230d6177b9364b3ea95d0a2170eb8bb7