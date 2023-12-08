package codingTest_study.programmer.level0;

public class 자릿수더하기 {
	
	// 231208
	// 문제
	// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
	

	// 첫번째 방법
	// toString()
	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        String s = Integer.toString(n);
	
	        for(int i = 0; i < s.length(); i++){
	            answer += Integer.parseInt(s.substring(i, i+1));
	        }
	            
	        return answer;
	    }
	}
	
	// 두번째 방법
	// 정수로 나누기
	public class Solution2{
		
		 public int solution(int n) {
		     int answer = 0;
		        
		     while(n > 0) {
		    	 answer += n%10;
		    	 n/=10;
		     }
		        
		     return answer;
		
	}

}
	
}
