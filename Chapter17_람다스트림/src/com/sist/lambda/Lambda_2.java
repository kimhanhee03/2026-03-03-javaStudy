package com.sist.lambda;
/*
 *  많이 사용되는 함수형 인터페이스
 *  Function<T,R> T-> R리턴
 *  Consumer<T> > 입력을 받고 반환 없음
 *  Supplier<T> > 반환만 있는 상태
 *  Predicate<T> > 조건검사 > boolean 변화
 *  
 *  Stream
 *   데이터를 함수형 방식으로 처리하는 API
 */
import java.io.FileReader;
/*
 * 	 stream(): 내부 반복자 > 전체 데이터 수집
 * 	 filter(): if > 조건 검색 > 데이터 추출
 * 	 forEach > 반복출력(추출된 데이터 출력)
 *     
 */
import java.util.*;
import java.util.stream.Collectors;

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
					new FileReader("c:\\JavaDev\\Food.txt");
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
public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodManager fm=new FoodManager();
//		double sum=0.0;
//		int len=fm.fList.size();
//		
//		for(Food f:fm.fList)
//		{
//			sum+=f.getScore();
//			
//		}
//		System.out.printf(" 전체 평점 평균:%.2\n ",(sum/len));
		double avg=
				fm.fList.stream()
				.collect(Collectors.averagingDouble(food->food.getScore()));
		System.out.printf(" 전체 평점 평균:%.2\n ",avg);
	} 

}
}
