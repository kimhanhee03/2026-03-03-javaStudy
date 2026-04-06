package com.sist.collection;
import java.util.*;
/*
 *  ListIterator: List전용
 *  	ㄴ양방향
 *  	  hasNext() / next() > 처음 - 마지막
 *  	  hasPrevious() / previous() > 마지막 - 처음
 *  	  add(), set(), remove()
 *  	  
 *  
 */
public class Collection_total_2 {
public static void main(String[] args) {
	List<String> list=
			new ArrayList<String>(List.of("A","B","C","D","E"));
	
	ListIterator<String> it=list.listIterator();
	// 순서
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}
	System.out.println("==== 역순 ====");
	while(it.hasPrevious())
	{
		System.out.println(it.previous());
		
	}
}
}
