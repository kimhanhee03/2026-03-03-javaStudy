package com.sist.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 *  리플렉션 > 동적제어
 *   ㄴ현재 실행중인 프로그램을 제어
 *                  ㄴ클래스: 멤버변수 / 생성자 / 메소드
 *   ㄴ클래스명 이용
 *   	반드시 패키지명부터 설정
 *   ㄴ메소드 제어(호출), 변수값을 변경
 *   ㄴ					ㄴprivate 접근이 가능
 *   					  OOP가 깨진다 (보안)
 *   ㄴ객체생성
 *   ㄴ어노테이션 확인
 *   -------------------> Spring(자동화)
 *   ㄴ리플렉션 + 어노테이션: 프레임워크 개발
 *   ㄴ자바 스크립트
 *   JSP = MVC = Spring
 *   Vue  Vuex   Pinia
 *   React Redux  Next
 *   
 *   1.클래스 정보 얻기 (멤버변수, 메소드, 생성자)
 *      ㄴ객체 생성 / 멤버변수 주입 / 메소드 호출 > 자동화 처리
 *   2.프레임워크(솔루션) > 개발자
 *     프레임워크 사용(SI/SM) > 프로그래머
 */
class Sawon
{
	private String name;
	public Sawon() {}
	public Sawon(String name)
	{
		this.name=name;
	}
	public void info()
	{
		System.out.println("Sawon:info() Call"+name);
	}
	
}
public class 리플렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성 > ClassNotFoundException
		try
		{
			Class clsName=Class.forName("com.sist.ref.Sawon");
			Constructor con=clsName.getConstructor();
			Object obj=con.newInstance();
			Method m=clsName.getMethod("info");
			m.invoke(obj);
			
			
		}catch(Exception ex) {}

	}

}
