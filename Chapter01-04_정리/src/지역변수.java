/*
 *  지역변수: {}안에서만 사용 가능
 *  전역변수: 다른 클래스에서 사용이 가능
 */
public class 지역변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		for(int i=0;i<5;i++)
		{
			System.out.print(c++);
		}
	}

}
