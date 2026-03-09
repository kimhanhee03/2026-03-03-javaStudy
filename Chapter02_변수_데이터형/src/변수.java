/*
 *  프로그램 언어는 변수//데이터형
 *    연산처리
 *    프로그램 제어(제어문)
 *    결과 출력
 *    
 *  저장공간 (메모리)
 *   MethodArea : 메모리 / 정적 데이터 저장(static)
 *   Stack => 변수저장 => 메모지 자체 관리
 *   Heap => 개발자가 만든 데이터형이 저장
 *   
 *  변수 = 데이터를 한개 저장하는 메모리 공간의 주소의 별칭
 *  
 *  데이터 저장 키워드
 *    정수 : 
 *    	byte(8bit=1byte=128~127)
 *        ㄴ 네트워크 전송, 파일 다운, 파일 복사
 *    	short(16bit=2byte=32768~32767)
 *    	  ㄴ 사용용도 거의 X, C언어 호환 문제
 *    	int(32bit=4byte=21억4천)
 *        ㄴ default 
 *        ㄴ 가장 많이 사용
 *        ㄴ 숫자를 사용하면 컴터는 무조건 4byte 인식
 *    	long(64bit=8byte)
 *        ㄴ 금융권, 빅데이터, 공공기업 => 정산/회계/통계
 *    실수 : float, double
 *    문자 : char
 *    논리 : boolean
 *    참조 : String
 *    
 *    변수 / int a=10;
 *    상수 / final int A=10;
 *    변수는 필요시 변경가능 상수는 정해진 값(final이 있으면 상수)
 *    변수명-같은{}안에서는 같은 이름의 변수를 사용 X
 *    
 *    식별자
 *     1.알파벳이나 한글로 시작
 *        ㄴ대소문자 궂분
 *     2.숫자 사용이 가능 
 *        ㄴ앞에 사용 금지 ex:1a,2a X, a1,a2 O
 *     3.특수문자 사용가능: _,$
 *        ㄴ두개이상의 단어가 있는 경우 ex:file_name _count(임시변수)
 *     4.키워드는 사용불가
 *        ㄴ자바에서 사용중에 있는 단어
 *     5.변수명에 공백이 없어야 된다
 */
public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte b=200;
        //System.out.println(100);
		
		// 1문제
		/*
        int 사과=3;
        int 배=2;
        System.out.println("사과:"+사과);
        System.out.println("배:"+배);
        System.out.println("과일의 총갯수:"+(사과+배));*/
        
        // 2문제
		/* 내가 푼 것
	    int 배=2000;
	    System.out.println("총가격:"+(사과*배));*/
	    /* 정답
	    int aPrice=1000;
	    int pPrice=2000;
	    
	    int 사과=3;
	    int 배=2;
	    
	    int total=aPrice*사과+pPrice*배;
	    System.out.println("총가격:"+total);*/
		
		// 3문제
		/*
		int 사과=10;
		System.out.println(사과/3.0);*/
		
		/* 심심풀이
		int a=30;
		int b=15;
		System.out.println("결과:"+a/b);*/
			

	}

}
