/*
 * 1001
 * 문제 : 두 정수 A와 B를 입력받은 다음
 * A-B를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다.(0<A,B<10)
 * 출력 : 첫째 줄에 A-B를 출력한다.
 * 
 * 두 정수를 입력받기 위한 Scanner를 import
 * Scanner 선언
 * 두 정수 값 입력받기
 * Scanner 폐쇄
 * A-B 출력
 */
import java.util.Scanner;

public class aminusb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(a-b);
    }
}
