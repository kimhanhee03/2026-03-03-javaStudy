/*
 * 제어문: 프로그램 제어할때 사용
 * 	제어문 종류
 *    -조건문
 *    	단일
 *    	선택
 *    	다중
 *    -선택문
 *    -반복문
 *    	for문=반복횟수 지정
 *    	while문=반복횟수 지정이 없는 경우 > 선 조건 검색
 *    	do~while문=반복횟수 지정이 없는 경우 > 반드시 한번이상 수행
 *    -반복제어문
 *    	break: 반복문장중단
 *    	continue: 특정부분제외
 *    -혼합
 *-------------------기본 문법
 * 	관련된 데이터 묶기: 배열/클래스
 * 	관련된 명령문 묶기: 메소드
 *-------------------묶기(객체지향)
 */
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=49;
		if(num%3==0)
		{
			System.out.println(num+"는 3의 배수");
		}
		if(num%5==0)
		{
			System.out.println(num+"는 5의 배수");
		}
		 if(num%7==0)
		{
			System.out.println(num+"는 7의 배수");
		}
		 char c='3';
		 if(c>='A' && c<='Z')
		 {
			 System.out.println(c+"대문자");
		 }
		 if(c>='a' && c<='z')
		 {
			 System.out.println(c+"소문자");

		 }
		 if(c>='0' && c<='9')
		 {
			 System.out.println(c+"숫자");
			 
		 }
		 String id="admin";
		 String pwd="1234";
//		 if(id.equals("admin") && pwd.equals("1234"))
//		 {
//			 System.out.println("로그인 성공");
//		 }
//		 if(!(id.equals("admin") && pwd.equals("1234")))
//		 {
//			 System.out.println("틀림");
//		 }
		 if(id=="admin" && pwd=="1234")
		 {
			 System.out.println("login");
		 }
	}

}
