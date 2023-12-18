package codingTest_study.programmer.level0;

public class x사이의개수 {
	
	// 231218
	// 문제
	// 문자열 myString이 주어집니다. 
	// myString을 문자 "x"를 기준으로 나눴을 때 
	// 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 
	// solution 함수를 완성해 주세요.
	
	class Solution {
	    public int[] solution(String myString) {
	        
	        String[] splitArr = myString.split("x", myString.length()); 
	        // split() 문자열을 나누어 배열에 저장하여 리턴
	        int[] answer = new int[splitArr.length];
	        
	        for(int i = 0; i < splitArr.length; i++){
	            
	            answer[i] = splitArr[i].length();
	           
	        }        

	        return answer;
	    }
	}

}
