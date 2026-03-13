/*
 * 1.형식
 * 	  초기값
 * 	  do
 * 	  {
 *   	실행문장(한번은 반드시 실행)
 *   	증가식
 *    }while(조건식);
 *    
 *    
 */
import javax.swing.JOptionPane;
public class 제어문_반복문_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
//		while(i<=10)
//		{
////			if(i==4)
////				continue;
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("e");





int i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
			System.out.println();
			char c='A';
			do
			{
				System.out.print(c+" ");
				c++;
			}while(c<='Z');
			c='0';
			System.out.println();
			do
			{
				System.out.print(c+" ");
				c++;
			}while(c<='9');
			
			System.out.println();
			
			String s=JOptionPane.showInputDialog("입력");
			System.out.println("글자수:"+s.length());
			int count=0;
			i=0;
			do
			{
				char d=s.charAt(i);
				if(d=='A' || d=='a')
					count++;
			}while(i<s.length());
			
			System.out.println(count);
	}

}
