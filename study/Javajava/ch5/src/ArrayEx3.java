public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i=0; i<arr.length; i++)
            arr[i] = i + 1;                            // arr에 1~5까지 저장

        System.out.println("[변경전]");
        System.out.println("arr.length: "+arr.length); // 변경 전의 arr길이 출력
        for (int i=0; i<arr.length;i++)
            System.out.println("arr["+i+"]: "+arr[i]);

        int[] tmp = new int[arr.length*2];             // 기존 배열의 2배 길이 새 배열(tmp) 생성

        for (int i=0; i<arr.length; i++)
            tmp[i] = arr[i];                           // tmp에 arr 값 복사

        arr = tmp;                                     // tmp에 저장된 값을 arr에 저장

        System.out.println("[변경후]");
        System.out.println("arr.length: "+arr.length);
        for (int i=0; i<arr.length;i++)
            System.out.println("arr["+i+"]: "+arr[i]);
    }
}
