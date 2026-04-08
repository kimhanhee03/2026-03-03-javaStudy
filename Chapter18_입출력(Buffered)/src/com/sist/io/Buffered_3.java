package com.sist.io;
import java.io.*;
public class Buffered_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		
		try
		{
			fis=new FileInputStream("c:\\JavaDev\\movie.txt");
//			int i=0;
//			StringBuilder sb=
//						new StringBuilder();
//			while((i=fis.read())!=-1) // 파일 끝까지 읽어라
//			{
//				sb.append((char)i);
//			}
//			System.out.println(sb.toString());
			
			long start=System.currentTimeMillis();
			BufferedReader in= 
					new BufferedReader(new InputStreamReader(fis));
			StringBuilder sb=new StringBuilder();
			while(true)
			{
				String msg=in.readLine();
				if(msg==null) break; // null 값인 경우가 마지막
				sb.append(msg+"\n");
			}
			long end=System.currentTimeMillis();
		
			System.out.println(sb.toString());
			System.out.println("수행시간:"+(end-start)+"MS");
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			try 
			{
				fis.close();
			}catch(Exception ex) {}
		}
	}

}
