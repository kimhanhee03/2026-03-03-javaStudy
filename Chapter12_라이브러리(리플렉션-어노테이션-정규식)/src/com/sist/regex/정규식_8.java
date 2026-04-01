package com.sist.regex;
// 그룹 > () 단어 포함 [abc] a,b,c (abc) > abc
public class 정규식_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abcabc".matches("(abc)+"));
		System.out.println("abc".matches("(abc)*"));
		System.out.println("hahahe".matches(("(ha)+he")));
		System.out.println("aabb".matches("(a+b+)+"));
		System.out.println("123123".matches("(\\d+)+)"));
	}

}
