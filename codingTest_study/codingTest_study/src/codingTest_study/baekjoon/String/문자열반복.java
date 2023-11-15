package codingTest_study.baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열반복 {

	public static void main(String[] args) throws IOException {
		// 231115
		// 문제
		// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 
		// 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
		// 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 
		// 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
		// 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
		// 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
		// S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder(); // String과 문자열을 더할 때 StringBuilder를 쓴다
	 
	        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
	 
	        for (int i = 0; i < T; i++) {
	 
	            StringTokenizer st = new StringTokenizer(br.readLine());  // 띄어쓰기를 기준으로 문자열을 분리함
	 
	            int R = Integer.parseInt(st.nextToken()); // 반복 횟수
	            String S = st.nextToken(); // 반복할 문자
	 
	            for (int j = 0; j < S.length(); j++) {
	                for (int k = 0; k < R; k++) {
	                    sb.append(S.charAt(j));
	                    // String.charAt(n) = n번 째 위치의 문자를 char 형태로 반환함
	                    // append = 문자열을 더하는 역할을 하는 method
	                }
	            }
	            sb.append("\n");
	        }
	        System.out.println(sb);
	        br.close();
	    }
	}