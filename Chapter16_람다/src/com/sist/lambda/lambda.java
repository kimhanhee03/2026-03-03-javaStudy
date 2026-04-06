package com.sist.lambda;
/*
 *  1.람다식이란?
 *    1)람다식 > 익명의 함수
 *    2)메소드 처리 매개변수 전달이 가능
 *    3)코드 간결화
 *    4)함수형 프로그램 스타일
 *  2.기본문법
 *     (매개변수) > {실행문}
 *     public 리턴형 메소드명(매개변수)
 *     {
 *      	 실행문
 *     }
 *  3.규칙이 존재한다
 *     데이터형을 생략한다
 *  4.인터페이스로 제작
 *  5.사용위치
 *     
 */
// > 이미 만들어진 라이브러리 사용이 많다 > 사용자 정의
@FunctionalInterface // 람다용으로 사용하겠다
interface Calc
{
	//반드시 메소드는 한개만 선언: 추상메소드는 한개
	int calc(int a, int b);
	// > deaulyㄴ,ㄴ 가능 > 재사용
	default int sum(int a,int b)
	{
		return a+b;
	}
	
}
/*
 *  속도가 빠르다
 */
public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc add=(a,b)->a+b;
		Calc minus=(a,b)->a-b;
		Calc gop=(a,b)->a*b;
		Calc div=(a,b)->a/b;
		
		System.out.println(add.calc(10,20));
		System.out.println(minus.calc(100,20));
		System.out.println(gop.calc(10,20));
		System.out.println(div.calc(10,3));
	}

}
