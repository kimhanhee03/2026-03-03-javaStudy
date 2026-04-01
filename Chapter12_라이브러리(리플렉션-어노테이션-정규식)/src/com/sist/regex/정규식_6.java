package com.sist.regex;
// 문자 집합 [] [abc] > a|b|c [(abc)]
/*
 * 	
 */
public class 정규식_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("cat".matches("[abc]at"));
		// aat bat cat
		System.out.println("bat".matches("[abc]at"));
		System.out.println("a".matches("[a-z]"));
		System.out.println("A".matches("[A-Z]"));
		System.out.println("5".matches("[0-9]"));
		System.out.println("홍".matches("[가-힣]"));

		System.out.println("코미디".matches("[가-힣]{3}"));
		System.out.println("코미디".matches("^코[가-힣]*"));
		
	}

}
