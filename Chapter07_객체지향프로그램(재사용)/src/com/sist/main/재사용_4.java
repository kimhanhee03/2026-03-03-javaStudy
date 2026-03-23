package com.sist.main;
class H
{
	String name;
	String sex;
	public H()
	{
		name="심청이";
		sex="여자";
		System.out.println("H() Call");
				
	}
}
//class Student extends H
//{
//	public Student(String name,String sex)
//	{
//		this.name=name;
//		this.sex=sex;
//		
//	}
//	public void display()
//	{
//		System.out.println(name);
//		System.out.println(sex);
//	}
//}
class Sawon extends H
{
	String name,sex; // 변수의 오버라이딩
	public Sawon()
	{
		System.out.println("Sawon() Call");
		this.name="박명수";
		this.sex="남자";
	}
	public void dispaly()
	{
		System.out.println(super.name);
		System.out.println(super.sex);
		System.out.println(this.name );
		System.out.println(this.sex);
	}
}
public class 재사용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student std=new Student("홍길동", "성별");
//		std.display();
		Sawon s=new Sawon();
		s.dispaly();
	}

}
