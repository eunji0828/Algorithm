package codingTest_study.baekjoon.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최소최대 {

	public static void main(String[] args) throws IOException {
		// 231027
		// 문제
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
		// 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
		// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){

	        arr[i] = Integer.parseInt(st.nextToken());			 
        }

        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
        
        }
}
	
		
	