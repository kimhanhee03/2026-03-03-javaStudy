package com.sist.io;
/*	 
 * 
 * 	브라우저 HTML/XML(자바는 일반 텍스트)
 *  자바
 *  오라클 SQL
 *   
 *    
 */
import java.io.*;
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\JavaDev");
			File[] list=dir.listFiles();
			for(File f:list)
			{
				if(f.isFile()) // 파일이면
				{	
					String len=f.length()/1024>0?
							(f.length()/1024)+"KB":f.length()+"Bytes";
					System.out.println(f.getName()+" "+len);
				}
				if(f.isDirectory()) // 디렉토리면
				{
					System.out.println(f.getName()+"DIR");
				}
			}
		}catch(Exception ex) {}
	}

}
