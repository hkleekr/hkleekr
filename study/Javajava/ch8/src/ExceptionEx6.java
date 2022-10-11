public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);  // 오류발생
            System.out.println(4);    // 실행안됨
        } catch (Exception e) {       // 오류인 7line 대신 처리됨
            System.out.println(5);
        } // try-catch의 끝
        System.out.println(6);
    } // main의 끝
}
