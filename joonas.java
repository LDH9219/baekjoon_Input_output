/*
 * 10926
 * 문제 : 놀람을 표현하는 프로그램을 작성하시오.
 * 입력 : 아이디가 주어진다.
 * 출력 : 아이디 + ??!
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class joonas {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        System.out.println(a+"??!");
    }
}