package codingTest_study.baekjoon.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자와문자열 {

	public static void main(String[] args) throws IOException {
		// 231103
		// 문제
		// 단어 s와 정수 i가 주어졌을 때,
		// s의 i번째 글자를 출력하는 프로그램을 작성하시오
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		bw.write(s.substring(i - 1, i));
		br.close();
		bw.flush();
		bw.close();
		
	}

}
