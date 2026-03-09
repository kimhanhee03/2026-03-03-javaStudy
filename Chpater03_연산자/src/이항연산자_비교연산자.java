/*
 *  비교하는 연산자
 *   결과값 boolean > true/false
 *    == 같다
 *    != 다르다
 *    < 작다
 *    > 크다
 *    <= 작거나 같다
 *    >= 크거나 같다  
 *   사용할 수 있는 데이터
 *    정수/실수/문자: 다 가능
 *    논리: => == !=
 *    문자열: 사용 x - equals()/compare()
 *    
 *   'A' < 'C' char는 연산자를 사용하면 자동으로 정수형으로 변경
 *    'A'5   'A''A'
 */
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean 
		b1=6==7;
		System.out.println("b1="+b1);
		b1=6!=7;
		System.out.println("b1="+b1);
		b1=6<7;
		System.out.println("b1="+b1);
		b1=6>7;
		System.out.println("b1="+b1);
		b1=6<=7;
		System.out.println("b1="+b1);
		b1=6>=7;
		System.out.println("b1="+b1);
		
		System.out.println("=====================");

		boolean
		c1='A'>'B';
		System.out.println("c1="+c1);
		

	}
	}


