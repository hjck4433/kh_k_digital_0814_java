package 문자열반전;
import java.util.Scanner;

// 문자열을 입력 받음 : abcd -> dcba
// 문자열의 길이는 length()로 확인 가능
public class CharacterReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = sc.next();
        int pos = input.length() - 1; // 마지막 위치의 인덱스 값은 길이 -1

        while(pos > -1) {
            System.out.print(input.charAt(pos));
            pos--;
        }

        for(int i = pos; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

    }
}
