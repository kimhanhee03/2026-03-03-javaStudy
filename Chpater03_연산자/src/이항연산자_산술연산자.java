/*
 * 산술연산자
 *  규칙
 *   1. int 이하 데이터형으로 연산하면 int로 변경
 *   2. 큰데이터형으로 결과값이 나온다
 *        ㄴex: int+long=long
 *   
 *   /: 0으로 나누면 에러발생
 *   %: 나머지값 출력
 *       ㄴex: 5%2=1
 *      *결과값이 왼쪽부호를 따라감*
 *       ㄴex: -5%2=-1
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5%2);
		System.out.println(-5%2);
		System.out.println(5%-2);
		System.out.println(-5%-2);
	}

}
