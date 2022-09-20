public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

      //  char c2 = c1 + 1; // 컴파일 에러, 변수의 연산은 미리 type을 맞춰주어야 오류가 없다 -> (char)(c1 + 1)
        char c2 = 'a' + 1;  // 리터럴끼리의 연산은 에러없음

        System.out.println(c2);
    }
}
