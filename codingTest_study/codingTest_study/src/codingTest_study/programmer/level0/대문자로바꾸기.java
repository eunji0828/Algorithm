package codingTest_study.programmer.level0;

public class 대문자로바꾸기 {
	
	// 230813
	// 문제
	// 알파벳으로 이루어진 문자열 myString이 주어집니다. 
	// 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
	
    public String solution(String myString) {
        String answer = "";
        answer = myString.toUpperCase();
        return answer;
    }
    
    
    // 문자열을 대문자로 변환 toUpperCase()
    // 문자열을 소문자로 변환 toLowerCase()

}
