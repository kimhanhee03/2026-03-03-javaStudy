import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 제어문_반복문while4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("👍👍👍👍👍지니뮤직👍👍👍👍👍");
		while(true) //무한루프
		{
			System.out.println("=====메뉴=====");
			System.out.println("1.가요");
			System.out.println("2.트롯");
			System.out.println("3.OST");
			System.out.println("4.POP");
			System.out.println("5.ZAZZ");
			System.out.println("6.CLASSIC");
			System.out.println("7.종료");
			System.out.println("=============");
			System.out.print("메뉴선택:");
			int menu=scan.nextInt();
			
			if(menu<1 || menu>7)
			{
				System.out.println("없는 메뉴입니다");
				continue; // continue
								//while>조건식으로 이동
								//for>증가식으로 이동	
								//break:종료
			}
			
			if(menu==7)
			{
				/*
				 * 종료
				 * 	1. System.exit(0) > 프로그램 자체 종료
				 *  2. while 종료(break)
				 */
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1)
			{
				System.out.println("===가요===");
				Document doc=
						Jsoup.connect("https://www.genie.co.kr//chart//genre?ditc=D&ymd=20260309&genrecode=M0100").get();
				Elements title=doc.select(".title");
				for(int i=0;i<title.size();i++)
				{
					String s=title.get(i).text();
					System.out.println((i+1)+"."+s);
				}
			}
			else if(menu==2)
			{
				System.out.println("===트롯===");
			}
			else if(menu==3)
			{
				System.out.println("===OST===");
			}
			else if(menu==4)
			{
				System.out.println("===POP===");
			}
			else if(menu==5)
			{
				System.out.println("===ZAZZ===");
			}
			else if(menu==6)
			{
				System.out.println("===CLASSIC===");
			}
		}
	}

}
