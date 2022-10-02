public class BindingTest2 {
    public static void main(String[] args) {
        MyParent1 p = new MyChild1();
        MyChild1 c = new MyChild1();

        System.out.println("p.x="+p.x);
        p.method();

        System.out.println("c.x="+c.x);
        c.method();
    }
}

class MyParent1 {
    int x = 100;

    void method() {
        System.out.println("MyParent1 Method");
    }
}

class MyChild1 extends MyParent1{}
