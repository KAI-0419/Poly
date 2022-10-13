package com.poly.part01_test.test02;

public class MTest {

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.bark();
		cat.eat("참치");
		cat.testCat();
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("뼈다귀");
		dog.testDog();
		
		Animal ani = new Cat();
		
	}

}
