public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;

        System.out.printf("%c=%d(%#X)%n", ch, code, code);           // ch = 10진수(16진수)

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);  // hch = 10진수(16진수)
    }
}
