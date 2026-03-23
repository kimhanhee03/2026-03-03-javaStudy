package com.sist.main;

import javax.swing.JFrame;

/*
 *   1.상속 
 *   	ㄴ기능을 그냥 사용하는 것이다
 *   	   ㄴ마음에 안들 경우 변경할 수 있다(오버라이딩)
 *   2.왜 배울까?
 *      1)코드 줄이기 > CV
 *      2)상속받기 > extends
 *      3)상속을 받으면 > 코드를 따라 할 필요가 없다
 *         ㄴ내부적으로 메모리에 저장
 *         ㄴ코드가 이미 상속받은 클래스에 내장
 *   3.오해하는 부분
 *      상속하면 코드 복사하는 것 X
 *      상속 내린 클래스와 연결이 되는 부분
 *       ㄴ상속 내린 클래스를 변경하는 상속받은 클래스에 영향
 *   4.상속 > 재사용 + 기능 추가
 *   		   ㄴ변경
 *       상속은 메모리에 저장하고 사용이 가능 > 고쳐서 사용이 가능 => 오버라이딩
 *       
 *     재사용
 *      상속-is a > 위로 올라갈 수록 "이다" 관계 성립
 *      포함-has a > 가지고 있다
 *      
 *      
 *      
 *      
 *                 
 */
public class 상속_1 /*extends JFrame*/ {
//	public 상속_1()
//	{
//		setSize(800, 600);
//		setVisible(true);
//	}
	JFrame f=new JFrame();
	public 상속_1()
	{
		f.setSize(800,600);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 상속_1();
		
	}

}
