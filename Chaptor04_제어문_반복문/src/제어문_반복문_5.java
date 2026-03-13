
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println(sum);
		
	
		for(int i=1;i<=10;i++)
		{
			if(i%3!=0)
				System.out.print(i+" ");
		}
	System.out.println();
		for(int i=1;i<=10;i++)
		{
			if(i%2==0 && i%5==0)
				System.out.print(i);
			
		}
		
	}

}
