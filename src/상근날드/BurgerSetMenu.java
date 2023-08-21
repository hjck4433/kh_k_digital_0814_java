package 상근날드;
import java.util.Scanner;
// 문제 요약 : 햄버거 3개와 음료 2개를 연속으로 입력 받아, 햄버거 중 가장 작은 값, 음료 2개 중 작은 값을 찾음
// 작은 값을 더하고 세트 메뉴 이기 때문에 50원 빼서 금액을 구함
public class BurgerSetMenu {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 햄버거 가격을 담을 배열
//        int[] b = new int[3];
//        // 음료 가격을 담을 배열
//        int[] d = new int[2];
//
//        // 버거 가격 입력
//        System.out.print("상덕버거 가격 : ");
//        b[0] = sc.nextInt();
//        System.out.print("중덕버거 가격 : ");
//        b[1] = sc.nextInt();
//        System.out.print("하덕버거 가격 : ");
//        b[2] = sc.nextInt();
//
//        // 음료 가격 입력
//        System.out.print("콜라 가격 : ");
//        d[0] = sc.nextInt();
//        System.out.print("사이다 가격 : ");
//        d[1] = sc.nextInt();
//
//        // 가장 저렴한 버거
//        int lowCostB = 0;
//
//        if (b[0] < b[1]) {
//            lowCostB = b[0] < b[2] ? b[0] : b[2];
//
//        }else lowCostB = b[1] < b[2] ? b[1] : b[2];
//
//        // 가장 저렴한 음료
//        int lowCostD = d[0] < d[1] ? d[0] : d[1];
//
//
//        System.out.println("가장 저렴한 세트 가격 : " + ((lowCostB + lowCostD)-50));

        // 강사님 풀이
        // 5개의 값을 입력 받기 위해 배열 생성
        int[] menu = new int[5]; // 햄버거 3개, 음료 2개
        // 키보드 입력을 받기 위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴 입력 : ");
        for (int i = 0; i < menu.length; i++) menu[i] = sc.nextInt(); // 햄버거 3개, 음료 2개 금액을 입력 받음
        int minBurger = menu[0]; // 햄버거 중에 제일 싼 메뉴를 찾기 위한 시작 값
        int minDrink = menu[3]; // 음료 중 제일 싼 메뉴를 찾기 위한 시작 값
        for(int i = 0; i < menu.length; i++) {
            if(i < 3 && minBurger > menu[i]) minBurger = menu[i];
            if(i > 2 && minDrink > menu[i]) minDrink = menu[i];
        }
        System.out.println(minBurger + minDrink - 50);


    }
}
