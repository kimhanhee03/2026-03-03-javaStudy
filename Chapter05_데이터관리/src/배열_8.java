// 컴퓨터와 가위바위보 10 > 2승 2무 6패
import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,lose=0,same=0;
		String[] res= {"가","바","보"};
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			int com=(int)(Math.random()*3);
			System.out.print("가위-0,바위-1,보-2:");
			int user=scan.nextInt()	;
			if(user<0 || user>2)
			{
				System.out.println("Error");
				i--;
				continue;
			}
			System.out.println("컴퓨터:"+res[com]);
			System.out.println("사용자:"+res[user]);
			
			int r=com-user;
			if(r==-1 || r==2)
				win++;
				else if(r==1 ||r==2)
					lose++;
				else
					same++;

		}
		System.out.printf("결과:%d승-%d무-%d패\n",win,same,lose);
//		int com=(int)(Math.random()*3);
//
//		if(com==0)
//			System.out.print("가");
//		else if(com==1)
//			System.out.println("바");
//		else if(com==2)
//			System.out.println("보");
//		Scanner scan=new Scanner(System.in);
//		System.out.print("가0,바1,보2:");
//		int user=scan.nextInt();
//		System.out.println("컴퓨터:"+res[com]);
//		System.out.println("사용자:"+res[user]);
//		System.out.println("=========");
//		int r=com-user;
//		if(r==-1 || r==2)
//			System.out.println("user win");
//		else if(r==1 || r==-2)
//			System.out.println("com win");
//		else 
//			System.out.println("draw");
		
	}

}
