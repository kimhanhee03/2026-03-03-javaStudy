/*
 * 41page
 * 정수타입
 *  정수
 *   byte => 1byte 네트워크,파일 읽기
 *   int => 4byte 일반 숫자에 주로 사용(프로그램에서 가장 많이 사용)
 *   long => 주로 시간, 날짜
 *  문자
 */
import javax.swing.*;
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
public class 변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f=new File("C:\\JavaDev\\javaStudy\\Chapter02_변수_데이터형\\src\\변수_정리.java");
//		long l=f.lastModified();
//		System.out.println(l);
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(l)));
		//
//		String name=JOptionPane.showInputDialog("이름입력:");
//		System.out.println(name);
//		int kor=(int)(Math.random()*101);
//		int eng=(int)(Math.random()*101);
//		int math=(int)(Math.random()*101);
		Random r=new Random();
		int kor=r.nextInt(101);
		int eng=r.nextInt(101);
		int math=r.nextInt(101);

		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);



	}

}
