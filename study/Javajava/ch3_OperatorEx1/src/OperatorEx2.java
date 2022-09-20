public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;        // 참조 후 증가
        System.out.println("j=i++; 실행 후, i=" + i +", j =" +j);

        i = 5;
        j = 0;

        j = ++i;       // 참조 전 증가
        System.out.println("j=++i; 실행 후, i=" + i +", j =" +j);
    }
}
