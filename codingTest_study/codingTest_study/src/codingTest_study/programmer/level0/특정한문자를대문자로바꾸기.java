package codingTest_study.programmer.level0;

public class 특정한문자를대문자로바꾸기 {
	
	// 230817
	// 문제
	// 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 
	// 문자열 alp가 매개변수로 주어질 때, my_string에서 alp에 해당하는 
	// 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
	
	// 나는 for문 돌려서 contains(), toUpperCase()사용했는데..
	// 더 쉽게 하는 방법이 있었다
	
	 public String solution(String my_string, String alp) {
	        String answer = "";
	        answer = my_string.replace(alp, alp.toUpperCase());
	        return answer;
	    }
	 
	 // 대체하기..

}
