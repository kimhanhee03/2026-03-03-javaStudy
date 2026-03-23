package com.sist.main;
class p
{
	int a=10;
	public void display()
	{
		System.out.println("P call");
	}
	
}
class c extends p
{
	int a=100;
	public void display()
	{
		System.out.println("C call");
	}
}
public class 오버라이딩_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p t=new p();
		System.out.println(t.a);
		t.display();
		
		c d=new c();
		System.out.println(d.a);
		d.display();
		
		p tt=new c();
	//  변수     메소드	
		System.out.println(tt.a);
		tt.display();
		
		//변수 > 클래스에 존재하는 변수
		//메소드 > 생성자타입
		// 상속 > 기본 목적 > 객체 1개 생성 > 여러개의 클래스를 모아관리
	}	

}
