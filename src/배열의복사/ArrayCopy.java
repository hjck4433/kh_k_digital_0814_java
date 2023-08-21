package 배열의복사;
import java.util.Arrays;
// 자바의 배열은 한 번 선언하면 크기를 변경 할 수 없습니다. (정적 할당 / 동적 할당 불가)
// 배열의 크기를 변경하기 위해서는 더 큰 배열을 만들고 기존 배열의 데이터를 옮겨 담아야 합니다.
// arraycopy() : System.arraycopy(Object src, int scrPos, Object dest, int destPos, int length);
// copyOf() : 배열을 원하는 길이 만큼 새로운 배열로 복사
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
//        int newLen = 10;
//        int[] arr2 = new int[newLen];
//        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//        for(int e : arr2) System.out.print(e + " ");

        int[] arr3 = Arrays.copyOf(arr1, 10);
        for(int e : arr3) System.out.print(e + " ");

        // 얕은 복사는 같은 주소를 바라보기 때문에 한쪽의 값이 바뀌면 다른 쪽도 값이 바뀜


    }
}
