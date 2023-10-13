package codingTest_study.programmer.level0;

public class 머쓱이보다키큰사람 {
	
	// 230724
	// 문제
	// 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 
	// 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 
	// 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
	
	// 처음으로 한 번에 푼 문제!
	// 너무 기분 좋당 실력이 늘긴 하나보다
	
	 public int solution(int[] array, int height) {
	        int answer = 0;
	        
	        for(var i=0; i<array.length; i++){
	            
	            if(height<array[i]){
	                answer++;
	            }
	        }
	        
	        return answer;
	    }

}
