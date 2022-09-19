public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);  // 반올림 발생
        System.out.printf("%X%n", i);  // 16진수로 출력
    }
}
