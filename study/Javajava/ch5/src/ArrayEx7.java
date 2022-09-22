public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i<numArr.length; i++) {
            numArr[i] = i;                         // 배열을 0~9까지 초기화
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i<100; i++) {
            int n = (int)(Math.random()*10);       // 0~9 값을 임의로 얻는다
            int tmp = numArr[0];                   // Shuffle. numArr의 0번째와 n번째를 바꿨다.
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for(int i = 0; i<numArr.length; i++)
            System.out.print(numArr[i]);
    }
}
