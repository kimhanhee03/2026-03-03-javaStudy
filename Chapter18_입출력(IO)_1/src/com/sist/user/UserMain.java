package com.sist.user;
import java.util.*;
import com.sist.service.*;
import com.sist.vo.FoodVo;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		FoodService fService=new FoodService();
		while(true)
		{
			System.out.println("==== Menu ====");
			System.out.println("1. 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 검색(음식종류)");
			System.out.println("4. 검색(주소)");
			System.out.println("5. 종료");
			System.out.println("=================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			switch(menu)
			{
				case 5 -> 
				{
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				case 1 ->
				{
					System.out.print("페이지 입력:");
					int page=scan.nextInt();
					List<Optional<FoodVo>> fList=fService.food_list(page);
					List<FoodVo> foods=fList.stream()
							.flatMap(Optional::stream)
							.toList();
					if(foods.isEmpty())
					{
						System.out.println("데이터 없음");
					}
					else
					{
						foods.forEach(f->System.out.println(f.getNo()+"."+f.getName()));
					}
//					String result=fList.stream()
//							.flatMap(Optional::stream)
//							.map(FoodVo::getName)
//							.findFirst()
//							.orElse("데이터가 없음");
//					System.out.println(result);
//							
//					if(fList!=null)
//					{
//						fList.stream()
					
//						.forEach(food->System.out.println(food.getNo()+"."+food.getName()));
//					}
//					else
//					{
//						System.out.println("데이터 없습니다");
//					}
					
				}
				case 2 ->{
					System.out.print("상세볼 맛집 번호:");
					int no=scan.nextInt();
					FoodVo vo=fService.food_detail(no);
					System.out.println(vo);
				}
				case 3->{
					System.out.println("한식,중식,양식,일식,분식:");
					String type=scan.next();
					List<FoodVo> list=fService.food_type_find(type);
					list.stream()
					.forEach(food->System.out.println(
							food.getName()+"("+food.getType()+")"));
				}
				case 4->{
					System.out.println("주소 입력:");
					String type=scan.next();
					List<FoodVo> list=fService.food_type_find(type);
					list.stream()
					.forEach(food->System.out.println(
							food.getName()+"("+food.getAddress()+")"));
				}
				default -> System.out.println("메뉴가 없습니다");
			}
		}

	}

}
