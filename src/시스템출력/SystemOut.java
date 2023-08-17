package 시스템출력;
import java.util.Scanner;

// System.out : 표준 출력 스트림
// print, println : 오버로딩이 적용된 메소드 이며 줄바꿈 차이만 있음
public class SystemOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "수원시 ";
        int age = 22;
        char gender = 'M';
        int kor = 99, eng = 88, mat = 40;
        
        // 자바스타일 : 오버로딩으로 구현되어 있음
        System.out.println("=========Java Style=========");
        //System.out.print("=========Java Style=========\n");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat)); // 연산자 우선 순위를 변경해 먼저 덧셈을 수행
        // 연산자 우선 순위가 덧셈보다 나눗셈이 높아서 순서를 변경해야 함, ()사용해서 순서 변경
        System.out.println(("평균 : " + (/*(double)*/(kor + eng+ mat) / 3.0)));

        // C언어 스타일 : 서식을 지정하는 스타일
        System.out.println("=========C Style=========");
        // 서식지정자 : %d(decimal : 정수), %ld(long 타입 정수), %u(부호 없는 정수형), %f(실수형), %c(문자), %%(%)
        // 이스케이프 시퀀스 : \n(new line: 줄 바꿈), \r (carriage return : 커서를 라인의 처음으로 이동), \t(tab), \b(backspace)
        //                  \\(\)
        System.out.printf("이름 : %s\n", name);
        System.out.printf("오늘의 습도는 %.2f%% 입니다.\n", 85.5555); // 실수형 출력, 소수점 이하 2자리까지 출력
        System.out.printf("성별 : %c\n",gender); //문자 출력

        System.out.println("안녕하세요 \\ 저의 이름은 \"곰돌이사육사\" 입니다.");
        System.out.printf("평균 : %.2f\n", (/*(double)*/(kor + eng+ mat) / 3.0));

        System.out.println("Apple\rBanana\t Orange\b\b\n"); // \r ->커서가 앞으로 이동해서 덮어버림

        System.out.printf("|%-6d|%6d|%6d|\n", 100, 2000, 30000); // 6칸 확보하고 오른쪽 정렬 -를 하면 왼쪽 정렬


//        double pi = 3.14159144444;
//
//        System.out.println(age);
//        System.out.println(name);
//        System.out.printf("%s\n", name);
//        System.out.println(pi);
//        System.out.printf("%.2f\n",pi); // 소수점 2자리까지만

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n * n; i++) {
            System.out.printf("%4d", i);
            if(i % n == 0) System.out.println();
        }


    }
}
