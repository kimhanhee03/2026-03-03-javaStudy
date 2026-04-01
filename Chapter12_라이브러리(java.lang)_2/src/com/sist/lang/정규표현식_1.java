package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 정규표현식 > 원하는 패턴을 가지고 있는 문자열 검색, 검사하는 클래스
// 문자열 패턴 검색
// 특정 규칙 > 정규식
/*
 *  정규식 > 자바스크립트 , 자바 , 오라클
 */
public class 정규표현식_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="abcasdas";
		// 숫자 포함되어 있는지
		boolean result=msg.matches(".*\\d+.*");
		System.out.println(result);
		
		/*
		 * 	[] 한개의 문자 > [abc] abc중에 한개
		 *                 [^abc] > abc외의 다른 한문자
		 *                 [a-zA-Z] > 알파벳중에 한개
		 *  숫자: [0-9] , \d > \\
		 *  \s: 공백
		 *  \w: 한개 알파벳 > [a-zA-Z]
		 *  \.: . > 임의의 한글자
		 *  ? : 한개거나 없음
		 *  * : 0개 이상
		 *  + : 1개 이상
		 *  {n} : n개
		 *  {n,m} > n부터 m까지
		 *     ㄴ{1,3} > 범위
		 *  a|b > a이거나 b인 경우
		 *  () > 그룹
		 *     ((238.142.63).89) > group(1) > group
		 *     
		 *    > replaceAll , split
		 *  
		 */
		String res="맛있는,맛있다,맛있게,맛있고,맛있고,맛없다";
		Pattern p=Pattern.compile("맛있.");
		Matcher m=p.matcher(res);
		while(m.find())
		{
			System.out.println(m.group());
		}
		
		System.out.println("====데이터 추출====");
		String won="가격: 30000원";
		String change=won.replaceAll("[^0-9]","");
		System.out.println(change);
		
	}

}
