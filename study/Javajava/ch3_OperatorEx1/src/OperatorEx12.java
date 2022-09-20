public class OperatorEx12 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1;

        c3 = (char)(c1 + 1);
        c2++;
        c2++;

        System.out.println("i = " + i);    // i 를 int로 선언했으므로 숫자 출력됨
        System.out.println("c2 = " + c2);  // c2가 char type이므로 문자로 출력됨
        System.out.println("c3 = " + c3);
    }
}
