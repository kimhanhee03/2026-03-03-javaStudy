/*
 * 1.기본 문법: 변수,데이터형,연산자,제어문
 * 2.프로그램 제어: 관련된 명령문(명령문),변수묶기(배열/클래스)
 * 3.데이터 보호(캡슐화)/재사용(상속,포함)/수정 쉽게(오버라이딩)/추가 기능(오버로딩)
 * 4.설계: 인터페이스
 * 5.예외처리:프로그램 비정상 종료방지/미리 에러에 대한처리
 * 6.라이브러리
 * 			
 * 제어문: 다중 조건문 > 일반 프로그램에서는 많이 사용/웹에서 가끔사용
 * 											ㄴ화면(메뉴클릭시),성적처리,계산기
 * 	 	1)형식
 * 			if(조건문)
 * 			{
 * 			  조건이 true면 실행
 * 			}
 * 			else if(조건문)
 * 			{
 *  * 			  조건이 true면 실행
			}
			else if(조건문)
 * 			{
 *  * 			  조건이 true면 실행
			}
			else
			{
				  조건이 없는 경우
			}
 * 						
 */
import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print(":");
		int num1=scan.nextInt();
		System.out.print("+,-,*,/,:");
		String op=scan.next();
		System.out.print(":");
		int num2=scan.nextInt();
		
		if(op.equals("+"))
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op.equals("-"))
		{
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		else if(op.equals("*"))
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if(op.equals("/"))
		{
			if(num2==0)
				System.out.println("0 X");
			else
			System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
		}
		else
		{
			System.out.println("error");
		}
	}

}
