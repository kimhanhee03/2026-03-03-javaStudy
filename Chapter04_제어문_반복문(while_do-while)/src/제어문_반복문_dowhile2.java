import java.util.*;
//               ㄴ Random/Scanner
public class 제어문_반복문_dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int com=r.nextInt(100)+1;
		Scanner scan=new Scanner(System.in);
		do
		{
			System.out.print("1~100 정수 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력");
				continue;
			}
			if(com>user)
				System.out.println("Up");
			else if(com<user)
				System.out.println("down");
			else
			{
				System.out.println("over");
				break;
			}
		}while(true);
	}

}
