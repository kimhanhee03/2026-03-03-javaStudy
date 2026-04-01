package com.sist.regex;
//0개이상 반복 > *

public class 정규식_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello".matches("H*ello"));
		System.out.println("ho".matches("h.*o"));
		System.out.println("hㄴㅇㅁㅇㄴㅁㅇo".matches("h.*o"));
		System.out.println("hㄴo".matches("h.*o"));
		// .* - 임의의 한글자가 있을 수도 있고 없을 수 있다
		System.out.println("hhdadasda".matches("h*.*"));
		System.out.println("hello".matches(".*"));
		System.out.println("hhdadasda".matches("h*.*"));
		System.out.println("".matches(".*"));
	}
}
