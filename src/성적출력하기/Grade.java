package 성적출력하기;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        // 입력을 위한 스캐너 생성

        Scanner sc = new Scanner(System.in);
        // 내 풀이
//        System.out.print("성적을 입력하세요 : ");
//        int score = sc.nextInt();

//        if ( score < 101 && score >=90 ) {
//            System.out.println("성적 : A");
//        }else if (score <90 && score >= 80) {
//            System.out.println("성적 : B");
//        }else if (score <80 && score >= 70) {
//            System.out.println("성적 : C");
//        }else if (score <70 && score >= 60) {
//            System.out.println("성적 : D");
//        }else if (score <60 && score >=0) {
//            System.out.println("성적 : F");
//        }else {
//            System.out.println("성적이 잘못 입력 되었습니다.");
//        }

        //강사님 풀이
        // 입력을 받아서 정수형 변수에 대입
        // 조건문을 만드는데 우선, 0 ~ 100 사이의 정상적인 입력인지 확인
        while(true) {
            System.out.print("성적을 입력 하세요 : ");
            int score = sc.nextInt();
            if(score < 0 || score >100) continue; // 성적이 잘못입력 되었으면 재 입력 요구 => 다시 시작으로 돌아감
            // 정상적인 입력이었다면 각각의 성적 구간에 따라 학점 출력
            if(score >= 90) System.out.println("A");
            else if (score >= 80) System.out.println("B");
            else if (score >= 70) System.out.println("C");
            else if (score >= 60) System.out.println("D");
            else System.out.println("F");
            break;
        }


    }
}
