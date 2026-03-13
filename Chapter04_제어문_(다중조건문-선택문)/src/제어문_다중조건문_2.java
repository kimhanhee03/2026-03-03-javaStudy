import java.util.Scanner;
public class 제어문_다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("점수(0~100):");
		int sc=scan.nextInt();
		
		char c='A';
//		if(sc>=90)
//			c='A';
//		else if(sc>=80)
//			c='B';
//		else if(sc>=70)
//			c='C';
//		else if(sc>=60)
//			c='D';
//		else
//			c='F';
//		System.out.println("학점:"+c);
		
//		switch(sc/10)
//		{
//		case 10,9->System.out.print('A');
//		case 8->System.out.print('B');
//		case 7->System.out.print('C');
//		case 6->System.out.print('D');
//		default->System.out.print('F');
//		}
		
		String s=switch(sc/10) {
		case 10,9->"A";
		case 8->"B";
		case 7->"C";
		case 6->"D";
		default->"F";
		};
		System.out.println(s);
	}

}
