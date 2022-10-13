package com.poly.part01_test.test01;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		
		System.out.println("선택[1:고양이 2:고양이 3:송아지]");
		System.out.print("번호를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		Animal ani = null;
		
		switch(select) {
		case 1:
			ani = new Cat();
			break;
		case 2:
			ani = new Dog();
			break;
		case 3:
			ani = new Cow();
			break;
		default:
			System.out.println("1부터 3까지 입력하시오");
			break;
		}
		ani.start();
		ani.stop();
		
//		if(ani instanceof Cat) {
//			((Cat)ani).start();
//		}
	}
}