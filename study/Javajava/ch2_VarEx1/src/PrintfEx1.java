public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d%n", b);                 // byte인 b를 10진수로
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d%n", c, (int)c);     // %c: 문자로 출력, 'A'의 유니코드 값이 65인 모양임, char타입 값을 %d지시자로 출력할 때 형변환이 꼭 필요함
        System.out.printf("finger=[%5d]%n", finger);    // [%5] 5자리 맟추는데, 오른쪽 정렬
        System.out.printf("finger=[%-5d]%n", finger);   // [%-5] 5자리 맟추는데, 왼쪽 정렬
        System.out.printf("finger=[%05d]%n", finger);   // [%05] 5자리 맟추는데, 앞을 0으로 채워라
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);                   // '#': 접두사
        System.out.printf("octNum=%o, %d%n", octNum, octNum);  // %o: 8진수 출력, %d: 10진수 출력
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);  // %o: 8진수 출력, %d: 10진수 출력
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // %s: 문자열 출력, %d: 10진수 출력
    }
}
