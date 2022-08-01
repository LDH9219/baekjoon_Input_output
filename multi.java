/*
 * 2588
 * 문제 : 곱셈할 세 자리 자연수가 주어질 때
 * 계산 과정의 값을 구하는 프로그램을 작성하시오.
 * 
 * 입력 : 세 자리 자연수 두개가 주어진다.
 * 출력 : 계산 과정 + 결과값을 출력한다.
 * 
 * 
 * 두 번째 자릿수를 구하는 방법
 * 참고 : https://st-lab.tistory.com/20
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.util.Scanner;
public class multi {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        br.close();
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //sc.close();

        System.out.println(a*(b%100%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}