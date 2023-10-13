package codingTest_study.programmer.level0;

public class 중복된숫자개수 {

// 문제
// 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, 
// array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
	
	public int solution(int[] array, int n) {
		int answer = 0;
		
		for(var i=0; i<array.length; i++) {
			
			if(array[i] == n) {
				answer++;
			}
		}
		
		return answer;
	}
	
	// array의 배열의 길이를 아는 반복문을 돌리면서
	// 매개변수 n과 같은 i가 있으면 answer에 +1 추가한다.
	// 다시 말해 n과 i의 같은 수가 만날 떄마다 answer = 0 -> 1로 늘어난다.

}


