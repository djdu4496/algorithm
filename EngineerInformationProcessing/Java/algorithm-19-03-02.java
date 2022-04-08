// 2019년 3회 기사 실기 2번

public class Test {
	public static void main(String[] args) {
		int a[][] = new int[5][5]; // 1
		initArray(a); // 2
		assignVal(a); // 7
		prntArray(a); // 13
	}

	static void initArray(int[][] a) { // 3
		for(int i = 0; i < a.length; i++) { // 4
			for(int j = 0; j < a[i].length; j++) // 5
				a[i][j] = 0; // 6
		
		}
	}

	static void assignVal(int[][] a) { // 8
		int n = 1; // 9
		for(int i = 0; i < a.length; i++) { // 10
			for(int j = i; j < a[i].length; j++) // 11
				a[i][j] = n++; // 12
		
		}
	}

	static void prntArray(int[][] a) { // 14
		for(int i = 0; i < a.length; i++) { // 15
			for(int j = 0; j < a[i].length; j++) // 16
				if(a[i][j] == 0) // 17
					System.out.print(" "); // 18
				else
					System.out.printf("%3d", a[i][j]); // 19
					
			System.out.println(); // 20
		}
	}
}