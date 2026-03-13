/*
 * 데이터 저장(관리)				데이터가공
 *   1개							연산자/제어문-(메소드)				
 *   같은 데이터 여러개-배열(고정적)
 *   다른 데이터 여러개-클래스(가변)
 *   ----메모리----
 * 영구적인 저장
 *   파일
 *   오라클/MYSQL(RDBMS)
 *    	ㄴDB2
 *   XML/JSON
 *  --------------------------------------------------------------------------------------
 *     ㄴ클래스
 *     	 1.데이터 보호: 캡슐화
 *     	 2.재사용: 상속/포함
 *       3.수정/추가: 오버라이딩/오버로딩
 *       4.공통
 *    클래스 여러개 > 한개의 변수로 제어 > 인터페이스
 *     
 *   9장: 라이브러리
 *   		개발한 클래스 + 라이브러리 = 한개 프로그램 
 *   
 *   
 *   기본문법
 *     변수/배열
 *     연산자/제어문
 *     
 *     배열(1차원 배열)
 *      1. 같은 데이터형 여러개 저장이 가능
 *      2. 선언
 *          데이터형[] 배열명
 *      3. 초기화 
 *          데이터형[] 배열명={값.......} > 명시적(이미 알고 있는 경우)
 *          데이터형[] 배열명=new 데이터형[갯수]
 *      4. 값 변경
 *          전체 변경 > 일반 for문을 이용(인덱스)
 *          일부 변경 > 배열명[인덱스]=값
 *      5. 화면 출력 > for=each(향상된 for)
 *           for[] arr={10,20,30}
 *           for(int i:arr)
 *                i=10
 *                i=20
 *                i=30
 *              	>인덱스가 아니라 실제 값
 *         배열도 변수의 일종 > 읽기/쓰기
 *         단점: 고정화/여부분(메모리 크기가 커진다)
 *         
 *         1|
 *         쇼생크 탈출|
 *         드라마|
 *         https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
 *         |팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
 *         |2016 .02.24 재개봉, 1995 .01.28 개봉
 *         |15세 관람가
 *         |프랭크 다라본트
 *         
 *         class Movie{
 *         		String rank,title,actor,poster,grade,regdate,director;
 *         }
 *         Movie[] movies=new Movie[1938]
 *         

 *      
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rank=new String[1938];
		String[] title=new String[1938];
		String[] genre=new String[1938];
		String[] poster=new String[1938];
		String[] actor=new String[1938];
		String[] regdate=new String[1938];
		String[] grade=new String[1938];
		String[] director=new String[1938];
		
	}

}
