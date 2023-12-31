package codingTest_study.baekjoon.Arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 최댓값 {

	public static void main(String[] args) throws IOException {
		// 231028
		// 문제
		// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		// 예를 들어, 서로 다른 9개의 자연수
		// 3, 29, 38, 12, 57, 74, 40, 85, 61
		// 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
		// 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		
		int[] arr = new int[9];
		int max = arr[0];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
				index = i+1;
			}
		}
		
		bw.write(max + " ");
		bw.write(index + " ");
		br.close();
		bw.flush();
		bw.close();
		
	}

}
