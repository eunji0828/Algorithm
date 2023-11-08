package codingTest_study.programmer.level0;

public class n번째원소부터 {
	
	// 230826
	// 문제
	// 정수 리스트 num_list와 정수 n이 주어질 때, 
	// n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 
	// return하도록 solution 함수를 완성해주세요.
	
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n+1];
        
     for(int i=0; i<num_list.length - n+1; i++){
         answer[i] = num_list[i+n-1];
     }
        
        return answer;
    }

    
    // 점점 문제가 어려워진다 ㅠ
    // answer 배열의 크기가 num_list.length - n + 1 파악하기
    // 왜냐면 nul_list.length의 배열 길이에서 n+1(인덱스)를 빼야 배열의 길이를 
    // 지정할 수 있다
    // for문을 돌려 n을 1씩 증가시켜 answer[i+1]에는 num_list[n]이 오도록 함
    
}
