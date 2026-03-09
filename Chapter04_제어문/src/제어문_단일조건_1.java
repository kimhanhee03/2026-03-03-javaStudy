import java.util.Scanner;
public class 제어문_단일조건_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String ch=scan.next();
//		// 입력
//		   =nextInt() > 정수
//		   =next > 문자열
//		   =nextDouble > 실수
		char c=ch.charAt(0); // 문자열에서 문자로 변환
		System.out.println("알파벳:"+c);
		
		if(c>='A' && c<='Z')
			System.out.println(c+"대문자입니다");
		if(c>='a' && c<='z')
			System.out.println(c+"소문자입니다");
		if(c>='0' && c<='9')
			System.out.println(c+"숫자입니다");

	
	}

}
