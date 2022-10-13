package com.poly.part01_test.test01;

public class Cow extends Animal {
	
	@Override
	public void start() {
		System.out.println("송아지 걷는다");
	}
	
	@Override
	public void stop() {
		System.out.println("송아지 멈췄다");
	}
}
