package com.sist.io;
/*
 * 	라이브러리
 * 	  java.lang
 * 		Object: toString(), clone(), equals(), hashCode()
 * 		String: equals(), length(), trim()
 * 				subString(), split(), valueOf()
 * 				replace(), replacceAll(), indexOf()
 * 				lastIndexOf()
 * 		Math: ceil(), random()
 * 		Wrapper 
 * 		  int > Integer: pareInt()
 * 		  double > Double: parseDouble()
 * 		  boolean > Boolean: parseBoolean()
 * 		StringBuffer / StringBuilder
 * 		  비동기            동기    >     문자열 결합: append()
 * 
 * 		java.util
 * 		  StringTokenizer
 * 			counterTokens()
 * 			hasMoreTokents()
 * 			nextToken()
 * 		  Data > 기능이 없다 > 호환(데이터베이스 호환용)
 * 					ㄴCalendar
 * 					   ㄴ설정: set(), 값 읽기: get()
 * 		  List
 * 			add() / remove() /set() / isEmpty() / size()
 * 			clear()
 * 		  Set
 * 			add() / remove() / isEmpty() / size() / clear()
 * 		  Map
 * 			put() / remove() / get()
 * 		
 * 		  기타
 * 		   Random: nexInt()
 * 		   DecimalFormat / SimpleDateFormat
 * 		  ----------------------------------->format()
 * 	
 * 		  람다
 * 			stream() / map() / filter() / forEach() / collect()
 * 			
 * 		자바IO
 * 		 1.IO(Input/Output)
 * 		    입력: Input > 프로그램이 외부 데이터를 받는 것
 * 				   키보드 / 파일 / 네트워크 / 데이터베이스
 * 			출력: Output > 프로그램이 외부에 데이터를 보내는 것
 * 				   화면 출력 / 파일쓰기 / 네트워크 전송 / 데이터베이스 전송
 * 				                      
 * 		 2.IO 특징
 * 			stream기반: 데이터를 운반하는 통로
 * 			(단방향)      ㄴ1바이트(알파벳,숫자) = 바이트스트림
 * 							> 이미지,동영상 파일 처리
 * 						  2바이트(각국의 언어) = 문자스트림
 * 							> 문자 읽기/문자 쓰기
 * 			바이트 스트림
 * 					InputStream / OutputStream
 * 		
 * 			문자 스트림
 * 					Reader  /   Writer
 * 
 * 			보조 스트림
 * 					BufferedInputStream / BufferedOutputStream
 * 			객체 스트림
 * 					ObjectInputStream / ObjectOutputStream
 * 						
 * 		파일 정보 확인
 * 		 File
 * 		   생성자
 * 			new File("경로명/풀더명") > 풀더정보
 * 			new File("경로명/풀더명
 * 		  
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class IO_1 {

	public static void main(String[] args) {
		try
		{
			File file=new File("C:\\JavaDev\\javaStudy\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java");
			System.out.println("파일명:"+file.getName());
			System.out.println("경로+파일명:"+file.getPath());
			System.out.println("경로명:"+file.getParent());
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("수정일:"+sdf.format(new Date(file.lastModified())));
			System.out.println("숨긴 파일:"+file.isHidden());
			System.out.println("파일여부:"+file.isFile());
			System.out.println("읽기 전용:"+file.canRead());
			System.out.println("쓰기 전용:"+file.canWrite());
		}catch(Exception ex) {}			
		// TODO Auto-generated method stub
		
	}

}
