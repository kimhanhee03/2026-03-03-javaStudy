/*
 *  중첩
 *    if(조거문) > if(조거문 && 조건문)
 *    {
 *    	  관리자면
 *    	if(조건문)
 *    	 {
 *    	 }
 *    }
 *    --------------------------------
 *    for(초기값;조건식;증가식)
 *    {
 *    	for(초기값;조건식;증가식)
 *    	{
 *    	  반복 수행 문장
 *      }
 *    }
 *  
 */
public class 제어문_중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) //9줄 만든다
		{
			for(int j=2;j<=9;j++) //8개를 출력
			{
				System.out.printf("%d*%d=%2d\t",j,i,j*i);//한줄에 8개 출력
			}
			System.out.println(); //9줄 만들기
		}
	}

}
