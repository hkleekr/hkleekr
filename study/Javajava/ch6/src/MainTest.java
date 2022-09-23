public class MainTest {
    public static void main(String[] args) {
        main(null);                      // 무한호출로 stackoverflow에 빠져 비정상적 종료
    }
}
