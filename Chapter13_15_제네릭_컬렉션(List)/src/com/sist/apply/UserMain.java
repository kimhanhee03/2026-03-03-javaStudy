package com.sist.apply;


import java.util.*;


public class UserMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지 입력:");
		int page=scan.nextInt();
		
		FoodSystem fs=new FoodSystem();
		ArrayList<Food> list=fs.food_list(page);
		
		for(Food f:list)
		{
			System.out.println(f.getNo()+"."+f.getName());
		}
		System.out.println("===================");
		System.out.println("상세볼 맛집 번호 입력:");
		int no=scan.nextInt();
		Food ff=fs.foodDetail(no);
		System.out.println("===== 맛집 정보 =====");
		System.out.println("맛집명:"+ff.getName());
		System.out.println("음식종류:"+ff.getType());
		System.out.println("주차:"+ff.getParking());
		System.out.println("영업시간:"+ff.getTime());
		System.out.println("가격대:"+ff.getContent());
		System.out.println("테마:"+ff.getName());
		System.out.println("소개:"+ff.getName());
		
	}

}
