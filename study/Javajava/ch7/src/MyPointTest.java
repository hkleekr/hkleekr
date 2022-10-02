public class MyPointTest {
    public static void main(String[] args) {
        MyPoint3D p3 = new MyPoint3D(1, 2, 3);
    }
}

class MyPoint {
    int x, y;

//    MyPoint() {}                      // MyPoint에 기본생성자를 생성해주었더니, MyPoint3D생성자쪽에서 에러가 안났다.
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x: "+x+", y: "+y;
    }
}
class MyPoint3D extends MyPoint {
    int z;

    MyPoint3D(int x, int y, int z) {
//        this.x = x;
//        this.y = y;
        super(x, y);                           // 아니면, 조상클래스의 생성자를 호출하던가..
        this.z = z;
    }
    String getLocation() {
        return "x: "+x+", y: "+y+", z: "+z;
    }
}
