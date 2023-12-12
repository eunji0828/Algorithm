package codingTest_study.baekjoon.Sort;

import java.io.*;
import java.util.*;

		public class 수정렬하기 {

			// 231212
			// 문제
			// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

		    public static void main(String[] args) throws IOException {
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        int n = Integer.parseInt(br.readLine()); //정수 개수
		        int[] arr = new int[n];
		        for (int i = 0; i < n; i++) {
		            arr[i] = Integer.parseInt(br.readLine()); //배열에 정수 입력 받기
		        }
		        Arrays.sort(arr);  //배열을 오름차순으로 정렬
		        for (int i = 0; i < n; i++) {
		            System.out.println(arr[i]);
		        }
		    }
		}
		
		

