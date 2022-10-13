package com.poly.part01_test.test02;

public class Cat implements Animal {
	
	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println(feed + "먹는다");
	}
	
	public void testCat() {
		System.out.println("testCat() 호출..");
	}
	
}
