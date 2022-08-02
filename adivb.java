/*
 * 1008
 * 문제 : 두 정수 A와 B를 입력받은 다음
 * A/B를 출력하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 A와 B가 주어진다.(0<A,B<10)
 * 출력 : 첫째 줄에 A/B를 출력한다.
 * 
 * 정수를 입력받기 위해 Scanner를 import 한다
 * Scanner 선언 후 두 정수를 입력받는다
 * Scanner를 폐쇄한다
 * A/B를 출력한다.
 */

import java.util.Scanner;

public class adivb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();
        System.out.println(a/b);
    }
}