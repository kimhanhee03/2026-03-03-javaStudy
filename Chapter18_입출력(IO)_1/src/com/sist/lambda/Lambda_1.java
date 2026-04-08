package com.sist.lambda;
/*
 * 	  1. 코딩
 * 	  2. 메모하는 습관
 * 	  3. 실전 > 구현
 * 	  4. 확장
 * 
 * 
 * 		람다식은 이름 없는 함수 > 선언이 없다 > 코드가 간결해진다
 * 
 * 		객체지향 프로그램
 * 			객체들의 협력해서 상호작용 기준 > 조립식
 * 			코드의 재사용성 / 유지보수 / 확장 / 신뢰성
 * 		함수형 프로그램 (람다)
 * 			결과값이 오직 > 입력값에 따라 영향이 있다
 * 			검증이 쉽다, 성능이 뛰어남
 * 		캐시
 * 	
 */
import java.util.*;
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		numbers.stream()
		.filter(n->n%2==0)
		.forEach(n->System.out.println(n));
		
//		String name=null;
//		System.out.println(name.length());
//		System.out.println("프로그램 종료");
		// null을 방지하는 클래스 Optional
		Optional<String> name=Optional.ofNullable(null);
		System.out.println(name.orElse("이름 없음"));
		// 검색 / 데이터베이스 프로그램
		// 데이터베이스 > isNotNull() isNull > NVL()
		Optional<String> userName=Optional.of("홍길동");
		// 값이 있는 경우 실행
		userName.ifPresent(n->System.out.println("이름:"+n));
		/*
		 * 	orElse(기본값) -> 값이 없는 경우(null) 대신 사용
		 *  ifPresent() > 값이 있을때만 수행
		 *  isPresent() > 값이 있는지 확인
		 *  
		 *   람다 > 코드를 줄인다
		 *   스트림 > 임시메모리(캐시)에 데이터를 한개씩 읽는 것
		 *   Optional > null 안전하게 처리
		 *   
		 *   Optional<String> a=Optional.of("hello") > null 값
		 */
		
		//값 변경
		Optional<String> opt=Optional.of("hello");
		// map > 값 변경
		Optional<Integer> len=opt.map(s->s.length());
		System.out.println(len.get());
		
		//Optional안 Optional > 첨부
		Optional<String> opt2=Optional.of("hello");
		Optional<Integer> result=
				opt2.flatMap(s->Optional.of(s.length()));
		// flatMap: Optional 제거
		System.out.println(result.get());
		
		//필터링
		Optional<Integer> opt3=Optional.of(10);
		opt3.filter(n-> n>5) // if(n>5) > true/false
		.ifPresent(n->System.out.println("5보다 큼"));
		// filter의 조건이 true일때만 수행
		// null > 값이 없는게 아닌 주소가 배정이 안된 상태 
		Optional<String> opt4=Optional.ofNullable(null);
		System.out.println(opt4.isPresent());
		System.out.println(opt4.isEmpty());
	}

}
