package com.sist.regex;
// ^ and $ > ^ 시작, $끝
public class 정규식_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello".matches("^h.*o$"));
		System.out.println("hello".matches("^h...o$"));
		System.out.println("hello".matches("^h.*"));
		System.out.println("hello".matches(".*o$"));
		
		// 오라클 > CSS에서 많이 나옴
		

	}

}
