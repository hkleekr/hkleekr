public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i=0; i<numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10);          // 길이가 10인 배열에 임의 값으로 초기화
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i<numArr.length; i++) {
            counter[numArr[i]]++;                          // numArr에 i가 몇개 있나 카운트
        }
        for(int i=0; i<numArr.length; i++) {
            System.out.println(i +"의 개수: "+counter[i]);
        }
    }
}
