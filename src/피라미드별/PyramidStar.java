package 피라미드별;

import java.util.Scanner;

//        ________*________   1칸  1 n
//              *_*_*         5칸  2 (n+1)+3
//            *_*_*_*_*       9칸  3 (n+2)+6
//          *_*_*_*_*_*_*     13칸 4 (n+3)+9
//        *_*_*_*_*_*_*_*_*   17칸 5 (n+4)+12
public class PyramidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String star = "*";
        int n = 0;
        int bNum = 0; // 공백 수
        while(true){
            System.out.print("라인 수 입력 : ");
            n = sc.nextInt();
            if(n <= 1) {
                System.out.println("잘못 된 입력입니다. 2이상 정수를 입력 해 주세요");
            }else if (n == 2) {
                bNum = 2;
                break;
            }else {
                bNum = ((n*3)+(n-3)-1)/2;
                break;
            }
        }
        for (int i = 0; i < n ; i++){
            System.out.println("|"+" ".repeat(bNum) + star + " ".repeat(bNum)+"|");
            star = "* " + star + " *";
            bNum -= 2;
        }

    }
}
