public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b;  // 이상한 값, int끼리 연산했으므로 값도 int가 되므로..이건 애초에 long으로 변수타입을 정해줬어야 했다

        System.out.println(c);
    }
}
