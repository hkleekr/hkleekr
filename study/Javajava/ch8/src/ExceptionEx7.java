public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);                 // 오류발생
            System.out.println(4);                     // 실행안됨
        } catch (ArithmeticException ae) {             // 오류인 7 line대신 실행됨
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) {                        // ArithmeticException을 제외한 모든 예외가 처리됨
            System.out.println("Exception");
        } // try-catch 의 끝
        System.out.println(6);
    } // main의 끝
}
