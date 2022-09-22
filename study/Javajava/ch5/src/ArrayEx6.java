public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];                            // 최대값 초기화
        int min = score[0];                            // 최소값 초기화

        for(int i=0; i<score.length;i++) {
            if(score[i] > max) {                       // max보다 큰 값이 발견되면 그 친구를 max에 저장
                max = score[i];
            } else if(score[i] < min){                 // min보다 작은 값이 발견되면 그 친구를 min에 저장
                min = score[i];
            }
        }
        System.out.println("최대값: "+max);
        System.out.println("최소값: "+min);
    }
}
