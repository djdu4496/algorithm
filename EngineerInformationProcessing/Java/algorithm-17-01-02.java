// 2017년 1회 기사 실기 2번

public class Test001 {
	public static void main(String[] args) {
		int[] a = {3, 4, 10, 2, 5};
		int temp;
		for(int i = 0; i <= 3; i++){
			for(int j = i + 1; j <= 4; j++){
				if(a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0; i < 5; i++)
			System.out.println(a[i]);
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-JAVA-2-9b5d6c1099e34acf821dc29641a2733bAVA-6-039add39cbc942d79f467e9651b3589e