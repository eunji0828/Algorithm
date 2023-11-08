package codingTest_study.programmer.level0;

import java.util.ArrayList;

public class 짝수는싫어요 {
	
	// 230727
	// 문제
	// 정수 n이 매개변수로 주어질 때, 
	// n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
	
	  public int[] solution(int n) {
	        int[] answer = new int[(n+1)/2];
	        // 홀수 입력값 떄문에 (n+1)/2를 해야함
	        for(var i=1; i<= n; i++){
	            if(i%2==1){
	                answer[i/2]=i;
	                // 홀수값이 순서대로 들어갈 수 있도록
	            }
	        }    
	        return answer;
	    }
	  
	  // 다른 풀이 방법
	  public ArrayList solution2(int n) {
	        ArrayList<Integer> answer = new ArrayList<Integer>();

	        for(int i=1; i<=n; i++){
	          if(i%2 != 0) {
	              answer.add(i);
	          } 
	        }

	        return answer;
	    }

	  // 배열 어렵다 더 공부해야겠다..ㅠ
}
