package codingTest_study.programmer.level0;

import java.util.Arrays;

public class 배열자르기 {
	
	// 230808
	// 문제
	// 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
	// numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 
	// return 하도록 solution 함수를 완성해보세요.
	
	
	class Solution {
	    
	    // i번 숫자부터 j번째 숫짜까지 자르려고 한다면 
	    // 아래와 같은 방법으로 사용할 수 있다.
	    // Arrays.copyOfRange(배열, from, to)
		
	    public int[] solution(int[] numbers, int num1, int num2) {
	        int[] answer = {};
	        answer = Arrays.copyOfRange(numbers, num1, num2+1);
	        return answer;
	    }

	}
}
