package codingTest_study.programmer.level0;

public class 숨어있는숫자의덧셈1 {
	
	// 230814
	// 문제
	// 문자열 my_string이 매개변수로 주어집니다. 
	// my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
	
	  public int solution(String my_string) {
	        int answer = 0;
	        
	        my_string = my_string.replaceAll("[a-zA-Z]", "");
	        String[] arr = my_string.split("");
	        
	         for (int i = 0; i < arr.length; i++) {
				answer += Integer.valueOf(arr[i]); 
			}
	     
	        return answer;
	    }
	  
	  // replaceAll() - 대상 문자열을 원하는 문자값으로 변환
	  // split() - 입력받은 정규표현식 또는 특정 문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴
	  
	  // replaceAll로 소문자, 대문자 영어를 제거한 후
	  // split()함수를 이용해 배열처리한 후
	  // for문 돌린 후 arr[i] 인덱스 값 하나하나를 answer에 계속해서 더한다.
	  
	  // Integer.parseInt(), Integer.valueOf() 차이점
	  // 원시데이터인 int 타입 반환, 래퍼 객체를 반환

}
