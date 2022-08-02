/*
 * 18108
 * 문제 : 불기연도가 주어질 때
 * 서기연도로 바꿔주는 프로그램을 작성하시오.
 * -543year
 * 입력 : 불기연도가 주어진다.
 * 출력 : 불기연도를 서기연도로 변환한 결과를 출력한다.
 * 
 * Scanner import 선언
 * 불기연도 입력
 * 불기연도 - 543 = 서기연도
 * Scanner close
 * 서기연도 출력
 */

import java.util.Scanner;

public class buddhistyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(a-543);
    }
}