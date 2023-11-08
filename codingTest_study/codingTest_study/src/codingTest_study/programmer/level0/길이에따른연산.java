package codingTest_study.programmer.level0;

public class 길이에따른연산 {
	
	// 230813
	// 문제
	// 정수가 담긴 리스트 num_list가 주어질 때, 
	// 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 
	// 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
	
	
	 public int solution(int[] num_list) {
		 int answer = 0;
		 int sum = 0;
		 int mul = 1;
			for(int i = 0; i<num_list.length;i++){
		        if(num_list.length>=11){
		            sum+=num_list[i];
		            answer = sum;
		        }
		        else {
		            mul*=num_list[i]; 
		            answer = mul;
		        }
		    }
			return answer;
	 }

	 
	 // 다른 풀이
	 // 위와 달리 변수 선언 없이 answer에서 삼항연산자로 변수 선언 대체할 수 있다.
	 
	  public int solution2(int[] num_list) {
	         int answer = (num_list.length < 11 ? 1 : 0);

	        for(int i=0; i<num_list.length; i++){

	            if(num_list.length < 11) {
	                answer *= num_list[i];
	            }else{
	                answer += num_list[i];
	            }

	        }

	        return answer;
	    }
}
