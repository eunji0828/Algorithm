package codingTest_study.programmer.level0;


public class 문자열정수의합 {
	
	// 230811
	// 문제
	// 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 
	// 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
	
    public int solution(String num_str) {
        int answer = 0;
        
        for(int i=0; i<num_str.length(); i++){
            answer += Integer.parseInt(num_str.substring(i, i+1));
        }
        
        return answer;
    }
    
    // 문자열의 합을 구한다고 했으니 문자열의 길이를 나타내는 length()를 사용
    // answer에 초기화할 때는 parseInt로 형변환해주어야 한다.
    // 그 후 answer에 계속 더하여 대입
    // substring() 문자열 자르기..
}
