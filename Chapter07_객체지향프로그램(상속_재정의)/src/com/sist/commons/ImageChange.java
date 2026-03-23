package com.sist.commons;
import java.awt.*;
import javax.swing.*;
/*
 *  1.class 멤버변수 사용
 *     ㄴ기본형
 *        ㄴ기본데이터형
 *     ㄴ클래스
 *     ㄴ배열
 *        ㄴ참조데이터형
 *       ㄴ데이터형
 *  2.class
 *     ㄴ데이터형의 사용: 필요한 변수를 모아서 저장
 *     	  VO-spring
 *     	  DTO-MyBatis
 *     	  Bean-JSP
 *     	  Entity-JPA
 *       캡슐화:private + getter/setter
 *     ㄴ메소드만 모아서 저장: 액션 클래스
 *       DAO-데이터베이스 연동
 *       Manager-크롤링/외부에서 파일 불러오기
 *       Service-웹/윈도우 값전송
 *     공통으로 사용 > static
 */
//리턴형 > 클래스
public class ImageChange {
	public static Image getImage(ImageIcon icon,int w,int h)
	{
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}
		
}
