package codingTest_study.baekjoon.conditional;

import java.util.Scanner;

public class 두수비교하기 {

	public static void main(String[] args) {
		// 231014
		// 문제
		// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if(a>b) {
			System.out.println(">");
		} else if(a<b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}

	}

}
