package com.sist.ref;

import java.lang.reflect.Field;

/*
 *  자바는 시점
 *    ㄴ컴파일 시점(javac)
 *    ㄴ실행 시점(java)
 *    ㄴ리플렉션 실행시점에 클래스의 모든 정보를 읽어서 조작이 가능
 *    	  ㄴSpring / MyBatis / Hibernate
 *     		  ㄴ동적 객체 생성 / 어노테이션 처리
 *     		  ㄴ메소드를 자동호출하게 만드는 
 */
class Student 
{
	private String name="홍길동";
			
}
public class 리플렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Student std=new Student();
			Class cls=std.getClass();
			Field f=cls.getDeclaredField("name");
			f.setAccessible(true); // private 변수 접근이 가능
			System.out.println(f.get(std));
			f.set(std, "박문수");
			System.out.println(f.get(std));
		}catch(Exception ex) {}
	}

}
