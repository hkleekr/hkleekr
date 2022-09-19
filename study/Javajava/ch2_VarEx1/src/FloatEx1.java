public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.1234567890123456789f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("     123456789012345678901234%n");
        System.out.printf("f  :   %f%n", f);
        System.out.printf("f  : %24.20f%n", f);  // 저장공간의 한계로 오차발생 정밀도 7자리
        System.out.printf("f  : %24.20f%n", f2); // 저장공간의 한계로 오차발생 정밀도 7자리
        System.out.printf("f  : %24.20f%n", d);  // 저장공간의 한계로 오차발생 정밀도 15자리
    }
}
