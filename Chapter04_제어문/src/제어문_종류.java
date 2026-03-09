/*제어문(연산자 활용)
 * 	  평문-한줄씩 소스코딩
 *    조건문
 *    반복문
 *    한문장만 수행 가능
 *     ㄴif(조건)
 *     	  문장1 > if문 소속
 *     	  문장2 > 별도의 문장
 *          
 *      if(조건){
 *     	  문장1 
 *     	  문장2
 *        }
 *         ㄴ문장1,2 if문 소속
 * 흐름 제어
 *  건너뛴다/반복수행/선택/반복제어
 *   조건문-에러처리(예외처리)/필요한 부분만 출력
      단일 조건문
        if(조건)
            ㄴ부정,비교,논리연산자만 가능
        {
          수행문장
        }
        -여러개 사용가능
        -한개씩 조건을 비교=속도가 낮음
        -사용: 유효성 검사/메뉴처리/웹
 *    선택 조건문
 *    다중 조건문
 *   선택문
 *   반복문
 *    do~while
 *    while
 *    for
 *   반복제어문
 *    break
 *    continue
 */ 
//package > import > class
import java.util.Scanner;
public class 제어문_종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=scan.nextInt(); //입력된 정수 일기
		if(num%2==0) //짝수
		{
			System.out.println(num+"는(은) 짝수입니다");
		}
		if(num%2==1) //홀수
		{
			System.out.println(num+"는(은) 홀수입니다");
		}
	}

}
