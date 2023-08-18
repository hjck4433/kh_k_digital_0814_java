package 배수구하기;
// 1 ~ 1000사이의 7의 배수를 구하고 한줄에 10개 항목씩 출력 하기
public class TimesTest {
    public static void main(String[] args) {
         //for 반복문으로 1 ~ 1000사이 반복 수행
        for(int i = 1 ; i <= 1000; i++) {
            // 조건문의 내부 조건으로 값이 7로 나누어서 나머지가 0이면 출력
            if(i % 7 == 0) {
                System.out.printf("%5d",i);
                // 10개 출력 이후 줄바꿈이 필요
                if(i % 10 == 0) System.out.println();
            }
        }

        // 강사님 풀이
//        for (int i = 1; i <= 1000; i++){
//            if(i % 7 == 0) {
//                System.out.printf("%5d",i);
//                if(i % 70 == 0) System.out.println();
//            }
//        }
//        int cnt = 0;
//        for(int i = 7; i < 1000 ; i+=7){
//            cnt++;
//            System.out.printf("%5d",i);
//            if(cnt == 10) {
//                System.out.println();
//                cnt = 0;
//            }
//        }




    }
}

