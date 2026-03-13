/*
 * 1. 조건문: if, if ~else
 * 2. 선택문: switch~case
 * 					 ㄴ: , ->(간결) - 처리문장
 * 
 */
//import java.io.*;
public class 제어문_반복문_while {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		File file=new File("c:\\JavaDev\\movie.txt");
//		FileReader fr=new FileReader(file);
//		//String movie="";
//		StringBuffer db=new StringBuffer();
//		int i=0;
//		while((i=fr.read())!=-1)
//		{
//			//movie+=(char)i;
//			db.append((char)i);
//		}
//		fr.close();
//		System.out.println(db.toString());
		System.out.println("for문");
		for(char c='A';c<='Z';c++) {
			System.out.print(c+" ");
		}
		System.out.println("\nwhile");
		char c='A';
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}
		System.out.println("\ndo-while");
		c='A';
		do
		{
			System.out.print(c+" ");
			c++;
		}while(c<='Z');
	}

}
