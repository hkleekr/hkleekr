public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];            // 길이가 3인 Tv객체 배열

        // Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장
        for(int i=0; i< tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;     // tvArr[i]의 channel에 i+10을 저장  10, 11, 12가 저장됨
        }

        for(int i=0; i< tvArr.length; i++) {
            tvArr[i].channelUp();          // channelUp()을 통해 11, 12, 13이 됨
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}
