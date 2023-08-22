package PC방알바;
import java.util.Scanner;
// 1 ~ 100 번까지의 컴퓨터
// 첫번째 줄 : 100보다 작거나 같은 손님 수
// 두번째 줄 : 손님 수 만큼의 원하는 자리 1 ~ 100
// 출력 : 거절당한 수

public class NetCafePartTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0; // 입력 받은 손님 수 / 배열의 크기
        while (true) {
            System.out.print("손님 수 입력 : ");
            n = sc.nextInt();
            if (n > 100) continue;
            break;
        }

        // 손님 수 만큼 원하는 자리 입력
        System.out.print("원하는 자리 입력 : ");
        int[] seat = new int[n]; // 손님 수 크기의 배열
        int index = 0; // 배열 인덱스
        int cnt = 0; // 중복 카운트
        int taken = -1; // 거절당한 자리

        while(true) {
            seat[index] = sc.nextInt(); // 자리 번호
            for (int i = 0; i <= index; i++) {
                if(seat[index] == seat[i] && index != i) {
                    cnt++;
                    seat[index] = taken;
                    taken--;
                }
                //System.out.print(cnt + "/ "); // 중복 카운트 확인
            }
            index++;
            if(index == n) break;
        }

        //for(int e : seat)System.out.print(e + " "); // seat 배열 확인
        //System.out.println();
        System.out.println("거절 당한 횟수 : " + cnt);
    }
}
