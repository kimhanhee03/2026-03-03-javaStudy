package com.sist.collection;
/*
 *  제네릭(13장)
 *   1.정의
 *     클래스나 메소드를 정의할떄 사용할 데이터형을 표준화해서 사용
 *     데이터형의 안정성
 *     재사용성
 *     데이터형을 통일화 시킨다
 *     소스가 간결해진다 > 형변환 없이 사용이 가능 > 가독성
 *   2.사용법
 *     <클래스만 사용이가능>
 *     <int> <double> X
 *     <Integer> <Double> > Wrapper
 *   3.메소드 (매개변수,리턴형), 변수 > 전체가 한번에 변경이 된다
 */
class Box<T>
{
	T t;
	public void setT(T t)
	{
		this.t=t;
		
	}
	public T getT()
	{
		return t;
	}
}
public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box();
		Box<String> box1=new Box<String>();
		/*
		 *  T: Type (클래스형)
		 *  E: Element
		 *  K: Key
		 *  V: Value
		 *  
		 *  Object > 프로그램에 필요한 데이터형으로 변환
		 */
	}

}
