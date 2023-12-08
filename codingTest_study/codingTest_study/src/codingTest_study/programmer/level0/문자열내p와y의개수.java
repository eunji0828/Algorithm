package codingTest_study.programmer.level0;

public class 문자열내p와y의개수 {
	
	// 231209
	// 문제
	// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
	// s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 
	// 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 
	// 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
	// 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
	// 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 
	// false를 return합니다.
	
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        
	        // s 의 문자열을 모두 소문자로 바꿈
	        s = s.toLowerCase();
	        
	        // p,y 0을 대입
	        int p = 0;
	        int y = 0;

	        for(int i = 0; i < s.length(); i++){
	            
	        	// s 의 문자열 중 p가 있다면
	            if(s.charAt(i) == 'p') {
	                p++;
	                
	                // s의 문자열 내 y가 있다면
	            } else if(s.charAt(i) == 'y'){
	                y++;
	            }
	            
	        }
	        
	        // p와 y가 같지 않다면
	        if(p != y){
	            answer = false;
	        } else {
	        	// 같다면?
	            answer = true;
	        }

	        return answer;
	    }
	}

}
