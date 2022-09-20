public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;  // int끼리의 연산이므로 이미 연산단계에서 오버플로우 발생
        long b = 1_000_000 * 1_000_000L; // 이것은 long타입의 연산, 맞는 결과값

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
