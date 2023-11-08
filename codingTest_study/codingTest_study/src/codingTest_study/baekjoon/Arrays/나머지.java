package codingTest_study.baekjoon.Arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 나머지 {

	public static void main(String[] args) throws IOException{
		// 231102
		// 문제
		// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
		// 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
		// 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			int num = Integer.parseInt(br.readLine());
			arr[i] = num % 42;
			
		}
		
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			int count = 0;
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]){
					count++;
				}
			}
			
			if(count == 0) {
				result++;
			}
			
		}
		
		bw.write(result + " ");
		br.close();
		bw.flush();
		bw.close();

	}
	
}


