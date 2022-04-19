// 2020년 1회 기사 실기 14번

public static void main(String[] args){
 int i = 3;
 int k = 1;

 switch(i){
	 case 0:
	 case 1:
	 case 2:
	 case 3: k=0;
	 case 4: k+=3;
	 case 5: k-=10;
	 default: k--;
 }

 System.out.print(k);
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-JAVA-14-cdaafa800bae43d1bb59c59d3a697bcd