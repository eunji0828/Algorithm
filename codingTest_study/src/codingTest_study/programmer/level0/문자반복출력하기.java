package codingTest_study.programmer.level0;

public class 문자반복출력하기 {
	
	// 230726
	// 문제
	// 문자열 my_string과 정수 n이 매개변수로 주어질 때,
	// my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 
	// solution 함수를 완성해보세요.
	
	 public String solution(String my_string, int n) {
	        String answer = "";
	        for(int i=0; i<=my_string.length()-1; i++) {
	            for(int j=0; j<n; j++) {
	                 answer += my_string.charAt(i);
	            }
	        }
	        return answer;
	    }
	 
	// charAt(i) 함수
	// String 타입의 데이터에서 특정 문자를 char타입으로 변환할 때 사용하는 함수
	// i 자리에는 int형 변수를 넣어서 원하는 위치의 문자를 가져올 수 있다.
	 
}
