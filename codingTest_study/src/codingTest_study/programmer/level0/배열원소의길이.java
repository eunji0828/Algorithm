package codingTest_study.programmer.level0;

public class 배열원소의길이 {
	
	// 230719
	// 문제
	// 문자열 배열 strlist가 매개변수로 주어집니다. 
	// strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
	
	 public int[] solution(String[] strlist) {
	        int[] answer = new int[strlist.length]; // strlist의 길이만큼 변수 크기 지정
	        
	        for(var i=0; i<answer.length; i++){
	            answer[i] = strlist[i].length(); // strlist[i]의 값의 길이를 answer에 대입
	        }
	        return answer;
	    }
	 
	 // 배열의 크기를 정하는건 알겠지만 
	 // 거기에서 더 응용하는 건 연습해야할듯

}
