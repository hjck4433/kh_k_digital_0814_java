package 알람설정하기;

import java.util.Scanner;

public class AlarmSet {
    public static void main(String[] args) {
        // 시간과 분을 입력 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 시간과 분을 각각 입력 받음
//        System.out.print("시간 : ");
//        int h = sc.nextInt();
//        System.out.print("분 : ");
//        int m = sc.nextInt();

        // 45분을 빼야 되므로 시간과 분을 총 몇 분이지 환산하고 거기서 45를 빼줌

        // 45분전으로 시간이 바뀌는 경우
//        if(m-45 < 0) {
//            m = 60 + (m-45);
//            if(h == 0) h = 23; // 입력받은 h(시간)이 0이면 23으로 변경
//            else h--; // 그외는 입력 받은 시간 -1
//        }else {
//            m -= 45; // 시간을 바꿀 필요가 없으므로 입력 받은 m(분)에서 45를 빼 줌
//        }
//        System.out.println(h + "H " + m + "M");

        //강사님 풀이
        // 시간과 분을 각가 입력 받음
        System.out.print("시간 분 입력 : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        // 45분을 빼야 되므로 시간과 분을 총 몇 분이지 환산 함
        int totalMin = hour * 60 + min;
        // 계산된 시간이 45분 보다 작으면 하루 전날 이므로 하루의 시간 만큼 더해줌
        if (totalMin < 45) {
            totalMin = 24 * 60 + totalMin;
        }
        // 계산된 시간에서 45를 빼줌
        totalMin -= 45;
        // 결과를 시간과 분으로 환산해서 출력 해줌(몫과 나머지 계산으로 구함)
        System.out.println((totalMin / 60) + "시" + (totalMin % 60) + "분");

    }
}
