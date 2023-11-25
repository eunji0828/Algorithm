package codingTest_study.programmer.level0;

public class 더크게합치기 {
	
	// 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 
	// 예를 들면 다음과 같습니다.
	// 12 ⊕ 3 = 123
	// 3 ⊕ 12 = 312
	// 양의 정수 a와 b가 주어졌을 때, 
	// a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 
	// solution 함수를 완성해 주세요.
	// 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
	
	//toString() : null 값을 형 변환 시 NullPointerException(NPE)이 발생 / Object의 값이 String이 아니여도 출력
	// String.valueOf() : 파라미터로 null이 오면 "null"이라는 문자열을 출력
	
	
	class Solution {
	    public int solution(int a, int b) {
	        int answer = 0;
	        
	        String ab = String.valueOf(a) + String.valueOf(b);
	        String ba = String.valueOf(b) + String.valueOf(a);
	        
	        if(Integer.parseInt(ab) >= Integer.parseInt(ba)) {
	            answer = Integer.parseInt(ab);
	            return answer;
	        } else{
	            answer = Integer.parseInt(ba);
	            return answer;
	        }
	        
	    }
	}

}
