// 2020년 1회 기사 실기 19번

public class Test {
    static int[ ] arr( ) {
        int a[ ] = new int[4];
        int b = a.length;
        for(int i = 0; i < b; i++)
            a[i] = i;
        return a;
    }

    public static void main(String[ ] args) {
        int a[ ] = arr( );
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-JAVA-19-491187c0914a40058f26deffa003f019