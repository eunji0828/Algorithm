package codingTest_study.programmer.level0;

import java.util.Arrays;

public class 최댓값만들기first {
	
	// 230725
	// 문제
	// 정수 배열 numbers가 매개변수로 주어집니다. 
	// numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 
	// return하도록 solution 함수를 완성해주세요.
	
	// Math.max() 메서드를 사용했는데 도저히 모르겠어서 다른 사람 풀이 참고해서 함..
	
	class Solution {
	    public int solution(int[] numbers) {
	        Arrays.sort(numbers);
	        return numbers[numbers.length-1] * numbers[numbers.length-2];
	        // 정렬한 배열의 마지막 전 숫자와 마지막 숫자를 곱함
	    }
	    
	// sort() 메서드는 기본적으로 배열 안의 요소들을 오름차순으로 정렬!
	// 정렬 후 length를 이용해 배열 안 최댓값의 index와 그 다음 index를 찾아 곱함
	// 외우기 - length 배열의 길이 확인 , length() 문자열의 길이 확인 
	//			sort() 배열요소 오름차순으로 정렬


}
}
