/*
 * 선택조거문 > true 처리 / false 처리
 *  형식
 *   if(조건문)
 *   {
 *   	true일때 처리
 *   }
 *   else
 *   {
 *   	false일때 처리
 *   }
 */
import java.util.Scanner;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		int num3=num1>num2?num1:num2;
		if(num3==num1)
			System.out.println("최대값:"+num3);
		if(num3==num2)	
			System.out.println("최대값:"+num3);
	}

}
