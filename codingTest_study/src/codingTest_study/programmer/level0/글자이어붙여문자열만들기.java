package codingTest_study.programmer.level0;

public class 글자이어붙여문자열만들기 {
	
	// 230824
	// 문제
	// 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
	// my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 
	// 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
	
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int i=0; i<index_list.length; i++){
            answer += my_string.charAt(index_list[i]);
        }
        
        return answer;
    }
    
    // for문을 통해 0부터 index_list의 길이까지 i를 증가하며 반복
    // answer 문자열에 my_string 문자열의 index_list[i] 번째 원소의 값을 이어 붙인다!

}
