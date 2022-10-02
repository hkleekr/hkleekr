public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;       // car = (Car)fe; 형변환 생략 업캐스팅
//        car.water();    // ERROR!! Car타입의 참조변수로는 water()를 호출할 수 없음
        fe2 = (FireEngine) car;   // 다운캐스팅 형변환, 조상타입->자손타입
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Brrrr~");
    }

    void stop() {
        System.out.println("Stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}