package com.sist.lambda;

import lombok.Getter;
import lombok.Setter;

/*
 *   사용법
 *     인터페이스 사용
 *       > 조건: 구현이 안된 메소드 1개만
 *         default / static 여러개 있어도 된다
 *       > @FunctionalInterface
 *       > 라이브러리 활용이 많다
 *         조건 검색(if): filter
 *         화면에 출력 forEach
 *      
 *      람다식 구조
 *      (매개변수) > 구현
 *      (매개변수) > {구현}
 *      			 ㄴ실행을 어떻게 할지
 *      -------------데이터 전송
 *      1) 매개변수 없는 경우
 *          () > 실행문장
 *      2) 매개변수 한개인 경우
 *      	name > 실행문장
 *      3) 매개변수 여러개 경우
 *      	(값, 값) > {}
 *      4) 리턴형이 있는 경우
 *          (a,b) > {
 *             int c=a+b;
 *             return c;
 *           }
 *        > 소스가 간결
 *        > 실무에서 주로 > Stream을 주로 사용 (17장)
 *      
 *      17장 > 형식(16장) > 실제 처리하는 것
 *        생성: list.stream() > Consumer
 *        가공: 중간연사 > 필터링 > Supplier
 *        결과: 최종결과 > forEach / collect() > Predicate
 *        				  화면출력    모아서 브라우저 전송
 *        filter(): 조건에 맞는 데이터만 남긴다
 *        map(): 데이터를 다른 형태로 변경
 *        		 급여 > 올린 데이터
 *        collect(): 해당 데이터 모으기(toList)
 *        forEach(): 화면에 출력
 *        			 forEach(System.out::println)
 *        			 // 메소드 참조
 *        
 *        
 */
/*
 *  ~예외처리 > 기본문법
 *  1. String / Math / Wrapper > 정수형 변환
 *  2. StringTokenizer / Date / Calendar
 *  3. Collection > ArrayList, Map
 *  ------------------------------------
 *  4. IO
 *  5. SQL > JDBC
 */
// C001,user001,pw001,김민수,minsu.kim1@test.com,010-1000-0001,서울,2023-01-02,VIP
import java.util.*;
import java.io.*;
@Getter
@Setter

class Customer
{
	private String cno;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private String loc;
	private String regadte;
	private String grade;
}
class CustomerManager
{
	public static List<Customer> cList=new ArrayList<Customer>();
	
	static
	{
		try
		{
			FileReader fr=
					new FileReader("c:\\JavaDev\\고객.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			fr.close();
			String[] datas=data.split("\n");
			for(String cust:datas)
			{
				StringTokenizer st=new StringTokenizer(cust,",");
				Customer c=new Customer();
				c.setCno(st.nextToken()); // 왜 대문자로 써야 하는거지?
				c.setId(st.nextToken());
				c.setPwd(st.nextToken());
				c.setName(st.nextToken());
				c.setEmail(st.nextToken());
				c.setPhone(st.nextToken());
				c.setLoc(st.nextToken());
				c.setRegadte(st.nextToken());
				c.setGrade(st.nextToken());
				cList.add(c);
			}
		}catch(Exception ex) {}
	}
}
public class Lambda_3 {
	// System.out.println();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.메뉴 생성
		Scanner scan=new Scanner(System.in);
		CustomerManager cm=new CustomerManager();
		// static 블록이 실행
		while(true)
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 전체 목록");
			System.out.println("2. VIP 찾기");
			System.out.println("3. 서울 거주자");
			System.out.println("4. 종료");
			System.out.println("===============");
			System.out.print("메뉴입력:");
			int menu=scan.nextInt();
			switch(menu)
			{
			case 4 -> {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			case 1 -> {
//				for(Customer c:cm.cList)
//				{
//					System.out.println(c.getId()+"."+c.getName());
//				}
				cm.cList.forEach(c->System.out.println(c.getId()+"."+c.getName()));
			}
			case 2 -> {
//				for(Customer c:cm.cList)
//				{
//					if(c.getGrade().contains("VIP")) // =="VIP\r"
//					{
//					System.out.println(c.getName()+":"+c.getGrade());
//					}
//				}
			//	cm.cList.forEach(c->System.out.println(c.getId()+"."+c.getName()));
				cm.cList.stream().filter(c->c.getGrade().contains("VIP")) // if
				.forEach(c->System.out.println(c.getName()+":"+c.getGrade())); // for
			}
			case 3 -> {
				cm.cList.stream().filter(c->c.getLoc().equals("서울")) // if
				.forEach(c->System.out.println(c.getName()+":"+c.getLoc())); // for
			}
			default -> System.out.println("없는 메뉴입니다");
							/*
							 *    stream()
							 */
			}
			
		}
	}

}
