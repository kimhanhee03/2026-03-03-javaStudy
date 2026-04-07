package com.sist.lambda;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// 고객관리(응용)
// 회원 + 주문 > 관리자 통계 
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class User
{
	private String name;
	private int age;
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Order
{
	private String userName;
	private int price;
}
public class Stream_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users=Arrays.asList(
				new User("홍길동",27),
				new User("김길돈",15),
				new User("마현수",30),
				new User("전두광",22),
				new User("강갈난",28)
				);
		List<Order> orders=Arrays.asList(
				new Order("홍길동",20000),
				new Order("김길돈",27000),
				new Order("마현수",25000),
				new Order("전두광",55000),
				new Order("강갈난",12000),
				new Order("홍길동",10000),
				new Order("김길돈",30000),
				new Order("마현수",28000),
				new Order("홍길동",25000),
				new Order("김길돈",34000),
				new Order("마현수",12000)
				);
		//1.성인 회원만 출력
		System.out.println("=== 성인 회원 ===");
		List<User> adults=users.stream()
				.filter(u->u.getAge()>=18)
				.collect(Collectors.toList());
		//List에 조건에 맞는 회원만 담아준다 > toList()
		//브라우저,윈도우로 전송
		adults.stream()
		.forEach(u->System.out.println(u.getName()+"("+u.getAge()+")"));
		
		System.out.println("=== 회원 이름만 추출 ===");
		List<String> names=users.stream()
				.map(User::getName) //리턴형이 String머시기
				.collect(Collectors.toList());
		names.stream()
		.forEach(System.out::println);
		
		System.out.println("==== 특정회원의 주문만 조회 ====");
		Scanner scan=new Scanner(System.in);
		System.out.print("이름입력:");
		String n=scan.next();
		List<Order> kims=orders.stream()
				.filter(o->o.getUserName().equals(n))
				.collect(Collectors.toList());
		kims.stream()
		.forEach(k->System.out.println(k.getUserName()+","+k.getPrice()));
		
		System.out.println("==== 총 주문 금액 계산 ====");
		int total=
				orders.stream()
				.map(Order::getPrice) //처리할 데이터가 뭐냐
				.reduce(0, Integer::sum);
		DecimalFormat df=new DecimalFormat("#,###,###,###");
		//변환하는 클래스 사용
		//숫자:DecimalFormat , 날짜:SimpleDateFormat
		System.out.println("총금액:"+df.format(total)+"won");
		//매출 통계
		//사용자별로
		int hong=0,kim=0,ma=0,jun=0,gang=0;
		for(Order o:orders)
		{
			if(o.getUserName().equals("홍길동"))
				hong+=o.getPrice();
			
			if(o.getUserName().equals("김길돈"))
				kim+=o.getPrice();
				
			if(o.getUserName().equals("마현수"))
				ma+=o.getPrice();
				
			if(o.getUserName().equals("전두광"))
				jun+=o.getPrice();
				
			if(o.getUserName().equals("강갈난"))
				gang+=o.getPrice();
				
			}
		System.out.println("홍길동->"+hong);
		System.out.println("김길돈->"+kim);
		System.out.println("마현수->"+ma); 
		System.out.println("전두광->"+jun);
		System.out.println("강갈난->"+gang);
		
		System.out.println("==== stream() 람다 ====");
		Map<String,Integer> result=orders.stream()
				.collect(Collectors.groupingBy(Order::getUserName,Collectors.summingInt(Order::getPrice)));
		System.out.println("홍길동->"+result.get("홍길동"));
		System.out.println("김길돈->"+result.get("김길돈"));
		System.out.println("마현수->"+result.get("마현수"));
		System.out.println("전두광->"+result.get("전두광"));
		System.out.println("강갈난->"+result.get("강갈난"));
		System.out.println();
		Set<String> set=result.keySet();
		for(String s:set)
		{
			System.out.println(s+"->"+result.get(s));
		}
		
		System.out.println("amx");
		Optional<Order> maxOrder=
				orders.stream().max(Comparator.comparing(Order::getPrice));
		System.out.println(maxOrder);
	}

}
