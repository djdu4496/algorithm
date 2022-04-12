// 2018년 2회 기사 실기 6번

public class Problem {
	public static void main(String[] args) {
		int[][] a = new int[(3)][(5)];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				a[i][j] = i + j;
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-JAVA-6-e080a4af67784175a3c7069ad02c4429