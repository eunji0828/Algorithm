package codingTest_study.programmer.level0;

public class 정수부분 {
	
	// 230818
	// 문제
	// 실수 flo가 매개 변수로 주어질 때, 
	// flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
	
    public int solution(double flo) {
        int answer = 0;
        answer = (int) Math.floor(flo);
        return answer;
    }
    
    // Math.ceil() 소수점 올림 
    // Math.floor() 소수점 버림
    // Math.round() 소수점 반올림

}
