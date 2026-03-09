// 개월을 입력 > 계절확인
// 12 1 2 겨울
// 3 4 5 봄
// 6 7 8 여름
// 9 10 11 가을
import java.util.Scanner;
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("월 입력:");
		int no=scan.nextInt();
		if(no>=1 && no<=12)
		{
		if(no>=3 && no <=5)
			System.out.println("봄");
		else if(no>=6 && no<=8)
			System.out.println("여름");
		else if(no>=9 && no<11)
			System.out.println("가을");
		else 
			System.out.println("겨울");
		}
		else
		{
			System.out.println("없는달");
		}
	}

}
