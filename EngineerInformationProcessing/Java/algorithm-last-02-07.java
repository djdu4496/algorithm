// NCS 천기누설 최종모의고사 2회 07번

public class Soojebi{                      
	public static void main(String[] args) { // ①
		int arr[];                          // ②
		int i = 0;                          // ③
		arr = new int[10];                  // ④
		arr[0] = 0;                         // ⑤
		arr[1] = 1;                         // ⑥
		while(i < 8) {                      // ⑦
			arr[i + 2] = arr[i + 1] + arr[i]; // ⑧
			i++;                              // ⑨
		}
		System.out.println(arr[9]);         // ⑩
	}
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/NCS-2-JAVA-07-f07b034780ae48abbf6a074a87f3920a