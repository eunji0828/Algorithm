package codingTest_study.programmer.level0;

public class 숫자찾기 {
	
	// 231204
	// 문제
	// 정수 num과 k가 매개변수로 주어질 때, 
	// num을 이루는 숫자 중에 k가 있으면 
	// num의 그 숫자가 있는 자리 수를 return하고 
	// 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
	
	class Solution {
	    public int solution(int num, int k) {
	       
	        String numStr = String.valueOf(num);
	        String kStr = String.valueOf(k);
	        
	        int answer = numStr.indexOf(kStr);
	        
	        // 삼항연산자
	        //  					자릿수를 리턴하라고 했으니 +1 해주어야함
	        return answer < 0 ? -1 : answer +1;
	    }
	}

}
