package com.sist.service;
import java.util.*;
import java.util.stream.Collectors;

import com.sist.dao.*;
import com.sist.vo.*;
public class FoodService {
	private List<FoodVo> fList;
	
		public FoodService()
		{
			fList=FoodDAO.getfList();
			
		}
		public List<Optional<FoodVo>> food_list(int page)
		{
			List<FoodVo> list=new ArrayList<FoodVo>();
			int rowsize=10;
			int start=(page*rowsize)-rowsize;
			int end=page*rowsize;
//			list=fList.subList(start, end);
//			List<Optional<FoodVo>> result=list.stream().collect(Collections.toList());
			return fList.subList(start, end)
					.stream()
					.map(Optional::ofNullable)
					.collect(Collectors.toList());
			
		}
		// 상세보기
		public FoodVo food_detail(int no)
		{
			return fList.get(no-1);
		}
		// 검색
		public List<FoodVo> food_type_find(String type)
		{
			return fList.stream()
					.filter(food->food.getType().contains(type))
					.collect(Collectors.toList());
		}
		public List<FoodVo> food_address_find(String addr)
		{
			return fList.stream()
					.filter(food->food.getAddress().contains(addr))
					.collect(Collectors.toList());
		}
	
}
