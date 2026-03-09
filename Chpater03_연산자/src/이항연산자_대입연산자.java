/*
 * 대입연산자
 *  복합대입연산자
 *  
 * 1.형변환
 *  int a='A' > a=65
 *  double d=10 > d=10.0
 *  *왼쪽>=오른쪽
 *    ㄴint a=10L=오류
 *  char c='A'=char c=65
 * 2.초기값/계산 결과값 저장
 *   int a=10;
 *   int b=20;
 *   int c=a+b;
 * 3. 기본
 *   int a=0;
 *   double d=0.0
 *   char c=' ';
 *   float f=0.0F;
 *   long l=0L;
 *  복합 대입연산자
 *  
 *    
 */
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c=65;
//		char d=(char)((int)(Math.random()*26)+65);
//		System.out.println(d);
		int sum=0;
		int even=0,odd=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			sum+=i;
		}
		System.out.println("짝수합:"+even);
		System.out.println("홀수합:"+odd);
		System.out.println("총합:"+sum);
		
		String alpha="";
		for(char c='A';c<='Z';c++)
		{
			alpha+=c;
			
		}
		System.out.println(alpha);

	}

}
