public class InnerEx1 {
    class InstanceInner {
        int iv = 100;
//        static int cv = 100;              // ERROR!! static 변수를 선언할 수 없음
        final static int CONST = 100;       // final static은 상수이므로 허용
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;                // static 클래스만 static 변수 선언가능
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
//            static int cv = 300;            // ERROR!! static 변수를 선언할 수 없음
            final static int CONST = 300;   // final static은 상수이므로 허용
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
