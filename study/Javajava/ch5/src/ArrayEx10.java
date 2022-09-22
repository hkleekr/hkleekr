public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i<numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()*10));  // 임의의 숫자로 채워넣기
        }
        System.out.println();

        for(int i=0; i<numArr.length-1; i++) {
            boolean changed = false;              // 자리바꿈 했는지 체크

            for(int j=0; j<numArr.length-1-i; j++) {
                if(numArr[j] > numArr[j+1]) {     // 왼쪽 값이 더 크면 바꾼다.
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    changed = true;
                }
            }
            if (!changed) break;                 // 자리바꿈 없으면 빠져나와라

            for(int k=0; k<numArr.length; k++)
                System.out.print(numArr[k]);
            System.out.println();
        }
    }
}
