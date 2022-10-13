package com.poly.part01_test.test01;

public class Cat extends Animal {

	@Override
	public void start() {
		System.out.println("고양이 걷는다");
	}
	
	@Override
	public void stop() {
		System.out.println("고양이 멈췄다");
	}
}