package codingTest_study.programmer.level0;

import java.util.Scanner;

public class 덧셈식출력하기 {
	
	// 230918
	// 문제
	// 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
	// a + b = c
	// 제한사항
	// 1 ≤ a, b ≤ 100
	
	public class Solution {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = a+b;

	        System.out.println(a + " + " + b + " = " + c);
	        
	        
	    }
	}

}
