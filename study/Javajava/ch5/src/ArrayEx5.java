public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;                           // 총점 저장을 위한 변수
        float average = 0f;                    // 평균 저장을 위한 변수

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i<score.length; i++){
            sum += score[i];                    // 배열의 모든 값을 더함
        }
        average = sum / (float)score.length;   // 형변환해줌

        System.out.println("총점: "+sum);
        System.out.println("평균: "+average);
    }
}
