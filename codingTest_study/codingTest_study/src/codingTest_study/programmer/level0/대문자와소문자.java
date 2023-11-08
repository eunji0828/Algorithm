package codingTest_study.programmer.level0;

public class 대문자와소문자 {
	
	// 230913
	// 문제
	// 문자열 my_string이 매개변수로 주어질 때, 
	// 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
	
	class Solution {
	    public String solution(String my_string) {
	        String answer = "";
	        
	        for(int i = 0; i<my_string.length(); i++){
	            if(Character.isUpperCase(my_string.charAt(i))){
	               answer += String.valueOf(my_string.charAt(i)).toLowerCase();
	            } else {
	                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
	            }
	        }
	        return answer;
	    }
	    
	    // Character.isUpperCase 입력받은 문자가 영문 대문자인지 판단하여 true, false 리턴
	    // Character.isLowerCase 입력받은 문자가 영문 소문자인지 판단하여 true, false 리턴
	    // charAt(i) // 그 문자열의 인덱스의 값을 가져옴
	}
}
