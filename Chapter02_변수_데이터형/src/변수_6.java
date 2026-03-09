/*
 * String : 문자열 여러개를 한번에 저장할 수 있는 참조형 데이터형
 *  형식-String 변수명=""
 *       ㄴ웹 가장 많이 사용되는 데이터형
 *       ㄴ클래스형으로 사용이 가능 => 기능 사용
 *       
 *  문자열 결합
 *   +: 산술,문자열 결합
 *    "Hello" + "Java" => "Hello Java"
 *    7+"7"+7 => 777
 *    "77"+7 = 777
 *    7+"7"+7+7+7= "77777"
 *      ㄴ "777"+7+7 => "7777"+7 => "77777"
 *    7+7+"7"+7+7="14777"(앞에서부터 계산하기 떄문)
 *    
 *   ex:영화
 *     -영화명/주연/포스터/장르/등급/개봉일/평점
 *       String:영화명/주연/포스터/장르/등급/개봉일
 *       double:평점
 *   boolean: 존재여부
 *    ㄴ장바구니에 값 있는지
 *    ㄴtrue/false
 *    ㄴ1byte (0,1)
 *      ㄴ로그인여부/중복여부/턴
 *         ㄴex:boolean bCheck=true/false
 *  크기
 *   byte < short < int < long < float < double 
 *          char         
 *   byte/int/long/double
 *   String/boolean
 */
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Call by Value
		int a=10;
		int b=20;
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
			
	}

}
