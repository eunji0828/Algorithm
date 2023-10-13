package codingTest_study.programmer.level0;

public class 조건에맞게수열반환하기1 {
	
	// 230911
	// 문제
	// 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 
	// 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 
	// 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.
	
	class Solution {
	    public int[] solution(int[] arr) {
	        int[] answer = new int[arr.length];
	        
	        for(int i=0; i<answer.length; i++){
	            
	            if(arr[i] < 50 && arr[i] % 2 != 0){
	                answer[i] = arr[i] * 2;
	            } else if(arr[i] >= 50 && arr[i] % 2 == 0){
	                answer[i] = arr[i] / 2;
	            } else {
	                answer[i] = arr[i];
	            }
	        }
	        
	        return answer;
	    }
	}
	
	// 설명하자면 
	// answer 배열을 생성하고 길이는 arr 배열 길이와 동일하도록 설정
	// 문제에 나온 조건대로 if문 작성
	// 위 조건을 만족하지 않는 경우 나머지 값들은 그대로 answer 배열에 저장

}
