package com.sist.stream;
//FileOutputStream // 쓰기
//close(),write()
import java.io.*;
public class Stream_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f=null;
		FileOutputStream fo=null;
		try
		{
			//저장 풀더
			File dir=new File("c:\\java_data");
			if(!dir.exists()) // java_data풀더가 있는지 
			{
				dir.mkdir();
			}
			File file=new File("c:\\java_data\\sawon.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
//			f=new FileInputStream(file);
//			//자바응용프로그램 <=====> sawon.txt: 읽기
//			fo=new FileOutputStream(file,true);
//			//자바응용프로그램 <=====> sawon.txt: 쓰기	
//			/*fo.write('H');
//			fo.write('e');
//			fo.write('l');
//			fo.write('l');
//			fo.write('o');*/
//			
//			String info="홍길동|남자|개발부|서울|대리|4000\n";
//			fo.write(info.getBytes()); //String > byte
//			// getBytes()
//			// 클라이언트 ----- 서버
//			System.out.println("파일 저장 완료!!");
			int i=0;
			while((i=f.read())!=-1)
			{
				System.out.println((char)i);
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
		finally
		{
			try
			{
				f.close();
				fo.close();
			}catch(Exception ex) {}
		}
	}

}
