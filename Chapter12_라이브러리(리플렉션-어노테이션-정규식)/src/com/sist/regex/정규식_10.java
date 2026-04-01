package com.sist.regex;
/*
 * 	이스케이프 > 이미 기호로 사용되는 문자
 */
public class 정규식_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1+2".matches("1\\+2"));
		System.out.println("a\\b".matches("a\\\\b"));
		System.out.println("^abc$".matches(null));
	}

}
