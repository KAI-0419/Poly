package com.poly.part01_test.test01;

public abstract class Animal {

	public void test() {
		System.out.println("Animal의 test() 호출..");
	}
	
	//추상 메소드 선언 -> 상속받는 클래스 반드시 구현
	public abstract void start();
	public abstract void stop();
}
