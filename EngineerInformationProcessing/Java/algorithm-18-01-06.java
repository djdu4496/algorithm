// 2018년 1회 기사 실기 6번

public class Test1 {
	public static void main(String[] args) {
		int E[] = { 95, 75, 85, 100, 50};
		int i = 0;
		int Temp = 0;

		do
		{
			int j = i;
			do 
			{
				if( E[i] > E[j] )
				{
					Temp = E[i];
					E[i] = E[j];
					E[j] = Temp;
				}
				j++;
			} while (j < 5);
			i++;
		} while (i < 4);
	
	for (int a =0; a < 5; a++)
	{
		System.out.printf(E[a]+"\t");
	}
	System.out.println();
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-JAVA-6-039add39cbc942d79f467e9651b3589e