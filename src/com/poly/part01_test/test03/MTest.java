package com.poly.part01_test.test03;

public class MTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("생선");
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("개껌");
		dog.bite();
		
		Eagle eagle = new Eagle();
		eagle.bark();
		eagle.eat("고기");
		eagle.fly();
		
		Animal base = new Cat();
		base.bark();
		
		Animal base1 = new Eagle();
		((Eagle)base1).bark();
		
		Bird b = new Eagle();
		b.fly();
	}

}
