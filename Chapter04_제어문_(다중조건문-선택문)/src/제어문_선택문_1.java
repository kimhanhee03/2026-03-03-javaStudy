import java.util.Scanner;

public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("월:");
		int m=scan.nextInt();
//		System.out.print("문자열:");
//		String msg=scan.nextLine();
//		System.out.println(msg);
		// nextLine-전체문장 next-공백 전까지만
//		switch(m)
//		{
//		case 3:
//		case 4:
//		case 5:
//			System.out.println(m+":봄");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println(m+":여름");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println(m+":가을");
//			break;
//		case 12:
//		case 1:
//		case 2:
//			System.out.println(m+":겨울");
//			break;
//		default: System.out.println("error");
//		}
		switch(m)
		{
		case 3,4,5->System.out.println("봄");
		case 6,7,8->System.out.println("여름");
		case 9,10,11->System.out.println("가을");
		case 12,1,2->System.out.println("겨울");
		default-> System.out.println("error");
		} //레전드 심플
	}

}
