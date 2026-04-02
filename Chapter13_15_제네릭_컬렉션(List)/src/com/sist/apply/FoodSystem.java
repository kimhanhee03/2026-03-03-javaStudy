package com.sist.apply;
import java.util.*;
import java.io.*;
public class FoodSystem {
	private static ArrayList<Food> fList=
				new ArrayList<Food>();
	/*
	 *  <> : 데이터형 변경
	 *  	 형변환의 문제 발생 > 해결
	 *  데이터형을 모르는 경우 > <?>
	 *  ------------------------------
	 *  1.소스가 간결
	 *  2.형변환이 없다
	 *  3.가독성 > 어떤 데이터가 들어가는지 확인 가능
	 *  4.컬렉션에서 데이터형 안정성을 가지고 있다
	 *      ㄴ컴파일시에 변경이 된다
	 *        변수/매개변수/리턴형
	 *      ㄴ컬렉션/함수형 인터페이스(람다)
	 *      ㄴ클래스에 있는 모든 데이터형을 통일
	 *      T > String
	 *      암것도 안쓰면 Object
	 *      			 ㄴ모든 데이터가 가능 > 프로그램이 불안정함
	 */
	static
	{
		try
		{
			FileReader fr=new FileReader("c:JvaDev\\food.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
				
			}
			fr.close();
			String[] datas=sb.toString().split("\n");
			for(String food:datas)
			{
				Food f=new Food();
				StringTokenizer st=new StringTokenizer(food,"|");
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster("http:\\menupan.com"+st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				
				fList.add(f);
				
			}
		}catch(Exception ex) {}
	}
	//기능
	// 1.목록 > 페이지 subList
	public ArrayList<Food> food_list(int page)
	{
		
		final int ROWSIZE=12;
		int start=(page*ROWSIZE)-ROWSIZE;
		int end=page*ROWSIZE;
		ArrayList<Food> list= new ArrayList<Food>(fList.subList(start, end));
		
		return list;
	}
	public int foodTotalPage()
	{
		return (int)(Math.ceil(fList.size()/12.0));
		
	}
	public Food foodDetail(int no)
	{
		return fList.get(no-1);
	}
	public ArrayList<Food> foodFind(String address)
	{
		ArrayList<Food> list=new ArrayList<Food>();
		for(Food f:fList)
		{
			if(f.getAddress().contains(address))
			{
				list.add(f);
			}
		}
		return list;
	}
	// 2.상세보기
	// 3.검색
	// >출력: main > 윈도우 > 브라우저
	
}
