// 실제 데이터값을 나중에 대입
//import java.util.Arrays;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5]; //자동으로 초기화
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=(int)(Math.random()*100)+1;	
		}
		for(int a:arr)
		{
			System.out.println(a);
		}

		//System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

	}

}
