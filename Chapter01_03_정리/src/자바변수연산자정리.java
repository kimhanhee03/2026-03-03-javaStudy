/*
 * 자바 > 웹개발(관련된 자바만 공부)
 * 	
 * 	1.변수: 프로그램에 필요한 데이터 저장
 * 	2.변수를 요청에 따라 처리
 * 		-연산자
 * 		-제어문
 *  3.필요한 데이터 묶기 > 배열/클래스
 *  4.관련된 명령어 묶기 > 메소드
 *  5.프로그램이 종료없이 실행(무중단) > 예외처리
 *  6.라이브러리
 *  	ㄴ웹 관련
 *  
 *  데이터베이스: 오라클(SQL)=필요한 데이ㅓ를 영구적으로 저장
 *  웹화면 UI 
 *    HTML/CSS > 동적 처리(자바스크립트)
 *  브라우저로 데이터 전송: JSP
 *  Spring-Framework/Spring-Boot
 *   ㄴ순서, 기능, 처리하는 방법
 *  CI/CD:우분투>AWS>명령문만 수행
 *  
 * 
 * 
 * 
 * 
 * 
 */
public class 자바변수연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int kor=90;
//		kor++;
//		System.out.println("국어:"+kor);
//		int eng=80;
//		eng--;
//		System.out.println("영어:"+eng);
//		boolean b=true; //boolean는 true/false만 저장이 가능
//		System.out.println(!b);
//		int a='A';
//		System.out.println(a);
//		// 'A'=65 'a'=97 'B'=66 'b'=98 
//		int d=(int)10.5;
//		System.out.println(d);
//		int e=0b1010;
//		System.out.println(e);
//		int s=10%3;
//		System.out.println(s);
//		double i=10/3;
//		System.out.println(i);

//
		int k=80;
		int e=78;
		int m=90;
		int total=k+e+m;
		double avg=total/3.0;
		System.out.println(avg);
		//정수: %d
		//실수: %.f
		//문자: %c
		//문자열: %s
		System.out.printf("%d\n",total);
		System.out.println(avg);
		total++;
		System.out.println(total);
		
//		double i=10/3.0;
//		System.out.println(i);
		int num=100;
		String result=(num%2==0)?"짝":"홀";
		System.out.println(result);
	}

}
