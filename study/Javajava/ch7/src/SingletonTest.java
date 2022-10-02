final class Singleton {
    private static Singleton s = new Singleton();     // 객체 private
    private Singleton() {                             // 생성자 private
        // ...
    }
    public static Singleton getInstance() {
        if(s==null)
            s = new Singleton();
        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();  // Singleton클래스 자체는 상속불가, 대신 getInstance를 가져오는 것임
    }
}
