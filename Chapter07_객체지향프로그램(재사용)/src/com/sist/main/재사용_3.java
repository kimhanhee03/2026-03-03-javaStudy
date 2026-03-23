package com.sist.main;
/*
 *    7장
 *      상속/this/super/this()/super()
 *       ㄴ메모리 할당
 *      this:자신의 객체 > 모든 클래스는 this를 가지고 있다
 *      	 this는 객체가 생성시에 주소값 저장
 *      	 this > static으로 되어 있다
 *      	 A a=new A();
 *      	 this=a > JVM에서 자동화
 *       class A
 *       {
 *         1.this 사용처 > 클래스에서만 사용이 가능
 *           생성자
 *           인스턴스 메소드에서만 사용이 가능
 *           static 메소드,블록에 사용 불가
 *         2.보통 > 매개변수/인스턴스 변수가 중복인 경우 > 구분을 위해서 사용
 *            private int a;
 *            public void display(int a)
 *            {
 *              a=a; > 매개변수
 *               > this.a=a
 *               지역변수와 매개변수 우선순위
 *            }
 *       }  
 	  윈도우: 자신의 윈도우 (this)
 	  접근지정어
 	    ㄴ사용자 정의는 없다
 	      public: 모든 접근이 가능
 	      		  클래스/생성자/메소드 > 다른 클래스 연결
 	      protected: 같은 패키지/상속받은 클래스 > 다른 패키지 접근
 	           	 	 상속이 많은 경우: 변수
 	           	 	  > 거의 사용 빈도가 없다
 	      default: 연습용 > 패키지가 없는 상태
 	       		   같은 패키지안에서만 접근이 가능
 	       		   > 윈도우 컴포넌트(버튼/체크박스)
 	      private:자신의 클래스에서만 사용이 가능
 	      		  인스턴스 변수 > 무조건 getter/setter
 	      		  	ㄴ캡술화
 	      메소드/클래스/인터페이스/생성자 > public
 	      인스턴스 변수 > private
 	      
 	      > 제어자
 	      	static-공통으로 사용
 	      	final-상수/고정된 메소드
 	      	abstract-선언만 된(미완성)
 	      			 추상클래스/인터페이스
 	      	
 	      재사용 기법
 	      1.상속
 	         상속 키워드 extends > 라이브러리 상속 > 변경
 	         단일 상속만 가능
 	         클래스의 크기가 가능하다 
 	           목적
 	            코드 재사용
 	            유지보수가 편리:기능을 미리 알고 있다
 	            간결
 	            반복 제거 
 	            가독성 / 재사용 / 수정용이
 	            최적화 X > 메모리 비대/상위클래스 > 속도가 느려짐
 	              결합성이 높아진다
 	      2.추상클래스
 	      3.인터페이스
 	      클래스간의 공통사용
 	      1.내부 클래스
 	      	 멤버사용: 공통사용 
 	      	 익명사용: 오버라이딩 > 상속
 	      	 		 상속없이 오버라이딩이 가능 > 상속을 사용하지 않는다
 	      	
 	      
 *       
 */
class Animal
{
//	String name="동물";
//	public void run() 
//	{
//		System.out.println("걷는다");
//	}
//	public void eat()
//	{
//		System.out.println("먹는다");
//		
//	}
	int age=3;
}    

		


class Dog extends Animal
{
	
}
public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
