package com.sist.io;

import java.io.File;
/*
 *   파일 제어 : 입출력
 *   	> FileInputStream / FileOutputStream
 *   	> BufferdInputStream / BufferdOutputStream
 *   	> FileReader / FileWriter
 *   	> BufferedReader / BufferedWriter
 *   	> ObjectInputStream / ObjectOutputStream
 *   	> PrintWriter : 자바에서 브라우저로 전송
 *   		> JspWeiter : JSP
 * 
 * 
 */

public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\upload\\sawon.txt");
//			if(!dir.exists())
//			{
//				dir.mkdir();
//			}
//			else
//			{
//				System.out.println("이미 존재하는 풀더입니다");
//			}
			
//			if(!dir.exists())
//			{
//				dir.createNewFile();
//				System.out.println("파일 생성 완료!!");
//			}
//			else
//			{
//				System.out.println("이미 존재하는 파일입니다");
//			}
			
			if(dir.exists())
			{
				dir.delete();
				
			}
		}catch(Exception ex) {}
	}

}
