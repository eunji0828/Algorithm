package codingTest_study.baekjoon.inout;

import java.util.Scanner;

public class 사칙연산 {

	public static void main(String[] args) {
	
		// 231013
		// 문제
		// 두 자연수 A와 B가 주어진다. 이때, 
		// A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

	}

}
