public class MemberCall {
    int iv = 10;                           // 인스턴스 변수
    static int cv = 20;                    // 클래스 변수

    int iv2 = cv;
//    static int cv2 = iv;                 // ERROR!!, 클래스변수는 인스턴스변수를 참조할 수 없음
    static int cv2 = new MemberCall().iv;  // 이처럼 객체를 생성해야 인스턴스 변수 참조 가능함

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv);            // ERROR!!, 클래스메서드에서 인스턴스변수 사용불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv);            // 객체를 생성한 후에야 인스턴스 변수 참조가능
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);              // 인스턴스메서드에서는 인스턴스변수 바로 사용가능
    }
    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1();                   // ERROR!!, 클래스메서드에서 인스턴스메서드 호출불가
        MemberCall c = new MemberCall();     // 인스턴스를 생성한 후에 호출할 수 있음
        c.instanceMethod1();
    }
    void instanceMethod2() {                 // 인스턴스 메서드에서는 인스턴스메서드, 클래스메서드 모두 인스턴스 생성 없이 바로 호출가능
        staticMethod1();
        instanceMethod1();
    }

}
