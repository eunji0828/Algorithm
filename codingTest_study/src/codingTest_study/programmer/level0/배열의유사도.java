package codingTest_study.programmer.level0;

public class 배열의유사도 {
	
	// 230804
	// 문제
	// 두 배열이 얼마나 유사한지 확인해보려고 합니다. 
	// 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 
	// return하도록 solution 함수를 완성해주세요.
	
	   public int solution(String[] s1, String[] s2) {
	        int answer = 0;

	        for (int i = 0; i < s1.length; i++) {
	            for (int j = 0; j < s2.length; j++) {
	                if(s1[i].equals(s2[j])) {
	                    answer++;
	                }
	            }
	        }
	        
	        return answer;
	    }
	   
	   // s1과 s2가 같은 배열의 갯수를 나타내기 위해서는
	   // s1의 문자 개수를 확인하고
	   // s2의 문자 개수를 확인한 후
	   // .equals를 사용해 같은 문자를 찾아 answer에 개수가 쌓이도록 출력한다
	   // 문자열에서 == 는 정확하게 같은 걸 찾아내지 못함 
	   // 같은 문자를 찾아내야 할 땐 .equals()를 사용해야 한다.

}
