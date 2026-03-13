/*
 *  1.배열 선언
 *  2.배열 초기화
 *  3.반복문을 이용한 데이터 출력
 *  4.배열 복사
 *  5.동적 생성
 *  
 *  1)선언
 *    데이터형[] 배열명; (권장사항)
 *    데이터형 배열명[]; (C언어 호환)
 *    	정수-int[] arr
 *    	문자-char[] arr
 *    	문자열-String[] arr
 *    	실수-douyble[] arr
 *    	논리-boolean[] arr
 *  2)몇개?>초기화
 *  	int[] arr={10,20,30}; //선언+초기화
 *  		ㄴ참조변수( 저장된 메모리의 주소만 가지고 있는 변수)
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		System.out.println("arr:"+arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
//		arr[0]=100;
//		arr[1]=200;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("=============");
		//향상된 for문 > 화면 출력(브라우저에서 출력)	
		for(int b:arr)
		{
			System.out.println(b);
		}
		
	}

}
