package codingTest_study.baekjoon.loop;

import java.util.Scanner;

public class ab더하기 {

	public static void main(String[] args) {
		// 231018
		// 문제
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for(int i = 0; i < c; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);
		}

	}

}
