package N개의숫자합;

import java.util.Scanner;

// 첫째 줄에 숫자의 개수 N 입력.
// 둘째 줄에 N개의 숫자가 공백 없이 쓰여있다.

// 추출한 문자가 0이라면 '0';
public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        System.out.print("숫자의 개수 : ");
//        int n = sc.nextInt();
//        System.out.print(n+"개의 숫자를 공백 없이 입력 : ");
//        String nums = sc.next();
//
//        //System.out.print(nums.substring(0,1));
//
//        for(int i = 0; i < n ; i++) {
//            int num = (int)nums.charAt(i);
//            System.out.print(num);
//            sum += (num - 48);
//
//        }
//        System.out.println(sum);

        //강사님 풀이
        //int n = sc.nextInt();
        String number = sc.next();
        int sum = 0;
        for(int i = 0; i < number.length() /*n*/; i++) {
            sum += number.charAt(i) - '0';
        }
        System.out.println(sum);

//        int ex = '4';
//        System.out.println(ex);

    }
}
