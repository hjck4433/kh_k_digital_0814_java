package 비트연산자;
// 주로 하드웨어 제어에 사용 됨

// 비트 연산자는 비트 단위의 연산을 수행 합니다.
// AND : & 비교하는 두개의 비트가 모두 1이어야 1이 됨
// OR : | 비교하는 두개의 비트가 한쪽만 1이면 1이 됨
// XOR : ^ 비교하는 두 비트가 서로 다른 경우만 1이 됨
// NOT : ~ 현재의 비트의 값을 반전 시킴
// 왼쪽 쉬프트 : << 비트를 왼쪽으로 이동 시킴
// 오른쪽 쉬프트 : >> 비트를 오른쪽으로 이동 시킴

public class BitOperate {
    public static void main(String[] args) {
        int num1 = 10; // 00001010
        int num2 = 12; // 00001100

        System.out.println(num1 & num2); // 8  00001000
        System.out.println(num1 | num2); // 14 00001110
        System.out.println(num1 ^ num2); // 6  00000110
        System.out.println(~num1);      // -11 11110101 // 1을 더해서 반전
        System.out.println(num1 << 1);  //  20 00010100 // 1이동하면 * 2 효과
        System.out.println(num1 >> 1);   // 5  00000101 // 1이동하면 / 2 효과
        
    }
}
