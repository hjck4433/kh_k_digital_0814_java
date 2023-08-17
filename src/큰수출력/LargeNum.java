package 큰수출력;

import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        //세자리의 정수를 이력 받아 가장 큰 수 출력

        Scanner sc = new Scanner(System.in);
//        System.out.print("세자리 정수를 입력해 주세요 : ");
//        int num = sc.nextInt();
//        int num1 = num / 100;
//        int num2 = (num / 10) % 10;
//        int num3 = num % 10;
//
//        if (num1 > num2) {
//            int largeNum = (num1 > num3) ? num1 : num3;
//            System.out.println("가장 큰 수 : " + largeNum);
        //    System.out.println((num1 > num3) ? num1 : num3);
//        }else {
//            int largeNum = (num2 > num3) ? num2 : num3;
//            System.out.println("가장 큰 수 : " +  largeNum);
//        }
        
        // 강사님 풀이
        int num; // 100의 자리 정수 입력 받기 위한 변수
        int a, b ,c ; // 100, 10, 1의 자리 값을 담기 위한 변수
        //스캐너
        System.out.print("100의 자리 정수 입력 : ");
        num = sc.nextInt();
        a = num / 100 ;       // 100으로 나눈 몫을 담음
        b = (num % 100) / 10; // 100으로 나눈 나머지를 다시 10으로 나누어서 담음
        c = num % 10;         // 10으로 나눈 나머지를 담음

        if(a>b) {
            if(a > c) System.out.print(a);
            else System.out.print(c);
//            System.out.println(Math.max(a, c)); 더 간단한 방법
        }else {
            if(b > c) System.out.println(b);
            else System.out.println(c);
        }
    }
}
