package codingTest_study.programmer.level0;

public class 문자열뒤집기 {
	
	// 230720
	// 문제
	// 문자열 my_string이 매개변수로 주어집니다. 
	// my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
	
	   public String solution(String my_string) {
	        StringBuilder sb = new StringBuilder(my_string);
	        return sb.reverse().toString();
	    }
	   
	   // String, StringBuilder 불변, 가변인지 생각해서 쓰기
	   // reverse()를 쓰면 된다 생각은 했는데 그 다음부터 어떻게 진행해야 할지 모르겠어서
	   // 참고해서 품..
	   // for문 돌리지도 않고 쉽게 푸는 방법..ㅠ
	   
	   // StringBuilder/ StringBuffer 에 reverse(), replace() 가 있다.
	   // reverse() 배열의 순서를 거꾸로 만들어줌
	   // toString() 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
	   // toString() 자주 쓰이는 것 같으니 잘 기억하기..

}
