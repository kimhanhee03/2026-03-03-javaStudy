/*
 * 형식
 *  if(조건)
 *   {
 *     실행문자 > 조건이 true일때 수행
 *   }
 *   조건이 false면 if문장 제외
 */
import java.util.Scanner; 
public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		if(a!=10)
//			System.out.println("a="+a); //if소속문
//		System.out.println("프로그램종료"); //if소속문x > 무조건 수행 > {}에 포함하면 소속
		
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
		
		int com=(int)(Math.random()*3);
		//            0.0~0.99>0.0~2.999>0~2(int로 인해 소수점 없어짐)
		String[] str= {"가위","바위","보"};
		
		System.out.print("컴터:"+str[com]);
//		if(com==0)
//			System.out.print("가위");
//		if(com==1)
//			System.out.print("바위");
//		if(com==2)
//			System.out.print("보");
		System.out.println();
		
		System.out.print("사용자:"+str[user]);
//		if(user==0)
//			System.out.print("가위");
//		if(user==1)
//			System.out.print("바위");
//		if(user==2)
//			System.out.print("보");
		
		System.out.println("\n====결과====");
//		
//		if(com==0 && user==0)
//			System.out.println("draw");
//		if(com==0 && user==1)
//			System.out.println("user win");		
//		if(com==0 && user==2)
//			System.out.println("computer win");		
//		
//		if(com==1 && user==0)
//			System.out.println("computer win");
//		if(com==1 && user==1)
//			System.out.println("draw");		
//		if(com==1 && user==2)
//			System.out.println("user win");		
//		
//		if(com==2 && user==0)
//			System.out.println("user win");
//		if(com==2 && user==1)
//			System.out.println("computer win");		
//		if(com==2 && user==2)
//			System.out.println("draw");	
//		
		int res=com-user;
		if(res==-1 || res==2)
			System.out.println("user win");
		if(res==1 || res==-2)
			System.out.println("computer win");
		if(res==0)
			System.out.println("draw");
	}

}
