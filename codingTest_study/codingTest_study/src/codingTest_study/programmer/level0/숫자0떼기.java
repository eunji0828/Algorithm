package codingTest_study.programmer.level0;

public class 숫자0떼기 {
	
	// 230904
	// 문제
	// 정수로 이루어진 문자열 n_str이 주어질 때, 
	// n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 
	// return하도록 solution 함수를 완성해주세요.
	
	class Solution {
	    public String solution(String n_str) {
	        String answer = "";
	        
	        int i = Integer.parseInt(n_str);
	        answer = i + "";
	        
	        return answer;
	    }

}
}
	
	// i 변수를 만들고 n_str변수를 숫자로 형변환
