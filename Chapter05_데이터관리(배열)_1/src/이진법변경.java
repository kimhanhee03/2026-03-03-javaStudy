/*
 *  16bit > 32767
 *  10
 *  0000 0000 0000 1010
 * 
 */
import java.util.*;
public class 이진법변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] binary=new int [16];
		//저장 순서 > 0부터 15부터
		int index=15; //뒤에서부터 저장
		
		System.out.print("0~32767까지 사이의 정수 입력:");
		int num=scan.nextInt();
		
//		System.out.println("라이브러리:"+Integer.toBinaryString(num));
//		System.out.println("라이브러리:"+Integer.toOctalString(num));
//		System.out.println("라이브러리:"+Integer.toHexString(num));

		
		//횟수가 지정되지 않았다 > while
		while(true)
		{
			//2로나누고 나머지저장,2로 나누다>1,0이 나올때까지 반복
			binary[index]=num%2;
			num=num/2; 
			if(num==0)
				break;
			
			index--;
		}
		//실제출력
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
		
	}

}
