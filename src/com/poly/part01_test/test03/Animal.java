package com.poly.part01_test.test03;

public abstract class Animal {
	
	//추상메소드
	public abstract void bark();
	
	//일반메소드
	public void eat(String feed) {
		System.out.println(feed + "먹는다");
	}
}
