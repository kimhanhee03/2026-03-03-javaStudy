package com.sist.lambda;
import java.io.FileReader;
/*
 * 	 stream(): 내부 반복자 > 전체 데이터 수집
 * 	 filter(): if > 조건 검색 > 데이터 추출
 * 	 forEach > 반복출력(추출된 데이터 출력)
 *     
 */
import java.util.*;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
class Food{
	private int no;
	private String name;
	private String type;
	private String phone;
	private String address;
	private double score;
	private String parking;
	private String poster;
	private String time;
	private String content;
	private String theme;
	private String price;
	
}
class FoodManager
{
	//맛집 전체의 데이터는 공유 > static
	//오라클 데이터 > static(공유를 목적으로 한다)
	public static List<Food> fList=new ArrayList<Food>();
	//메모리 할당 없이 초기화
	static
	{
		try
		{
			FileReader fr=
					new FileReader("c:\\JavaDev\\Food.None^^");
			StringBuffer sb=new StringBuffer(); 
			//파일읽는 경우 > 1글자 > 통째로 읽어옴(어디 메모리같은 곳에 유적해서 결국에 통째로 어쩌고 저쩌구) > 속도가 빨라짐 정확히는 모르겠음 아직
			// BufferedReader > IO - 한줄씩 읽어옴 > 겁나 빠를듯
			int i=0; 
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
				
			}
			fr.close();
			//맛집별로 나눠서 저장
			String[] datas=sb.toString().split("\n"); // toString?
			//변수로 나눠서 저장
			for(String food:datas)
			{
				Food f=new Food();
				StringTokenizer st=new StringTokenizer(food,"|");
				//순서대로 가져와야 함 변수 정한 클래스에 있는 것들
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				fList.add(f);
				
			}
		}catch(Exception ex) {}
	}
	/*
	 *  1. 정적 변수: static {}
	 *  2. 인스턴스 변수: 생성자를 통해 초기화
	 *  3. 사용자 정의 데이터형 > 데이터를 모아서 한번에 브라우저에 전송할 목적
	 *     DTO (Data Tranfor Object)
	 *  	 ㄴ한개에 대한 정보
	 *  	   학생 1명/맛집 1개
	 */
}
public class lambda_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodManager fm=new FoodManager();
		fm.fList.forEach(food->System.out.println(food.getNo()+"."+food.getName()));
		/*
		 *  for(Food food:fm.fList)
		 *  {
		 *  }
		 */
		System.out.println("================================");
		//평점이 4.0이상
		for(Food food:fm.fList) // stream()
		{
			if(food.getScore()>=4.0) // filter
			{
				System.out.println(food.getName()+":"+food.getScore()); //forEach
			}
		}
		
		System.out.println("================================");
		fm.fList.stream() //데이터 읽기
		.filter(food->food.getScore()>=4.0) // 조건
		.forEach(food->System.out.println(food.getName()+":"+food.getScore())); // 조건에 맞는 데이터만 출력
		// 정렬
		// 가격 기준 정렬
		// 카테고리별 그룹핑 / 평점별 그룹핑
		// 그룹핑 정렬
		
	}

}
