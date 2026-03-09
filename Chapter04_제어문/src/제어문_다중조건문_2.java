// 국어 영어 수학 > 1.총점 2.평균 3.학점(조건문)
// A B C D F
// A+ A0 A-
import java.util.Scanner;
public class 제어문_다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 입력:");
		int kor=scan.nextInt();
		
		System.out.print("영어 입력:");
		int eng=scan.nextInt();
		
		System.out.print("수학 입력:");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		
		double avg=total/3.0;
		
		char score='A';
		/*if(avg>=90 && avg<=100) score='A';
		if(avg>=80 && avg<90) score='B';
		if(avg>=70 && avg<80) score='C';
		if(avg>=60 && avg<70) score='D';
		if(avg<60) score='F'; */
		if(avg>=90) score='A';
		else if(avg>=80) score='B';
		else if(avg>=70) score='C';
		else if(avg>=60) score='D';
		else score='F';

	
		
	
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.println("학점:"+score);




		
		
	}

}
