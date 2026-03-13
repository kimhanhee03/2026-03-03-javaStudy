
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a3=0,a5=0,a7=0;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%3==0)
//				a3++;
//			if(i%5==0)
//				a5++;
//			if(i%7==0)
//				a7++;
//			
//		}
//		System.out.println("3의 배수 갯수"+a3);
//		System.out.println("5의 배수 갯수"+a5);
//		System.out.println("7의 배수 갯수"+a7);
//		
		int a=0,b=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				a+=i;
			else	//if(i%2!=0) 
				b+=i;
		}
		System.out.println("짝:"+a);
		System.out.println("홀:"+b);

	}

}
