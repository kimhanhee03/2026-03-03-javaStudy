// 중복을 쓸거면 이렇게 단일조건
// 하나만 쓸거면 다중(else)
public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=21;
		if(num%3==0)
		{
			System.out.println(num+"-3의 배수입니다");
		}
		if(num%5==0)
		{
			System.out.println(num+"-5의 배수입니다");
		}
		if(num%7==0)
		{
			System.out.println(num+"-7의 배수입니다");
		}
	}

}
