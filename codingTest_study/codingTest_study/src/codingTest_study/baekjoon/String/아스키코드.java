package codingTest_study.baekjoon.String;

import java.util.Scanner;

public class 아스키코드 {

	public static void main(String[] args) {
		// 231110
		// 문제
		// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		
		
		Scanner sc = new Scanner(System.in);
		
		char s = sc.next().charAt(0);
		
		int num = (int) s;
		
		System.out.println(num);
		
	}

}
