package com.sist.collection;
import java.lang.reflect.Array;
/*
 * 	CRUD
 * 	 > add, get, remove, set
 * 	 > 두개의 list에서 중복된 데이터 관리
 * 		contains All() > UNION
 * 		 > JOIN
 * 	 > retainAll > 교집합 > INTERESCT
 *   > addAll() > 전체 데이터 > UNION ALL
 *   > subList: 부분적 복사(중복구매)
 */
import java.util.*;
public class Collection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		// 모든 데이터: Object
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(6);
		System.out.println("==== 데이터 출력 ====");
		// > 실제 데이터 값 > 데이터가 같거나 큰 데이터형 사용
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		System.out.println("==== 일부만 추출 ====");
		//ArrayList list2=new ArrayList();
		ArrayList list2=new ArrayList(list.subList(1, 4));
											 // start end(-1)
		list2.add(10);
		list2.add(11);
		list2.add(12);
		for(Object obj:list2)
		{
			System.out.println(obj);
		}
		
		//정렬 > sort
		System.out.println("==== 정렬 후 ====");
		Collections.sort(list);
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		System.out.println("==== 같은 데이터 추출 ====");
		// retainAll
		list.retainAll(list2);
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		System.out.println("==== 전체 복사 ====");
		ArrayList list3=new ArrayList();
		list3.addAll(list);
		for(Object obj:list3)
		{
			System.out.println(obj);
		}
		
		System.out.println("==== containAll ====");
		list.containsAll(list2);
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
		// addAll(): list에 있는 모든 데이터 복사
		// retainAll(): 두개의 list에 공통 데이터 추출
		// Collections.sort() > 정렬
		// ----------------------------표준화 > 개발자가 동일하게
	}

}
