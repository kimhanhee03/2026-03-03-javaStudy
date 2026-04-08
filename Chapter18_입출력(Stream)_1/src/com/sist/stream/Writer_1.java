package com.sist.stream;
//FileWriter > write() / close()
//               ㄴwrite(String s)
import java.io.*;
import java.util.Scanner;
public class Writer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("c:\\java_data\\member.txt",true); //true가 없으면 덮어씌울 수 있음
			Scanner sc=new Scanner(System.in);					 //파일이 없으면 새로 만들어줌
			System.out.print("이름 입력:");
			String name=sc.next();
			System.out.print("성별 입력:");
			String sex=sc.next();
			System.out.print("전번 입력:");
			String phone=sc.next();
			
			//구분이 없다 >> 한명 > (\n) / 어떤 데이터인지 구분 > (| / ,)
			//            ---------------------------------------이렇게 구분해야함
			String data=name+","+sex+","+phone+"\n";
			fw.write(data);
			System.out.println("회원 가입 완료");
			
			FileReader fr=new FileReader("c:\\java_data\\\\member.txt");
			int i=0;
			while((i=fr.read())!=-1)
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
				fw.close();
			}catch(Exception ex) {}
		}
	}

}
