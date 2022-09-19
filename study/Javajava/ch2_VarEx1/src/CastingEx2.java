public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);  // %d 10진법 정수, 큰->작은: 값손실 없음

        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);  // 큰->작은: 값손실 없음

        b = 10;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

        System.out.printf("i="+Integer.toBinaryString(i));

    }
}
