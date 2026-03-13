import java.util.Random;
import java.util.Scanner;
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random r=new Random();
		int com=r.nextInt(100)+1;
		for(;;)
		{
			System.out.print("1~100사이 정수 입력:");
			int user=scan.nextInt();
			//System.out.println(user);
			if(com>user)
				System.out.println("up");
			else if(com<user)
				System.out.println("down");
			else
			{
				System.out.println("game over");
				System.exit(0); //0:정상종료 / 1:비정상종료
			}
		}
		
	}

}
