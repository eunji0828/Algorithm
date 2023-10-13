package codingTest_study.programmer.level0;

public class 문자열로변환 {
	
	// 230818
	// 문제
	// 정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
	
    public String solution(int n) {
        String answer = "";
        
        answer = Integer.toString(n);
        
        return answer;
    }
    
    
    // answer = String.valueOf(n) 도 가능

}
