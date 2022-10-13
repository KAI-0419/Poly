package com.poly.part01_test.test03;

public class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("고양이님이 " + feed + " 드십니다");
	}
}
