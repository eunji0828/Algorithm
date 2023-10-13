package codingTest_study.programmer.level0;

public class 문자열바꿔서찾기 {
	
	// 230901
	// 문제
	// 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. 
	// myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 
	// 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
	
	public int solution(String myString, String pat) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<myString.length(); i++){
            if(String.valueOf(myString.charAt(i)).equals("A")){
                sb = sb.append("B");
            } else{
                sb = sb.append("A");
            }
        }
            
            answer = sb.toString().contains(pat) ? 1 : 0;
            return answer;
        }
	
	 public int solution2(String myString, String pat) {
	        String str = "";
	        
	        for(int i=0; i<myString.length(); i++){
	            if(myString.substring(i,i+1).equals("A")){
	                str += "B";
	            } else {
	                str += "A";
	            }
	        }

	        return str.contains(pat) ? 1 : 0;
	    }

}
