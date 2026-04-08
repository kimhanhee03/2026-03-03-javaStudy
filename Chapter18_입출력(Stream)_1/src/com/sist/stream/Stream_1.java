package com.sist.stream;
/*
 * 	IO 
	  Inuput - 입력
	  Output - 출력
	   
	   System.in - 키보드 입력
	   System.out - 명령프롬프트에 출력
	   	 ㄴ표준 입출력
	   	 
	  > 프로그램 외부소스를 목적지의 데이터 정보 교환
	  			|		 ㄴ 프로그램에서 > 화면,파일에 나가는 데이터 위치
	  			| 입력 > 키보드,파일,네트워크에 들어오는 데이터
	 출발지
	  1.키보드       입력스트림 - 데이터를 읽어오는 객체
	  2.파일	   ----------------프로그램-----------------도착지
	  3.프로그램	     데이터를 써서 보내는 객체 - 출력스트림     1.모니터
	  												    2.파일
	  												    3.브라우저
	
		스트림 클래스
		  입력스트림 
		  	1byte > 전송: 바이트 스트림
		      InputStream: interface
		     	 ㄴFileInputStream
		       	   BufferedInputStream
		       	   ObjectInputStream
		       
		    2byte > 전송: 문자 스트림
		      Reader: interface
		        ㄴFileReader (파일)
		          BufferedReader (메모리 > 키보드입력)
		          	ㄴ한줄씩 파일 읽기 / 외부소스 읽기
		          	
		   출력스트림
		   	  1byte: 바이트 스트림
		   	  OutputStream: interface
		   	  	ㄴFileOutputStream
		       	   BufferedOutputStream
		       	   ObjectOutputStream
		       
		      2byte > 전송: 문자 스트림
		      Writer: interface
		        ㄴFileWriter (파일 쓰기)
		          BufferedWriter (메모리에 저장)
		          PrinWeiter
		       	   
		     1.FileInputStream:파일 읽기
		     	 ㄴ다운로드,파일 이동
		     	   이미지,동영상
		     	   변환 InputStreamReader
		     	   		 ㄴ바이트스트림을 문자스트림으로 변환
		     	 -read(): 읽기 > 1글자씩 읽기 > byte단위로 읽는다
		     	 -closer(): 닫기  
		     	 	ㄴCheckedException(예외처리)
		     	 	
		     	   		
		   	  
		   	  
		           
 * 		
 */
import java.io.*;
public class Stream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f=null;
		try
		{
			//File file=new File("");
			//f=new FileInputStream(file);
			f=new FileInputStream("C:\\JavaDev\\javaStudy\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java");
			BufferedReader br=new BufferedReader(new InputStreamReader(f));
			//파일 읽기 시작
//			int i=0; // 한글자씩 > 정수로 읽는ㄴ다
//			while((i=f.read())!=-1) // -1 파일의 끝(EOF)
//			{
//				System.out.print((char)i);
//				// 한글이 깨진다 > 한글파일을 읽는 용도가 아니다
//				// 파일 이동
//			}
			while(true)
			{
				String s=br.readLine();
				if(s==null)
					break;
				System.out.println(s);
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			//getMessage() > 파일을 찾을 수 없다
			//printStackTrace() > 실행하는 과정 > 해당위치에서 종료
		}
		finally
		{
			try
			{
				f.close();
			}catch(Exception ex) {}
		}
	}

}
