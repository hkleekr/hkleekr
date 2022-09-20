public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b =30;
        byte c = (byte)(a * b); // 300이 맞지만, int -> byte로 형변환되면서 값손실이 발생함 300=100101100, 근데 8자리만 남으니깐 00101100 = 44
        System.out.println(c);
    }
}
