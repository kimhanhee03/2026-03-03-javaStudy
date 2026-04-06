package com.sist.lambda;
/*
 * 	  람다 > 함수 인터페이스(포인터)
 * 		      익명으로 설정 > 가독성은 떨어진다, 소스가 간결해진다
 */
import java.util.*;
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
		for(int i:list)
		{
			if(i%2==0) 
				System.out.println(i);
		}
		System.out.println("===== 람다 이용 =====");
		list.stream()
		.filter(x-> x%2==0)
		.forEach(System.out::println);
	}

}
