import java.util.Scanner;
public class 이항연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력(0~100):");
		int s=scan.nextInt();
		
		String res=s>=0 && s<=100?"정상입력":"비정상입력";
		System.out.println("res:"+res);
			
	}

}
