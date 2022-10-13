package com.poly.part01_test.test01;

public class Dog extends Animal {
	
	@Override
	public void start() {
		System.out.println("멍멍이 걷는다");
	}
	
	@Override
	public void stop() {
		System.out.println("멍멍이 멈췄다");
	}
}
