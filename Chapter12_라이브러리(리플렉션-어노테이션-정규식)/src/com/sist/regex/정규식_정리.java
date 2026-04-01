package com.sist.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Mac;

/*
 * 	 contains
 * 	 startWith
 * 	 endWith
 * 	 
 *   +: 1개 이상
 *    abc+ c반복
 *    (abc)+ 전체 다 반복
 *    
 *   {n} > n번 반복 > 갯수
 *     a{3} > aaa
 *   {n,} > n번 이상 반복
 *     a{3,} > aaa aaaa aaaaa
 *   {n,m} > n~m 반복
 *     a{2,4} > aa aaa aaaa
 *   그룹 > (단어)
 *    
 *   
 */
public class 정규식_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String msg="내 전번은 010-1234-5678 이고"
				+"회사전화는 02-333-4566 입니다";
		//전번만 추출
		String regex="\\d{2,3}-\\d{3,4}-\\d{4}";
		// String regex="(\\d{2,3})-(\\d{3,4})-(\\d{4})";
		// System.out.println("전화번호:"+m.group(1));
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(msg);
		
		while(m.find())
		{
			System.out.println("전화번호:"+m.group());
			System.err.println(m.start()+" "+m.end());
			//  ㄴ전번의 인덱스 번호를 알려주는 것  // 문자열의 인덱스 > 문자열은 0번부터
		}*/
		// 가로 치면 그룹 단위로 가져올 수 있음
		
		/*
		 * 	Matcher
		 * 	  matchers(): 전체 문자열에서 패턴과 일치 여부 > boolean
		 * 	  find(): 부분 일치(패턴 형식)
		 * 	  group(): 찾는 문자열
		 *	  start(): 시작 인덱스
		 *	  end(): 끝 인덱스
		 *	  replaceAll(): 변환
		 */
/*		String msg="비번:1234,또 다른 비번:567";
		String regex="\\d+";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(msg);
		while(m.find())
		{
			System.out.println("비번:"+m.group());
		} */
/*		String email="test@email.com";
		String reg="^[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]{2,}$";
		boolean result=Pattern.matches(reg, email);
		if(result)
		{
			System.out.println("이메일 형식이다");
		}
		else
		{
			System.out.println("이메일 형식 아니다");
		} */
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String today=sdf.format(date);
		System.out.println(today);
		
		//String regex="[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		String regex="(\\d{4})-(\\d{1,2})-(\\d{1,2})";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(today);
		if(m.find())
		{
			System.out.println("오늘 날짜:"+m.group());
			System.out.println("년도:"+m.group(1));
			System.out.println("월:"+m.group(2));
			System.out.println("일:"+m.group(3));
		}
		
		/*
		 *  패턴
		 *   Pattern.matchers > equals > 전체문장
		 *   Matcher.find() > contains
		 *   > 찾은 문자열: group
		 *   > replaceAll()
		 *   > () > 그룹
		 */
		
	}

}
