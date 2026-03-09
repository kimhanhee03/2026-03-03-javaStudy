import java.util.Random;

public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		//new:동적메모리 할당>heap영역에 저장>클래스를 저장할떄 사용
		int num1=r.nextInt(100)+1;
		int num2=r.nextInt(100)+1;
		int num3=r.nextInt(100)+1;
		/*
		 *  변수 > 반드시 초기값 설정
		 *  초기값
		 *  	1. 명시적 초기값
		 *  		int a=10;
		 *  	2. 입력을 받아서 저장 Scanner
		 *  	3. 컴퓨터가 임의의 설정 random
		 *  	4. 파일 읽기/오라클 일기
		 */
		System.out.println(num1+","+num2+","+num3);
		int min=num1;
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		System.out.println("최소값:"+min);
		
		int max=num1;
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		System.out.println("최소값:"+max);
		
		int mid=num1+num2+num3-max-min;
		System.out.println("중간값:"+mid);
		
	
	}

}
