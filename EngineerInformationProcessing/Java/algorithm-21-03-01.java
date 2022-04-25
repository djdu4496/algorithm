// 2021년 3회 기사 실기 1번

class Soojebi{
	static private Soojebi instance = null;
	private int count = 0;
	static public Soojebi get(){
		if(instance == null) {
			instance = new Soojebi();
		}	
		return instance;
	}
	public void count(){ count++ }
	public int getCount() { return count; }
}

public class Soojebi2{
	public static void main(String[] args){
		Soojebi s1 = Soojebi.get();
		s1.count();
		Soojebi s2 = Soojebi.get();
		s2.count();
		Soojebi s3 = Soojebi.get();
		s3.count();
		System.out.println(s1.getCount());
	}
}
		
// 블로그 링크: https://cooing-silicon-7ae.notion.site/03-JAVA-1-ba57ff5f95674618b4579c56d2813bdf