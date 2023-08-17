package 변수와자료형;
// 변수란 ? 값을 저장할 수 있는 메모리 공간에 이름을 붙이는 것
public class DataTypeClass {
    public static void main(String[] args) {
        int age; // 정수형 변수 선언, 4byte(32bit) 공간을 확보하고 초기값은 아직 없음, 정수값(소수점 이하가 없음)을 저장하는 목적
        double value; // 실수값을 저장하기 위한 변수 선언
        
        char gender = 'M'; // 선언과 동시에 초기화, gender라는 변수에 문자 M을 대입한다는 의미 (2byte)
        
        // 논리형 변수 선언 : 참과 거짓을 판별하기 위해서 사용하는 자료형 자바는 0/1이 아닌 true false 값을 가짐
        boolean isTrue; // boolean isTrue = 0; 사용 불가 / true, false의 예약어만 사용 할 수 있음

        //정수형 변수 선언 : 소수점 이하가 없고 양수와 음수가 존재
        byte bNum;  // 1Byte크기의 변수 선언 1Byte == 8bit (-128 ~ +127)
        short sNum; // 2Byte 크기의 변수 선언 2Byte == 16bit
        int iNum;  // 4Byte 크기의 변수 선언 4Byte == 32bit 제일 빠름 (JVM이 4byte 기준)(기본)
        long lNum; // 8Byte 크기의 변수 선언 8Byte == 64bit 약21억 이상의 값이 예상되는 경우 사용

        // 실수형 변수 선언 : 근사치 계산법으로 컴파일러 마다 약간의 오차가 발생할 수 있음/ 조건문의 기준으로 사용 불가/ 사용 최소화
        float fNum;  // 4Byte
        double dNum; // 8Byte (기본)
        
        
        int num1, num2; // 같은 타입의 변수를 동시에 선언할 수 있음 (콤마로 구분)
        double num3 = 3.14; // 선언과 동시에 값을 초기화 함
        double num4 = 1.23, num5 = 4.56;
        int hour = 4;
        int minute = 50;
        System.out.println(hour + "시간" + minute + "분");
        
        
        //변수명
        /*사용 불가
        int 1st; 숫자가 앞에오면 안됨
        int class;class는 예약어
        int a@; 특수문자는 _, $만 가능*/

        //사용 가능
        int st1;
        int a$$$$;
        int _____1234;
        int $$$$____;

        // 사용규칙
        int taxRate; // camel 표기법 : 자바는 카멜 표기법을 사용 합니다. *class(대문자로 시작)와 구분하기 위함 
    }

    class NameCard {
        String name;
        String address;
        String eMail;
        String phoneNum;
    }
}
