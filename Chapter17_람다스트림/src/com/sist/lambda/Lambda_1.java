package com.sist.lambda;
/*
 *  람다:익명의 함수 > 코드블록으로 값처럼 전달할 수 있게 만들어 준것
 *    1.문법
 *    	1.메소드명이 생략
 *    	2.매개변수의 데이터형 생략
 *    	3.리턴형의 생략
 *      ----------------------> 일반 개발자 어려워한다
 *    2.람다를 사용하는 목적
 *    	 코드가 짧고 사용이 편리
 *     	 함수형 프로그래밍 스타일 가능
 *     	  > 독립적으로 사용이 가능 > 매소드(클래스내에서 사용)
 *     		  ㄴ클래스외에서 선언이 가능
 *     	
 *     		기존의 방식 > 익명의 클래스(extends,implements가 없이 매소드 재정의가 가능)
 *     		 Runnable r=new Runnable(){
 *     
 *     }
 *      
 */
@FunctionalInterface //람다형이다
//사용자 정의는 거의 빈도수가 없다
//라이브러리에서 제공하는 것이 많다
interface Calc
{
	public int calc(int a,int b); //추상메소드
	default void display() {
		System.out.println("aaa");
	}
	static void aaa()
	{
		System.out.println("bbb");
	}
}
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Runnable r=new Runnable() {
//		
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			System.out.println("쓰레드 구동!!");
//			
//			
//		}
//	};
	
//	Runnable r=()->System.out.println("쓰레드 구동!!");
//	new Thread(r).start();
	//람다는 혼자서 사용 불가
		Calc add=(a,b)-> a+b;
		//        매소드  리턴
		Calc minus=(a,b)->a-b;
		
		System.out.println(add.calc(10, 20));
		System.out.println(minus.calc(20, 10));
	}

}
