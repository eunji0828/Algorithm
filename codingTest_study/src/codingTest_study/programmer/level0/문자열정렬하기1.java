package codingTest_study.programmer.level0;

import java.util.Arrays;

public class 문자열정렬하기1 {
	
	// 230914
	// 문제
	// 열 my_string이 매개변수로 주어질 때, 
	// my_string 안에 있는 숫자만 골라 오름차순 
	// 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
	
	class Solution {
	    public int[] solution(String my_string) {
	    	my_string = my_string.replaceAll("[a-zA-Z]", ""); 
	        
	        String[] arr = my_string.split("");
	        int[]answer = new int[arr.length];
	        
	        for (int i = 0; i < arr.length; i++) {
	        	answer[i] = Integer.parseInt(arr[i]);
			}
	        Arrays.sort(answer);
	        
	    	return answer;
	    }
	}
	
	// replaceAll 정규표현식을 통해 a-zA-Z를 통해 문자를 없앤 후
	// split() 함수는 입력받은 문자열을 배열로 리턴
	// arr의 배열 길이만큼 answer의 길이를 설정
	// for문을 돌려 answer의 형변환을 통해 sort()함수를 통해 정렬!

}
