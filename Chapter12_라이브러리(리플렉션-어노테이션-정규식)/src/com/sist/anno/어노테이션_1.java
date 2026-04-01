package com.sist.anno;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 *  어노테이션
 *    ㄴ다른 프로그램에 정보를 제공
 *    ㄴ책 > 목차(인덱스) > 쉽게 찾을 수 있게 만들어 준다
 *    ㄴ구분자
 *       멤버변수
 *       클래스 
 *       메소드
 *       생성자
 *     1.구분은 어떤 것을 할 것인지
 *        @Target
 *          TYPE > 클래스
 *          METHOD > 메소드
 *          CONSTRUCTOR > 생성자
 *          FIELD > 멤버변수
 *     2.저장기간
 *        SOURCE: 클래스파일(.class)가 존재시까지
 *        CLASS: 컴파일시만 유지 > 실행시는 사라진다
 *        RUNTIME: 파일 존재,프로그램 종료시까지
 *     3.public 
 */
class Controller
{
	@RequestMapping("1")
	public void main_page()
	{
		System.out.println("Main Page 이동");
	}
	@RequestMapping("2")
	public void member_Join()
	{
		System.out.println("회원가입 이동");
	}
	@RequestMapping("3")
	public void login()
	{
		System.out.println("로그인 이동");
	}
	@RequestMapping("4")
	public void board_list()
	{
		System.out.println("게시판으로 이동");
	}
	@RequestMapping("5")
	public void fodd_list()
	{
		System.out.println("맛집 목록 이동");
	}
	@RequestMapping("6")
	public void food_detail()
	{
		System.out.println("맛집 상세 이동");
	}
	@RequestMapping("7")
	public void food_jjim()
	{
		System.out.println("맛집 찜 이동");
	}
	@RequestMapping("8")
	public void food_like()
	{
		System.out.println("맛집 좋아요 이동");
	}
}
public class 어노테이션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("====menu====");
		System.out.println("1. Main ");
		System.out.println("2. 회원가입");
		System.out.println("3. 로그인");
		System.out.println("4. 게시판");
		System.out.println("5. 맛집 목록");
		System.out.println("6. 맛집 상세");
		System.out.println("7. 맛집 찜");
		System.out.println("8. 맛집 좋아요");
		System.out.print("메뉴 입력:");
		int menu=scan.nextInt();
//		Controller c=new Controller();
//		if(menu==1)
//			c.main_page();
//		else if(menu==2)
//			c.member_Join();
//		else if(menu==3)
//			c.login();
//		else if(menu==4)
//			c.board_list();
//		else if(menu==5)
//			c.fodd_list();
//		else if(menu==6)
//			c.food_detail();
		try
		{
			//클래스 정보얻기
			Class clsName=Class.forName("com.sist.anno.Controller");
			//객체 생성
			Object obj=clsName.getDeclaredConstructor().newInstance();
			//메소드 정보 가지고 오기
			Method[] methods=clsName.getDeclaredMethods();
			
			for(Method m:methods) 
			{
				//메소드 위에 있는 메소드 찾기
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				if(rm.value().equals(String.valueOf(menu)))
				{ //어노테이션에 있는 문자열과 사용자 요청한 값 같은 경우
					m.invoke(obj, null);
					//해당매소드를 호출한다 > invoke(객체명,매개변수)
				}
			}
			
		}catch(Exception ex){}
		
	}

}
