package 변수의스코프;
// 변수가 할당되고 사용되는 범위 확인

public class VarScopeClass {
    public static void main(String[] args) {
        int value = 10; // int 형으로 선언된 value 변수에 10을 대입
        int sum = value + 20; // int 형으로 선언된 sum에 value의 값 + 20;
        System.out.println("sum의 값 : " + sum);

        int n = 20;
        int m = 30;
        if (n > 10) { // 블록 스코프
            //int m = 30;
            m = n - 10;
            System.out.println("m 값 : " + m);
        }
        int k = n + m;
        System.out.println("k 값 : " + k);

//        byte num1 = 127; //(-128 ~ 127) 128을 넣으면 overflow
//        num1++;
//        System.out.println(num1); // -128 => overflow가 발생하면서 최상위 비트가 1로 변하면서 -가 됨

//        // 8/16
//        // 문자 자료형 : 자바에서는 유니코드를 사용 (2Byte로 전세계의 모든 문자를 표시), 앞의 1바이트는 ASCII와 동일
//        char ch = 'A'; // 자바에서 문자는 작은 따옴표를 사용, 실제 저장은 정수값으로 저장 됨 ex) A = 65,
//        //String ch2 = "A"; //
//
////        System.out.println(ch);
////        System.out.println((int)ch); // 명시적으로 형을 int형으로 변경 함
//
//        char ch2 = 66; // char형은 음수가 올 수 없음
////        System.out.println(ch2); // B가 출력
////        System.out.println((int)ch2);
//
//        // 실수 자료형 : float(4Byte, 32bit), double(8Byte, 64bit), 근사치 계산법   //"B"yte(저장공간)  "b"it(속도)
////        float height = 175.5f; // 관례상 끝에 f를 붙임
////        double pi = 3.14159; // 기본
//
//        double num1 = 0.1;
//        for(int i =0; i < 1000 ; i++) {
//            num1 += 0.1;
//        }
//        System.out.println(num1); // 값이 절대 1이 나오지 않음 정확도가 떨어짐
//
//


    }
}
