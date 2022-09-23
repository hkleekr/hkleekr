public class StaticBlockTest {
    static int[] arr = new int[10];                      // 클래스변수

    static {                                             // 클래스변수 초기화블럭
        for(int i=0; i<arr.length; i++) {
            // 1~10사이의 임의값을 배열 arr에 저장
            arr[i] = (int)(Math.random()*10) + 1;
        }
    }

    public static void main(String[] args) {
        for(int i=0; i<arr.length; i++)
            System.out.println("arr["+i+"] :"+arr[i]);
    }
}
