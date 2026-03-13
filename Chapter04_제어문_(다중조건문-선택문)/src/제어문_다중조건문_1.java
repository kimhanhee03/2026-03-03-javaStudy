import java.util.Scanner;
public class 제어문_다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("월:");
		int m=scan.nextInt();
		
		if(m==3||m==4||m==5) //month>=3 && month<=5
		{
			System.out.println("봄");
		}
		else if(m==6||m==7||m==8)
		{
			System.out.println("여름");
		}
		else if(m==9||m==10||m==11)
		{
			System.out.println("가을");
		}
		else if(m==12||m==1||m==2) //이건 and불가능 순차적이지 않아서
		{
			System.out.println("겨울");
		}
		else
			System.out.println("error");
	}

}
