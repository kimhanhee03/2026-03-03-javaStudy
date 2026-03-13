/*
 * 
 */
public class 제어문_반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0,e=0,o=0;
		
		int i=1;
		while(i<=100)
		{
			s+=i;
			if(i%2==0)
				e+=i;
			else
				o+=i;
			i++;
		}
		System.out.println("총합:"+s);
		System.out.println("짝합:"+e);
		System.out.println("홀합:"+o);

	}

}
