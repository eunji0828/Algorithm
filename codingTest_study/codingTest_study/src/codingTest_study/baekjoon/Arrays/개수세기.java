package codingTest_study.baekjoon.Arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 개수세기 {

	public static void main(String[] args) throws IOException {
		// 231025
		// 문제
		// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
		// 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 
		// 둘째 줄에는 정수가 공백으로 구분되어져있다. 
		// 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 
		// 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int[] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int b = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < arr.length; j++) {
			
			if(b == arr[j]) {
				count++;
			}
		}
		
		bw.write(count + "\n");
		
		br.close();
		bw.flush();
		bw.close();
		
		

	}

}


/*
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 * 
 * int N = Integer.parseInt(br.readLine()); int[] arr = new int[N];
 * 
 * StringTokenizer st = new StringTokenizer(br.readLine());
 * 
 * for (int i = 0; i <arr.length; i++) { arr[i] =
 * Integer.parseInt(st.nextToken()); }
 * 
 * int find = Integer.parseInt(br.readLine());
 * 
 * int count = 0; for (int i = 0; i < arr.length; i++) { if (arr[i] == find)
 * count++; } bw.write(count + "\n"); // 여기서 "\n"을 안해주면 오류가 나는데 왜인지 모르겠음
 * bw.flush(); bw.close(); br.close(); } }
 */
