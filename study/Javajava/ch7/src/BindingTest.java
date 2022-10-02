public class BindingTest {
    public static void main(String[] args) {
        MyParent p = new MyChild();   // OK, 참조변수 스콥 < 인스턴스 스콥
        MyChild c = new MyChild();

        System.out.println("p.x="+p.x);
        p.method();

        System.out.println("c.x="+c.x);
        c.method();
    }
}

class MyParent {
    int x = 100;

    void method() {
        System.out.println("MyParent Method");
    }
}

class MyChild extends MyParent {
    int x = 200;

    void method() {
        System.out.println("MyChild Method");
    }
}