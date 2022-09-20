public class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;

        System.out.println(shortPi);  // 3141.592 + 0.5 = 3142.092 / 1000.0 = 3.142 반올림을 만들었군..
    }
}
