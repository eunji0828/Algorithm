package codingTest_study.programmer.level0;

public class 홀수vs짝수 {
	
	// 230918
	// 문제
	// 정수 리스트 num_list가 주어집니다. 
	// 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째
	// 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 
	// 두 값이 같을 경우 그 값을 return합니다.

	class Solution {
	    public int solution(int[] num_list) {
	        int odd = 0;
	        int even = 0;
	        
	        for(int i = 0; i < num_list.length; i++){
	         
	            if(i % 2 == 0){
	                odd += num_list[i];
	            } else {
	                even += num_list[i];
	           }           
	        }  
	        if(odd > even){
	            return odd;
	        }        
	       else return even;    
	    }
	}
	
}
