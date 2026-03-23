import java.util.*;
 		
public class P_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[5];
		
		for(int i=0;i<a.length;i++)
		{	
			a[i]=(int)(Math.random()*100)+1;
		}
			
			
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}
}
