package com.sist.regex;
// or > |
public class 정규식_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dog".matches("dog|cat|pig"));
		System.out.println("gif".matches("gif|jpg|png"));
		// > 확장자
		System.out.println("yes".matches("y(es)?"));
		System.out.println("ye".matches("y(es)?"));
		
	}

}
