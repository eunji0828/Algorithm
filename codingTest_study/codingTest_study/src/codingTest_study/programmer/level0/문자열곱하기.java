package codingTest_study.programmer.level0;

public class 문자열곱하기 {
	
	// 230818
	// 문제
	// 문자열 my_string과 정수 k가 주어질 때, 
	// my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
	
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i=0; i<k; i++){
            answer += my_string;
        }
        return answer;
    }
    
    public String solution2(String my_string, int k) {
        String answer = "";
        answer = my_string.repeat(k);
        return answer;
    }
    
    // repeat(num) 
    // 문자열을 num만큼 반복해서 보여줌

}
