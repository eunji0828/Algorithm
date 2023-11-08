package codingTest_study.baekjoon.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.io.OutputStreamWriter;

public class 문자열 {

	public static void main(String[] args) throws IOException  {
		// 231108
		// 문제
		// 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
		  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		// 첫 라인에 숫자를 받아서
        int num = Integer.parseInt(br.readLine());
  
        // 숫자만큼 반복문을 돌려서
        // 문자열을 배열로 받아 
        // [0]과 [arr.length-1] 출력 후 초기화
        for(int i = 0; i < num; i++){
            String str = br.readLine();
            String[] arr = str.split("");
            bw.write(arr[0]+arr[arr.length-1]+"\n");

            str = "";
            for(int j = 0; j < arr.length; j++){
                arr[j] = "";
            }
        }

        br.close();

        bw.flush();
        bw.close();
    }
}