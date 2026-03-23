
public class P_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100)+1;
			for(int j=0;j<a.length;j++)
			{
				if(max<a[i])
					max=a[i];
			{
				
				//System.out.print("최대값:"+max);
			}
		}
			System.out.print("최대값:"+max);
			
		}
		
	}

}
