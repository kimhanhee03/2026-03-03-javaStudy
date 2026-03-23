package com.sist.main;

/*
 *  객체지향 = 설계
 *  1)요구사항 분석
 * 	   ㄴ데이터보다는 기능 중심
 * 		  (변수)	   (메소드) > 인터페이스/추상클래스
 *  2)객체 도출(생성)
 *  3)클래스마다 역할/책임(단일 책임)
 *      ㄴ한가지 기능을 모아서 관리
 *      ㄴex:게시판/회원 가입 따로따로 관리
 * 	4)관계설정
 *  	ㄴ상속/포함
 *  5)구현 > 리팩토링
 *  		  ㄴ중복 제거/객체 설계에 대한 위반 여부
 *  6)실행 
 *  
 *    객체지향의 4대 특성
 *      ㄴ데이터 보호: 캡슐화
 *         변수는 private(은닉화)
 *           ㄴ외부에서도 사용이 가능 > getter(변수값 읽기)/setter(변수값 설정)
 *         메모리에 저장이 되면 해킹
 *           ㄴ변수가 메모리에 저장된 값
 *           ㄴ메소드: 주소값 가지고 있다
 *         캡슐화의 목적
 *         1.데이터 보호 > 잘못된 값 설정 방지(손실, 변경)
 *             ㄴ데이터베이스: 무결정 원칙
 *             ㄴAWS: 평생1번만 무료
 *         2.유지보수 용이 > 내부는 변경이 안됨
 *         3.코드 안전성 향사
 *         4.구현-변수는 private으로 선언
 *         		 getter/setter 접근하는 연습(lombok)
 *         		 **전체를 만드는 것보다는 필요한 부분에서만 설정
 *         			 ㄴ윈도우:Button/TextField ...
 *         			 ㄴ다른 메소드를 사용할 수 있다
 *            ㄴ캡술화는 데이터를 감추고 메소드를 이용햇 접근하는 기술(안전성/유지보수를 높이는 기술)
 *               **웹에서 주로 사용되는 기술
 *               **웹에서는 시큐어 코딩(private)
 *               			 ㄴ안하면 3천만원 벌금 ㄷㄷ
 *               
 *               
 *     상속:재사용 일종
 *      1)개념
 *         1.기존의 클래스의 멤버변수/메소드를 받아서 확장하는 프로그램
 *         2.코드 재사용/확장성을 높이는 방법
 *         3.상속의 키워드 > extends
 *      2)특징
 *         1.단일 상속(다중 상속 > 중복된 메소드,변수 > 충돌)
 *         	   ㄴ다중 상속을 하려면 인터페이스를 사용)
 *         2.상속 예외
 *         	   생성자
 *         	   초기화 블록
 *             static
 *             private
 *         3.super 키워드를 이용해서 생성자/메소드 호출이 가능
 *         		super-상속받은 변수/메소드
 *         		this-상속외으 자체에 있는 변수/메소드
 *      3)장점
 *         -중복코드를 제거
 *         -신뢰성이 뛰어나다
 *         -유지보수가 좋다
 *         -개발시간 단축할 수 있다
 *      4)단점
 *         -캡슐화 파괴 > OOP의 기본 목적
 *            ㄴ스프링은 private 접근이 가능
 *            ㄴ변수/생성자를 이용해서 사용
 *            ㄴ결합성이 강하다: 의존도가 상위 클래스 > 영향력이 높다
 *            ㄴ결함이 많이 발생할 수 있다
 *            	  ㄴ상속 > 재정의:개발자마다 다르게 개발
 *            ㄴ문서화 작업이 어렵다(포함) > 인터페이스
 *            							 ㄴ단점: 영향력이 많다/인터페이스 고정
 *    중복코드
 *    
 *    	단일 상속만 가능 > extends 
 *    	상속 내리는 클래스:부모 클래스/슈퍼클래스/베이스 클래스
 *    	상속 받는 클래스:자식 클래스/서브클래스/파생 클래스
 *    
 *    	  ㄴ상속 내리는 클래스 > 상속받는 클래스보다 크다
 *    		 ㄴ메모리 상에서는 상속받는 클래스가 크다
 *    		 ㄴ위로 올라갈 수록 크다
 *    		 ㄴ모든 클래스는 Object클래스 상속을 받는다
 *    		 ㄴ관련된 클래스를 여러개 묶어서 관리
 *    		 ㄴ형변화(클래스의 크기:상속, 포함)
 *    		 ㄴex)
 *    
 *            									
 *       
 *           
 *           
 *           
 *           					  
 *      
 *      
 */
import java.util.*;
class Super
{
	int a,b,c;
	public void display()
	{
		System.out.println("Super");
	}
	
}
class Sub extends Super
{
   //int a,b,c; > 내리상속 > 모든:생성자,초기화블록,static
   //private: 접근이 불가능 > setter/getter
   //메모리상에 존재
	int d;
	public void display()
	{
		System.out.println("Sub");  // > 오버라이딩
	}
}
// 상속 내리는 클래스는 상속받은 클래스의 데이터나 메소드를 사용할 수 없다
public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
		System.out.println(sub.a);
		System.out.println(sub.b);
		System.out.println(sub.c);
		System.out.println(sub.d);
		sub.display();
		Super su=new Super();
		su.display();
//		System.out.println(su.d);
		Super s=new Sub();
		s.display();
		// 변수(클래스형)/메소드(생성자)
		Sub ss=(Sub)s;
		ss.display();
				
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("aaa");
		list.add('A');
		list.add(new Sub());
		
		Object o=list.get(3);
		Sub sss=(Sub)list.get(3);
		
				
		
	}

}
