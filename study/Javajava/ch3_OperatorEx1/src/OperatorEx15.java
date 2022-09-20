public class OperatorEx15 {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32); // char형과 int의 뺄셈이므로 결과값은 int, 따라서 char로 형변환을 잊지 않아야 에러가 없다
        System.out.println(upperCase);
    }
}
