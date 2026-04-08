package com.sist.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// BufferedReader: 외부에서 데이터 읽기, 네트워크 통신
// 키보드 입력 가능
public class Buffered_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader in=
					new BufferedReader(
							new InputStreamReader(System.in));
				//키보드의 입력값을 받는다
			System.out.print("문자열을 입력:");
			String msg=in.readLine();
			System.out.println(msg);
		}catch(Exception ex) {}
	}

}
