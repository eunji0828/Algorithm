package codingTest_study.programmer.level0;

public class 짝수홀수개수 {
	
	// 230714 풀이
	// 정수가 담긴 리스트 num_list가 주어질 때, 
	// num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 
	// return 하도록 solution 함수를 완성해보세요.
	
	 public int[] solution(int[] num_list) {
		 
	        int[] answer = new int[2];
	        // 배열 크기 2자리로 초기화
	        
	        int left = 0; 	// 짝수
	        int right = 0;	// 홀수
	        
	        for(int i=0; i<num_list.length; i++){
	                if(num_list[i] % 2 == 0){
	                    left++;
	                } else if(num_list[i] % 2 != 0){
	                    right++;
	                }
	            }
	        
	        answer[0] = left;
	        answer[1] = right;
	        
	        return answer;
	    }
	
	 // 배열 초기화하고 담는 연습을 더 해야할거같당..

}
