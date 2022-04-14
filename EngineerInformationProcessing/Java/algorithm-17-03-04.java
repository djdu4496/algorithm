// 2017년 3회 기사 실기 4번

public class Test02 {
	public static void main(String[] args) {
		int a[] = {10, 30, 50, 70, 90};
		int i, max, min;
		max = a[0];
		min = a[0];
		for(i = 0; i < 5; i++){
			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
		}
		System.out.printf("%d\n", max);
		System.out.printf("%d\n", min);
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-JAVA-4-679db95c2cae4cb1b3d23dac78f728b6