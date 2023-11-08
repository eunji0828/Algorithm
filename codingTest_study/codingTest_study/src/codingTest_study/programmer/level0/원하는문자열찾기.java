package codingTest_study.programmer.level0;

public class 원하는문자열찾기 {
	
	// 230814
	// 문제
	// 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다.
	// myString의 연속된 부분 문자열 중 pat이 존재하면 1을 
	// 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
	// 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
	
	 public int solution(String myString, String pat) {
	        int answer = 0;
	        myString = myString.toLowerCase();
	        pat = pat.toLowerCase();
	        
	        if(myString.contains(pat)){
	            answer = 1;
	        } else {
	            answer = 0;
	        }        
	        
	        return answer;
	    }
	 
	 // toLowerCase() - 소문자로 변환
	 // contains() - 문자열 포함 여부 확인하는 함수
	 
	 // toLowerCase를 사용해야 하나 했는데 정말 사용해야했고
	 // for문 돌려서 equals로 쓰려고 했는데
	 // contains()를 사용하면 더 깔끔하고 정확하게 표현할 수 있었다.
	 
	 // equals() 객체의 주소를 비교
	 // 즉 같은 값을 가진 객체라 할지라도 따로 생성되었다면 false
	 
//	 Name nameA = new Name("aiden");
//	 Name nameB = new Name("aiden");
//	 Name nameC = nameA;
//	 
//	 System.out.println(name.equals(nameB)); --> false
//	 System.out.println(name.equals(nameC)); --> true

}
