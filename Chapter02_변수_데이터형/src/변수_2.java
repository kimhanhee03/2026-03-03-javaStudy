import java.util.Scanner;



public class 변수_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		내 풀이
		int 사과=5;
		int 먹은수=2;
		System.out.println("사과의 갯수:"+(사과-먹은수));
		여기서 나는 변수2개를 사용한 것
		
		강사님 풀이
		int 사과=5;
		사과=사과-2;
		System.out.println("남은사과:"+사과);
		*/
		
		/*
	    내풀이
		int 국어=90;
		int 영어=80;
		int 수학=70;
		int 총합=국어+영어+수학;
		System.out.println("평균값:"+총합/3);
		*/
		
		Scanner scan=new Scanner(System.in);
		/*
		System.out.println("국어 점수 입력:");
		int 국어=scan.nextInt();
		System.out.println("국어:"+국어);
		*/
		
		System.out.print("국어 영어 수학 점수 입력:");
		int 국어=scan.nextInt();
		int 수학=scan.nextInt();
		int 영어=scan.nextInt();
		System.out.println("총점:"+(국어+영어+수학));
		System.out.printf("평균:%.2f",(국어+영어+수학)/3.0);
	}

}
