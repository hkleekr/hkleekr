public class InnerEx2 {
    class InstanceInner {}
    static class StaticInner {}

    // 인스턴스멤버 간에는 서로 직접접근이 가능
    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // static멤버는 인스턴스멤버에 직접접근이 불가능
//        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 굳이 접근하려면 아래와 같이 객체를 생성해야 한다
        // 인스턴스클래스는 외부클래스를 먼저 생성해야만 생성할 수 있다.
        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        // 인스턴스메서드에서는 인스턴스멤버와 static 멤버 모두 접근가능
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // 메서드 내에 지역적으로 선언된 내부클래스는 외부에서 접근할 수 없다.
//        LocalInner lv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
