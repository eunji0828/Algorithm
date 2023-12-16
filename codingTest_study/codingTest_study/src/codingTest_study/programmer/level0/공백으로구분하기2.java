package codingTest_study.programmer.level0;

public class 공백으로구분하기2 {
	
	// 231216
	// 문제
	// 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 
	// 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 
	// return 하는 solution 함수를 작성해 주세요.
	
	class Solution {
	    public String[] solution(String my_string) {
	       
	        my_string = my_string.trim();
	        
	        String[] answer = my_string.split("\\s+");
	       // 정규표현식 
	       // 단일 공백 문자를 구분
	       
	        return answer;
	    }
	}

}
