package com.sist.main;
/*
 *  	상속 > 다른 클래스의 변수/매소드는 사용이 가능
 *  						   ㄴ변경해서 사용:오버라이딩
 *  
 *  	오버라이딩:변경해서 덮어쓴다
 *   		1.상속이 존재
 *   		2.매소드명 동일
 *   		3.매개변수 동일
 *   		4.리턴형 동일
 *    	  	5.접근지정어
 *   	
 *   	오버로딩 > 같은 메소드를 이용해서 새로운 기능 생성
 *   	오버라이딩  > 상속해서 받은 기능 변경하는 역할
 *   	상속 > 오버라이딩(변경해서 사용이 가능)
 *   	
 *   	상속을 내리면 복사(메소드,변수) > X
 *   	따로 메모리에 저장후에 사용이 가능하게 연결만 시킨다
 *   	  ㄴ super-상위 this-본인
 *   
 *   	class A
 *   	{
 *   		int a,b;
 *   	}
 *   
 */
class A
{
	public void run() {
		System.out.println("두발로 걷는다");
	}
	public void eat() {
		System.out.println("수저로 먹는다");
	}
}

class Dog extends A
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개같이 먹는다");
	}
	
}
class Pig extends A
{


	public void run() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다");
	}


	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("돼지같이 먹는다");
	}
	
}

class Sup
{
	int a,b;
	public void display()
	{
		System.out.println(this.a);
		System.out.println(this.b);
	}
}
class Sub extends Sup
{
	int c;
	//int a,b;
	public Sub()
	{
		super.a=100;
		super.b=200;
	}
	public void print()
	{
		super.display();
		System.out.println(this.a);
		System.out.println(this.b);

	}
}

public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog d=new Dog();
//		d.run();
//		d.eat();
//		
//		Pig p=new Pig();
//		p.run();
//		p.eat();
		Sub sb=new Sub();
		sb.print();
	}

}
