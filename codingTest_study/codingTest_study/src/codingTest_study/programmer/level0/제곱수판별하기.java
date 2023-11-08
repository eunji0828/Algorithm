package codingTest_study.programmer.level0;

public class 제곱수판별하기 {
	
	// 230810
	// 문제
	// 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 
	// 정수 n이 매개변수로 주어질 때, 
	// n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
	
    public int solution(int n) {
        int answer = 0;
        
        if(Math.sqrt(n)%1 == 0){
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
    
    // Math.sqrt() 함수
    // 제곱근을 구할 수 있는 함수

}
