package com.poly.part01_test.test02;

public class Dog implements Animal {
	
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println(feed + "먹는다");
	}
	
	public void testDog() {
		System.out.println("testDog() 호출..");
	}
	
}
