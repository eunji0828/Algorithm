package codingTest_study.baekjoon.inout;

import java.util.Scanner;

public class 곱셈 {

	public static void main(String[] args) {
		// 231014
		// 문제
		// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
		// (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = (b % 10) * a;
		int d = ((b % 100) / 10) * a;
		int e = (b / 100) * a;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a * b);
		

	}

}
