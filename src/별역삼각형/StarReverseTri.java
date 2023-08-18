package 별역삼각형;
//5
// * * * * *
// * * * *
// * * *
// * *
// *
import java.util.Scanner;

public class StarReverseTri {
    public static void main(String[] args) {
        // 입력을 위한 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 시작 별 개수 입력 변수 n 생성
        System.out.print("시작 별 개수 입력 : ");
        int n = sc.nextInt();

        while (n>=0) {
            for (int i = 0; i < n; i++){
                System.out.print(" * ");
            }
            System.out.println();
            n--;
        }

    }
}
