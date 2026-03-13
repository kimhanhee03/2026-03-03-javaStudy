import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print(":");
		int num1=scan.nextInt();
		
		System.out.print("+,-,*,/,:");
		String op=scan.next();
		
		System.out.print(":");
		int num2=scan.nextInt();
		
//		switch(op)
//		{
//		case "+":
//			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
//			break;
//		case "-":
//			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
//			break;
//		case "*":
//			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
//			break;
//		case "/":
//			System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
//			break;
//		default: System.out.println("error");
//		}
		
		switch(op)
		{
		case "+","%"-> {
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			System.out.printf("%d%%d=%d\n",num1,num2,num1%num2);}
			
		case "-"->
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			
		case "*"->
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			
		case "/"->
			System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			
		default-> System.out.println("error");
		}
	}

}
