package com.poly.part01_test.test04;

import java.util.Scanner;

public class Triangle extends AreaImpl {
	
	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변: ");
		int w = sc.nextInt();
		
		System.out.println("높이: ");
		int h = sc.nextInt();
		
		double res = (w*h)/2.0;
		
		super.setResult(res+"");
	}
	
	
}
