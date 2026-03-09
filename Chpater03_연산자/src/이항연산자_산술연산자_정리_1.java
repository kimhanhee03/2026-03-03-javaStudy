import java.util.Scanner;
import java.text.*;
public class 이항연산자_산술연산자_정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수:");
		int kor=scan.nextInt();
		
		System.out.println("영어 점수:");
		int eng=scan.nextInt();
		
		System.out.println("수학 점수:");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		
		double avg=total/3.0;
		
		double[] limits= {50,60,65,70,74,77,80,84,87,90,94,97};
		String[] score= {"f","d-","d0","c-","c0","c+","b-","b0","b+","a-","a0","a+"};
		
		ChoiceFormat cf=new ChoiceFormat(limits,score);
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.println("학점:"+cf.format(avg));

		
	}

}
