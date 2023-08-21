package 커맨드라인;
// main 메소드는 자바 프로그램의 시작 지점 입니다.
// CLI (Command Line Interface) : 입력   
// main 메소드에 대한 매개변수
public class CommandLineEx {
    // 설정 edit build and run 
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("프로그램 사용법");
            System.out.println("Java Main String Argument num1 num2");
            System.exit(0);
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1); // 문자열로 보기 때문에 int형으로 형변환
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
