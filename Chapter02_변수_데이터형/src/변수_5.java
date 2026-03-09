
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int drink =12;
		drink=drink-5;
		//drink-=5;
		System.out.println("남은 음료수:"+drink);
		*/
		
		/*
		int s=250;
		int a=100;
		int j=150;
		a=a*2;
		System.out.println("총 칼로리:"+(s+a+j));
		
		int ksum=s+a*2+j;
		System.out.println(ksum);
		*/
		
		String name="홍길동";
		String s="man";
		int age=20;
		double height=180.5;
		boolean isCard=false;
		
		int milk=1200*2;
		int bread=1500*3;
		int egg=200*10;
		
		System.out.println("이름:"+name);
		System.out.println("성별:"+s);
		System.out.println("나이"+age);
		System.out.println("키"+height);
		System.out.println("카드 존재여부:"+isCard);
		
		System.out.println("장바구니의 총합"+(milk+bread+egg));
		
		String nsg="""
				송인 장성규가 영화 '왕과 사는 남자'를 관람 후기를 남겼다.

장성규는 3월 4일 자신의 소셜미디어에 "드디어 봤다 #왕과사는남자 그리고 시작됐다 #단종앓이"라는 글과 함께 사진을 게재했다. 공개된 사진 속에는 장성규가 관람한 '왕과 사는 남자' 티켓이 담겼다.

장성규는 "근데 걱정이다. 항준 형님의 천만 공약이 보통의 것들이 아닌데 천만이 코앞이다. 뱉은 말씀은 지키시는 분이라 더 염려된다. 형님을 지켜드리고 싶은 마음에 관객 수가 999만에서 멈췄으면 좋겠다 #장항준지킴이 #은하철도999"라고 했다.
				""" ;
		
		String msg="70대 1인 생활 기준 월평균 지출은 약 120만~150만 원 정도다. 의료비나 예상치 못한 지출을 고려하면 월 160만 원 정도가 적정하다.\r\n"
				+ "\r\n"
				+ "20년을 기준으로 계산하면 약 1억 5천만~2억 원이 필요하다. 이 금액은 ‘아주 검소하게 사는 기준’이며, 여유는 거의 없는 수준이다.\r\n"
				+ "\r\n"
				+ "\r\n"
				;
		System.out.println(msg);
		System.out.println(nsg);
		
		
	}

}
