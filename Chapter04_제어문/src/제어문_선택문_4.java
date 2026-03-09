import java.util.Scanner;

public class 제어문_선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1 정수:");
		int num1=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		String op=scan.next();
		
		System.out.print("2 정수:");
		int num2=scan.nextInt();
		
		switch(op)
		{
		case "+":
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case "-":
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			break;
		case "/":
			if(num2==0)
				System.out.println("0으로 불가능");
			else
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			break;
			default:
				System.out.println("연산처리 불가능");
			
		}
		
		

	}

}
