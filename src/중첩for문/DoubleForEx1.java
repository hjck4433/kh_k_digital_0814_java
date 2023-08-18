package 중첩for문;
// 이중 반복문 :
public class DoubleForEx1 {
    public static void main(String[] args) {
        for(int i = 0; i < 10 ; i++) {
            System.out.printf("|i=%d| ", i);
            for(int j = 0; j < 10; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10 ; j++) {
//                System.out.printf("%d x %d = %d\n", i, j, (i*j));
//            }
//            System.out.println();
//        }

    }
}

/* 빅오표기법

 - O(1) 처리해야 할 데이터양과 상관없이 항상 일정한 실행 시간을 갖는 알고리즘  (이상적)
    ex) Hash function => 임의의 값 => 메모리 주소값 (메모리의 한계로 중복이 될 수 밖에 없음)
    ex) 배열의 주소, index를 알고 있는 경우

 - O(logN) 검색할때마다 로그만큼 빨라지는 경우
    ex) 정렬된 데이터 중 n번째 값을 찾는 경우 / 중간 기준으로 제외시켜감 (반씩 줄어들어 감)       이진트리?

 - O(N) 처리해야 할 데이터양과 비례해 실행 시간이 증가 (1부터 100까지 더하는 반복문)
    ex) 정렬되지 않은 1~10000개의 데이터 중 5000번째 값을 찾는 경우 값이 10000번째에 등장 할 수도 있음

 - O(NlogN) 처리해야 할 데이터양보다 실행 시간이 좀 더 빠르게 증가. 
   ex) 퀵정렬, 병합정렬, 분할정렬/ 정렬을 수행 할 때 N만큼 걸리고 그 이후에 logN만큼 걸림   
   
 - O(N2) 이중for문으로 이루어진 경우
   ex) 버블정렬
   
 - O(N3) 삼충for문으로 이루어진 경우

* */