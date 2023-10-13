package codingTest_study.programmer.level0;

import java.util.*;

public class 배열만들기1 {
	
	// 230825
	// 문제
	// 정수 n과 k가 주어졌을 때, 
	// 1 이상 n이하의 정수 중에서 k의 배수를 
	// 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

	 public List solution(int n, int k) {
	        List<Integer> answer = new ArrayList<>();
	        
	        for(int i=1; k * i<= n; i++){
	            answer.add(k*i);
	        }
	        
	        return answer; 
	    }
	    
	    // add() 리스트의 끝에 요소 추가
	
}
