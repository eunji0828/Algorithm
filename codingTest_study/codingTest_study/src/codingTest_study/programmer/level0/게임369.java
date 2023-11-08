package codingTest_study.programmer.level0;

public class 게임369 {
	
	// 231007
	// 문제
	// 머쓱이는 친구들과 369게임을 하고 있습니다. 
	// 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 
	// 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 머쓱이가 말해야하는 숫자 order가 
	// 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 
	// 함수를 완성해보세요.
	
	class Solution {
	    public int solution(int order) {
	        int answer = 0;
	        String num = String.valueOf(order); 
	        // 문자열로 변환
	        
	        for(int i = 0; i < num.length(); i++){
	            String a = String.valueOf(num.charAt(i));
	            
	            if(a.equals("3") || a.equals("6") || a.equals("9")){
	                // contains는 문자열 안에 포함되어있는지 찾는 것이고
	            	// euqals는 값이 같은지 확인하는 것이기 때문에
	            	// 이런 상황에서는 euqals()를 사용하는 것이 맞다.
	                answer += 1; 
	                
	            }
	            
	        }
	        
	        return answer;
	    }
	}

}
