/*
 *  삼항연산자: 피연산자가 3개인경우
 *    (조건)?값1:값2 > 결과값은 프로그램에 따라 결정
 *     조건: true: 값1
 *    	   false: 값2
 *           ㄴ부정연산자/비교연산자/논리연산자
 *           	ㄴ일반프로그램보다 게임(소스가길다),웹(자바+HTML)에서 주로사용
 *           	
 *  
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=(int)(Math.random()*100)+1;
//		System.out.println("num="+num);
//		
//		String result=num%2==0?"짝수":"홀수";
//		System.out.println(num+"는(은)"+result+"입니다");
		
//		int num=(int)(Math.random()*2);
//		char c=num==0?(char)((int)(Math.random()*26)+65):
//					  (char)((int)(Math.random()*26)+97);
//		System.out.println("c="+c);
//		
//		String result=(c>='A' && c<='Z')?"대문자":"소문지";
//		System.out.println(c+"는(은)"+result+"입니다");
		
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		int num3=(int)(Math.random()*100)+1;
		
		int max=num1<num2?num2:num1;
		int min=num1<num2?num1:num2;
		System.out.println(num1+","+num2);
		System.out.println("큰수:"+max);
		System.out.println("작은수:"+min);
		
		String result=num3%3==0?"3의배수":"3의배수 아님";
		System.out.println(num3+"는(은)"+result);
		

	}
		
}
