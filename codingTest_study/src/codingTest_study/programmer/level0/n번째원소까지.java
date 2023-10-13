package codingTest_study.programmer.level0;

public class n번째원소까지 {

	// 230831
	// 문제
	// 정수 리스트 num_list와 정수 n이 주어질 때, 
	// num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 
	// 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        
        for(int i=0; i<n; i++){
            answer[i] = num_list[i];
        }
        
        return answer;
    }
    
    // n 만큼의 길이의 배열을 만들고
    // for문을 돌려 answer에 num_list의 배열을 n만큼 넣는다.
}
