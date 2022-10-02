public class InstanceofTest {
    public static void main(String[] args) {
        MyFireEngine fe = new MyFireEngine();

        if(fe instanceof MyFireEngine) {
            System.out.println("This is a MyFireEngine instance.");
        }

        if(fe instanceof MyCar) {
            System.out.println("This is a MyCar instance.");
        }

        if(fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }
        System.out.println(fe.getClass().getName());
    }
}
class MyCar {}
class MyFireEngine extends MyCar {}
