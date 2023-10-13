package codingTest_study.programmer.level0;

import java.util.Arrays;

public class 중앙값구하기 {
	
	// 230810
	// 문제
	// 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 
	// 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 
	// 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 
	// 완성해보세요.
	
    public int solution(int[] array) {
        Arrays.sort(array);
       
       int answer = array[array.length/2];
       
       return answer;
   }
    
    // sort()로 정렬해준 후 array의 배열 개수를 2로 나누면 중앙값이 구해진다.

}
