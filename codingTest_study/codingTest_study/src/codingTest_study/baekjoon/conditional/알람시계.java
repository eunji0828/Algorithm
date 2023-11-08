package codingTest_study.baekjoon.conditional;

import java.util.Scanner;

public class 알람시계 {

	public static void main(String[] args) {
		// 231016
		// 문제
		// 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
		// 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 
		// 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
		// 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 
		// 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			h--;
			m = 60 - (45 - m);
			
			if(h < 0) {
				h = 23;
			}
			
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m - 45));
		}

	}

}
