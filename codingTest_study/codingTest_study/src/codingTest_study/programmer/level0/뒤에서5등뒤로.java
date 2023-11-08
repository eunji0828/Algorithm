package codingTest_study.programmer.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 뒤에서5등뒤로 {
	
	// 230929
	// 문제
	// 정수로 이루어진 리스트 num_list가 주어집니다. 
	// num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 
	// return하도록 solution 함수를 완성해주세요.
	
	class Solution {
	    public List solution(int[] num_list) {
	        List<Integer> answer = new ArrayList<>();
	        Arrays.sort(num_list);
	        
	        for(int i = 5; i < num_list.length; i++){
	            
	            answer.add(num_list[i]);
	            
	        }
	        
	        return answer;
	    }
	}

}
