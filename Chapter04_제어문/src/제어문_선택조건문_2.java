/*
 * 형식
 *  if(조건문)
 *  {
 *     ture
 *  }
 *  else
 *  {
 *     false
 *  }
 */
import java.util.Scanner;
public class 제어문_선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어점수:");
		int kor=scan.nextInt();
		
		System.out.print("영어점수:");
		int eng=scan.nextInt();
		
		System.out.print("수학점수:");
		int math=scan.nextInt();
		
		int avg=(kor+eng+math)/3;
		
		if(avg>=60)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
