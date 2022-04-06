// 2019년 1회 기사 실기 2번
class SuperObject {
    public void paint() {
        draw();
    }
    
    public void draw() {
        draw();
        System.out.println("Super Object");
    }
}
class SubObject extends SuperObject{
    public void paint() {
        super.draw();
    }
    public void draw() {
        System.out.println("Sub Object");
    }
}

public class Test {
    public static void main(String[] args) {
        SuperObject a = new SubObject();
        a.paint();
    }
}

// 블로그 링크: https://cooing-silicon-7ae.notion.site/01-JAVA-1-25d538bd45ae4d3991551ac6a08f6f30