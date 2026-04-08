package com.sist.stream;
/*
 * 	문자 스트림
 * -----------2byte씩 파일 읽기(한글 안깨진다)
 * 			  자바: 한글자당 (2byte)
 * 			  오라클: 3byte
 * 
 * 	  Reader
 * 		FileReader
 * 		BufferedReader
 * 		  ㄴ 파일 자체 제어 > 글쓰기 / 읽기 / 삭제 / 수정
 * 						               -----------
 * 										  ㄴ이건 좀 어려움
 * 	  Writer
 * 		FileWriter
 * 		BufferdWriter
 */
// 파일 읽기
import java.io.*;
public class Reader_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null; //초기값 // 클래스의 기본값: null
		
		try
		{
			in=new FileReader("c:\\java_data\\sawon.txt");
			// int read() > 1글자 (2byte)
			// 반드시 닫아야함 > close() > finally
			int i=0;
			while((i=in.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			
		}
		finally
		{
			try
			{
				in.close();
			}catch(Exception ex) {}
		}
	}

}
