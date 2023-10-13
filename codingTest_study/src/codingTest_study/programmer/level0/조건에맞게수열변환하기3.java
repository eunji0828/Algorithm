package codingTest_study.programmer.level0;

public class 조건에맞게수열변환하기3 {
	
	// 230817
	// 문제
	// 정수 배열 arr와 자연수 k가 주어집니다.
    // 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, 
	// k가 짝수라면 arr의 모든 원소에 k를 더합니다.
	// 이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.
	
	
	public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            
            if(k % 2 == 0){
                answer[i] = arr[i]+k;
            } else if(k % 2 != 0){
                answer[i] = arr[i]*k;
            }
        }
        
        
        return answer;
    }
	
	// answer의 배열 길이 설정하는 게 어려움.. 배열을 사용하면
	// 길이를 설정해주어야 함을 기억하기
	// 문제 잘 읽기!!!! k가 아닌 arr[i]를 홀수짝수인지 확인하고 있었음..

}
