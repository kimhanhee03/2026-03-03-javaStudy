import java.util.Random;
public class 선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int i=r.nextInt(100)+1;
		System.out.println("정수값:"+i);
		if(i%2==0)
			System.out.println(i+":짝수");
			else
				System.out.println(i+"홀수");
		
		char c='A';
		if(c>='A'&& c<='Z')
		System.out.println(c+"대문자");
		else
			System.out.println(c+"소문자");
			
	}

}
