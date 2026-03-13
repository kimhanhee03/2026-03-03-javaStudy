import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		Random r=new Random();
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt(100)+1;	
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n======");
		int max=a[0];
		int min=a[0];
		
		for(int i:a)
		{
			if(max<i)
				max=i;
			
			if(min>i)
				min=i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		for(int i=0;i<a.length;i++)
		{
			if(max==a[i])
			{
				System.out.println(i);
			}
			if(min==a[i])
			{
				System.out.println(i);
			}
		}
	}

}
