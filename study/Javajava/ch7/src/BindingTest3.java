public class BindingTest3 {
    public static void main(String[] args) {
        MyParent2 p = new MyChild2();   // 조상스콥 < 자식스콥 ok
        MyChild2 c = new MyChild2();

        System.out.println("p.x="+p.x);   // 100
        p.method();
        System.out.println();
        System.out.println("c.x="+c.x);   // 200
        c.method();
    }
}

class MyParent2 {
    int x = 100;

    void method() {
        System.out.println("MyParent2 Method");
    }
}

class MyChild2 extends MyParent2 {
    int x = 200;

    void method() {
        System.out.println("x="+x);
        System.out.println("super.x="+super.x);
        System.out.println("this.x="+this.x);
    }
}
