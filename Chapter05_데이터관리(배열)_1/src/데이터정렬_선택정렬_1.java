import java.util.Arrays;

public class 데이터정렬_선택정렬_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[5];
		//초기화
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((int)(Math.random()*26)+'A');
			for(int j=0;j<i;j++)
			{
				//alpha[i]=현재발생 / alpha[j]=이전에 저장된 데이터
				if(alpha[i]==alpha[j])
				{
					i--;  // for문을 원상상태유지 > 현재값 변경
					break; //다시 for문을 돌려서 난수를 발생
				}
			} //중복 없는 난수 발생(게임에서 많이 나옴)
		}
		System.out.print("정렬전:");
		for(char c:alpha) // 출력 > for-each
		{
			System.out.print(c+" ");
		}
		System.out.println("\n정렬후:");
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				char temp=alpha[i];
				alpha[i]=alpha[j];
				alpha[j]=temp;
			}
			
		}
		System.out.println(Arrays.toString(alpha));
	

	for(char c:alpha)
	{
		System.out.print(c+" ");
	}
	}
}
