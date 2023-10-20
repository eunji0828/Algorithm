package codingTest_study.baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 빠른ab더하기 {

	public static void main(String[] args) throws IOException {
		// 231020
		// 공부
		// BufferedReader = Scanner 와 유사
		// BufferedWriter = System.out.println();과 유사
		
		// 스캐너는 변환X 많은 입력을 필요로 할 경우 성능상 좋지 못한 결과..
		// BufferedReader는 enter만 경계로 인식하고 받은 데이터는 string로 인식
		
		// BufferedReader 사용법
		// import 필수
		// String -> int 형변환 필수
		// 예외처리 필수
		
		// 입력
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
//		String s = bf.readLine(); // 입력 메소드
//		int i = Integer.parseInt(bf.readLine()); // 형변환 필수
		
		// 데이터 가공
		// BufferedReader를 통해 읽어온 데이터는 개행문자 단위로 나누어짐
		// 만약 이를 공백 단위로 데이터를 가공하고자 한다면 따로 작업을 해주어야 한다.
//		StringTokenizer st = new StringTokenizer(bf.readLine());
//		int n = Integer.parseInt(st.nextToken());
		
		// String.split() 함수
		// 배열에 공백단위로 끊어 데이터를 저장하여 사용 가능
//		String arr[] = s.split("");
		
		// 출력
		// 많은 양의 데이터를 입력 받을 때는 출력 때도 BufferedWriter 사용하는 것이 좋다.
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		String m = "abcde"; // 출력할 문자열
//		bw.write(m+"\n");   // 버퍼에 있는 값 전부 출력
//		bw.flush(); 		// 남아있는 데이터를 모두 출력시킴
//		bw.close();			// 스트림 닫음
		
		// 문제
		// 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 
		// 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
		// Java를 사용하고 있다면, Scanner와 System.out.println 대신 
		// BufferedReader와 BufferedWriter를 사용할 수 있다.
		// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            bw.write((N + M) + "\n");
        }
        br.close();

        bw.flush();     // 남아있는 데이터 모두 출력
        bw.close();

    }
}
