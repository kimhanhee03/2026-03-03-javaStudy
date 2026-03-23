/*
 * 		공통으로 적용되는 메소드/변수
 *        상속
 *         코딩을 줄일 수 있다
 *         필요시 변경해서 사용 가능=오버라이딩
 *         추상 클래스 / 인터페이스 > 상속/오버라이딩
 */

package com.sist.manger;

public class GenieMusicManger {
	public static Music[] musics=new Music[100];
	// static {} , 생성자
	public void init()//크롤링후 배열에 저장
	{
		
	}
	// 목록 출력
	public Music[] musicAllData()
	{
		return musics;
	}
	// 상세 보기
	public Music musicDetail(int mno)
	{
		Music m=new Music();
		for(Music mm:musics)
		{
			if(mm.getMno()==mno)
			{
				m=mm;
				break;
			}
		}
		return m;
	}
	// 검색
	public Music[] musicFind(String type,String fd)
	{
		return musics;
	}
	// 동영상
	public String musicKey(String title)
	{
		String key="";
		return key;
	}
}
