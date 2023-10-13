package codingTest_study.programmer.level0;

public class 배열두배만들기 {

	// 230804
	// 문제
	// 정수 배열 numbers가 매개변수로 주어집니다. 
	// numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 
	// solution 함수를 완성해주세요.
	
	 public int[] solution(int[] numbers) {
	        int[] answer = new int[numbers.length];
	        // answer 배열을 numbers.length만큼 선언
	        
	        for(int i=0; i<numbers.length; i++){
	            answer[i] = numbers[i] * 2;
	        }
	        
	        return answer;
	    }
}
