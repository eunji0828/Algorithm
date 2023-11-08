package codingTest_study.baekjoon.loop;

import java.util.Scanner;

public class 합 {

	public static void main(String[] args) {
		// 231018
		// 문제
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			sum = sum + i;
			
		}
		
		System.out.println(sum);

	}

}
