package codingTest_study.baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ab더하기3 {

	public static void main(String[] args) throws IOException{
		// 231021
		// 문제
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
			
		}
			
			bf.close();
			bw.flush();
			bw.close();
		

	}

}
