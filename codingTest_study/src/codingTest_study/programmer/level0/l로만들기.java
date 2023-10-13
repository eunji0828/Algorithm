package codingTest_study.programmer.level0;

public class l로만들기 {
	
public static void main(String[] args) {
		
		String myString = "addfedgg";
        String answer = "";
        answer = myString.replaceAll("[a-kA-K]","l");
        System.out.println(answer);
       
        // 처음에 l을 i대문자로 봐서.. 오류가 나서 왜 안되나 했더니 
		// 소문자 L인걸 알았당

	}
	
	// 230907
	// 문제
	// 알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 
	// 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 
	// 하는 solution 함수를 완성해 주세요.
	
	class Solution {
	    public String solution(String myString) {
	        String answer = "";
	         answer = myString.replaceAll("[a-kA-K]","l");
	        return answer;
	    }
	}
	
	// 처음에 l을 i대문자로 봐서.. 오류가 나서 왜 안되나 했더니 
	// 소문자 L인걸 알았당

}
