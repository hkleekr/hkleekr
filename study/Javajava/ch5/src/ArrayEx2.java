import java.util.*;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};          // 선언 동시에 초기화
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i=0; i<iArr1.length; i++) {          // 0~9까지
            iArr1[i] = i + 1;
        }
        for (int i=0;i<iArr2.length; i++){
            iArr2[i] = (int)(Math.random()*10+1);    // 랜덤으로 생성
        }

        for (int i=0; i<iArr1.length;i++){
            System.out.print(iArr1[i]+",");         // for문 돌면서 출력  1,2,3,4,5,6,7,8,9,10,
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2)); // 메서드 사용(대괄호생김)  [5, 2, 3, 9, 6, 10, 2, 1, 8, 6]
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);                  // 참조주소 아니고, '타입@주소'형식으로 출력됨 [I@2f4d3709
        System.out.println(chArr);                  // char는 이렇게 출력되기로 했다고.. abcd
    }
}
