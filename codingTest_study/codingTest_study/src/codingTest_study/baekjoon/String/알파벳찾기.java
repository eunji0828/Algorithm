package codingTest_study.baekjoon.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 알파벳찾기 {

	public static void main(String[] args) throws IOException {
		// 231114
		// 문제
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
		// 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int arr[] = new int[26];
		
		for(int i = 0; i < 26; i++) {
			
			arr[i] = -1;
		}
		
		for(int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				
				arr[ch - 'a'] = i;
				
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			bw.write(arr[i] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}
