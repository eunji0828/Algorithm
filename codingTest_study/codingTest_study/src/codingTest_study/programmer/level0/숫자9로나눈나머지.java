package codingTest_study.programmer.level0;

public class 숫자9로나눈나머지 {

	// 231205
	// 문제
	// 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 
	// 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
	// 이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때,
	// 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.

	class Solution {
	    public int solution(String number) {
	        int sum = 0;
	        
	        for(int i = 0; i < number.length(); i++){
	            
	            sum += Character.getNumericValue(number.charAt(i));
	            								// number 문자열에서 i 번째에 위치해 있는 문자
	            	// Character.getNumericValue 주어진 문자 ch의 숫자 값을 반환하는 메소드
	            	// sum에 해당 문자를 숫자로 변환하여 더해줌
	        }
	        
	        int answer = sum % 9;
	        return answer;
	    }
	}
	
}
