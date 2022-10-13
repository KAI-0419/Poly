package com.poly.part01_test.test04;

import java.util.Scanner;

public class Circle extends AreaImpl {
	
	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		int r = sc.nextInt();
		
		double res = r*r*Math.PI;
		
//		super.setResult(res+"");
		setResult(String.format("%.2f", res));
	}
	
	@Override
	public void print() {
		System.out.print("원의 ");
		super.print();
	}
}
