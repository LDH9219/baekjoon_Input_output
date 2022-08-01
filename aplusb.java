/* 
 * 1000
 * 문제 : 두 정수 A와 B를 입력받은 다음
 * A+B를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다.
 * 출력 : 첫째 줄에 A+B를 출력한다.
 * 
 * 주어진 두 정수 A,B를 Scanner를 통하여 입력받아
 * 출력하도록 작성한다.
 * Scanner 선언 -> A,B 입력 -> 스캐너 폐쇄 -> A+B출력
 */


import java.util.Scanner;

public class aplusb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(a+b);
    }
}