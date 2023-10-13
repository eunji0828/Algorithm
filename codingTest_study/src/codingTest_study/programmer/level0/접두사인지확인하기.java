package codingTest_study.programmer.level0;

public class 접두사인지확인하기 {
	
	// 230824
	// 문제
	// 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 
	// 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", 
	// "banana"입니다.
	// 문자열 my_string과 is_prefix가 주어질 때, 
	// is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 
	// solution 함수를 작성해 주세요.
	
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
    
    // contains() 썼는데 테스트3이 안넘어가서 뭐지 했는데
    // startsWith() 쓰니까 됐당
    // startsWith() 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수
    // endsWith() 대상 문자열이 특장 문자 또는 문자열로 끝나는지 체크하는 함수
    // 공백도 취급하기 때문에 확인하고 사용해야 한다.

}
