// 2020년 2회 기사 실기 5번

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
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/02-JAVA-5-cc899bff4f294524beac4c661e23ff89