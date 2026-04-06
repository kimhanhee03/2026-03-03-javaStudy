package com.sist.collection;
/*
 * 	1.컬렉션이란
 * 		ㄴ데이터(값)를 담아두는 상자(메모리)들을 모음
 * 		   ex) 친구이름 / 전화번호 / 맛집정보...
 * 			> 컬렉션 프레임워크: 쉽게 관리하기 위해 만들어준 것
 * 				장점:표준화(통일화)
 *  2.사용하는 이유
 *  	ㄴ배열
 *  	   1)크기 고정(늘리기,줄이기 어려움) - 고정적
 *  		  일반 목록 출력 > 검색이 어렵다
 *  	   2)기능 부족(정렬/ 검색 직접 구현)
 *      > 배열 보완
 *    	   1)크기 자동 조절
 *    	   2)정렬, 검색 기능 제공
 *    	   3)모든 개발자가 동일하게 사용(소스) > 표준화
 *  3.컬렉션 종류
 *     Collection - interface
 *     	List-interface  
 *     	 *ArrayList
 *     	  Vector
 *     	  LinkedList > Queue
 *     	Set-interface
 *       *HashSet
 *        TreeSet
 *     	Map-interface
 *     	  Hashtable
 *     	 *HashMap
 *     ------------------인터페이스지만 구현된 클래스(메소드는 다 동일)
 *     
 *      > 기준점
 *         List 
 *         Set
 *         Map
 *         
 *        > 데이터를 편하게 저장해서 관리하기 위한 목적
 *        > 프로그램에서 가장 중요한 것
 *        	변수: 데이터 관리
 *         ---------------- React / Vue: 증권
 *         
 *       List
 *         사용처: 순차적으로 데이터 저장
 *         		  인덱스 통해서 접근이 필요한 경우
 *         			ㄴ게시판 / 예약정보 / 장바구니
 *         구현된 클래스
 *         ArrayList: 데이터 베이스(웹 핵심)
 *         			   > 비동기
 *         Vector: 네트워크 > 접속자 관리
 *         			> 동기화
 *         LinkedList: 파일 관리 > C언어
 *         
 *       -----------------------------------------
 *       
 *       -----------------------------------------
 *     
 *     
 */	   
import java.util.*;
/*
 * ArrayList
 *  순서를 가지고 있다(추가시마다 > 자동 인데스) > 배열 기반
 *  // 인데스 번호는 0부터
 *  저장된 데이터 중복 허용
 *  메모리상에 저장 > CRUD
 *  비동기적 > 데이터베이스 연결 > 최적화
 *  주요 기능
 *   추가: add(데이터) - 맨뒤에 추가
 *   	  add(int index,데이터) - 지정된 위치에 추가
 *   삭제: remove(int index)
 *   수정: set(int index, 변경될 데이터)
 *   읽기: get(int index)
 *   갯수: size()
 *   전체 삭제: clear()
 *   데이터 존재 여부: isEmpty() > List
 *   
 *     주로 사용처
 *     	 오라클 데이터를 읽어서 > 브라우저에 전송
 *       쿠키를 읽어서 브라우저에 전송
 *   
 *  
 */
public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장공간을 만든다
		ArrayList<String>list=new ArrayList();
		list.add("홍길동"); // 0
		list.add("심청이"); // 1
		list.add("김문수"); // 2
		list.add("박명수"); // 3
		list.add("이순신"); // 4
		//저장된 데이터 출력
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		
		// 저장
		System.out.println("==== 지정된 위치에 저장 ====");
		list.add(2,"김규선");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		} // 속도가 느려서 잘 안쓰려고 함
		
		//삭제 remove
		System.out.println("==== 삭제후 ====");
		list.remove(3);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//수정 set(int index,값)
		System.out.println("==== 수정후 ====");
		list.set(2, "강감찬");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		//인원 몇명: size
		System.out.println("==== 전 총인원수 ====");
		System.out.println("현재인원:"+list.size());
		
		//전체인원 삭제
		list.clear();
		System.out.println("==== 현 총인원수 ====");
		System.out.println("현재인원:"+list.size());
		
		System.out.println();
		if(list.isEmpty())
		{
			System.out.println("저장된 데이터가 없습니다");
		}
		else
		{
			System.out.println("저장된 데이터가 있습니다");
		}
		//장바구니가 비어있습니다 || 몇개 있습니다 할때 isEmpty를 쓴다
		
		
		
		
	}

}
