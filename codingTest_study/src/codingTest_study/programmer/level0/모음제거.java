package codingTest_study.programmer.level0;

public class 모음제거 {
	
	// 230725
	// 문제
	// 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
	// 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 
	// solution 함수를 완성해주세요.
	
	// replace를 썼고 배열에도 담았는데도 오류가 났음..
	// replaceAll를 이용해 더 쉽게 풀 수 있음
	
	  public String solution(String my_string) {
	        String answer = "";        
	        answer = my_string.replaceAll("[aeiou]", "");
	        return answer;
	    }
	  
	  
	  // 다른 풀이
	  public String solution2(String my_string) {
	        String answer = "";
	        String[] eng = {"a", "e", "i", "o", "u"};
	        
	        for(int i = 0; i<eng.length; i++) {
	         if( my_string.contains(eng[i])) {
	            answer = my_string.replaceAll(eng[i], "");
	            my_string = answer;
	         } else {
	                answer =my_string;
	            }
	      }
	        return answer;
	    }
	   
	  // replaceAll() 대상 문자열을 원하는 문자 값으로 변환하는 함수
	  // replace() 대상 문자열을 원하는 문자 값으로 변환하는 함수
	  // replaceAll, replace 차이점
	  // CharSequence(문자열을 읽기 위한 인터페이스로 수정 불가), 
	  // String(구현한 불변 문자열 클래스) 이라는 차이점이 있으며
	  // replaceAll()은 정규표현식을 의미한다
	  
	  // contains() 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수

}
