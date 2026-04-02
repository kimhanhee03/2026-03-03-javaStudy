package com.sist.collection;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

class Sawon{
	private int sabun;
	private String name;
	private String sex;
	private String dept;
	private String job;
	private String loc;
	private long pay;
	
}
public class Collection_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList();
		list.add(new Sawon(1,"홍길동","남자","개발부","사원","서울",3000));
		list.add(new Sawon(2,"김딜동","남자","기획부","사원","부산",3000));
		list.add(new Sawon(3,"장길동","남자","총무부","사원","강릉",3000));
		list.add(new Sawon(4,"홍영동","남자","영업부","사원","경기",3000));
		list.add(new Sawon(5,"홍장수","여자","개발부","사원","서울",3000));
		System.out.println("==== 사원 목록 출력 ====");
		for(Sawon s:list)
		{ //상위 클래스는 하위클래스 정보를 못가져온다?
			//Sawon s=(Sawon)obj;
			System.out.println(
				s.getSabun()+" "
				+s.getName()+" "
				+s.getSex()+" "
				+s.getDept()+" "
				+s.getJob()+" "
				+s.getLoc()+" "
				+s.getPay()+" "
					);
			
		}
		System.out.println("==== 이름 검색 ====");
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		String name=scan.next();
		for(Object obj:list)
		{
			Sawon s=(Sawon)obj;
			if(s.getName().contains(name))
			{
				System.out.println(
						s.getSabun()+" "
						+s.getName()+" "
						+s.getSex()+" "
						+s.getDept()+" "
						+s.getJob()+" "
						+s.getLoc()+" "
						+s.getPay()+" "
							);
			}
		}
		
	}

}
