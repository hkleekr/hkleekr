public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);  // a + b는 연산을 위해 int로 자동형변환되었으므로, 이것을 다시 byte로 형변환해주어야 byte c에 저장됨
        System.out.println(c);
    }
}
