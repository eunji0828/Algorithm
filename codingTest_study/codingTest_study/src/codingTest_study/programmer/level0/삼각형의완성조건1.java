package codingTest_study.programmer.level0;

import java.util.Arrays;

public class 삼각형의완성조건1 {

	// 230808
	// 문제
	// 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
	// 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
	// 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 
	// 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 
	// solution 함수를 완성해주세요.
	
	class Solution {
	    public int solution(int[] sides) {
	        int answer = 0;
	        Arrays.sort(sides);
	        
	        if(sides[0] + sides[1] > sides[2]){
	            answer = 1;
	        } else {
	            answer = 2;
	        }
	        return answer;
	    }
	    
	 // if문까지는 잘 했는데 sort로 정렬해야하는지는 몰랐다..
	 // sort로 오름차순 정렬 해주면 정렬된 배열의 마지막 값이 가장 큰 변이 되므로
	 // sort해준 후 if 조건문이 실행되면 삼각형의 완성 조건 완료

}
}
