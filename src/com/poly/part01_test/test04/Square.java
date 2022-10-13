package com.poly.part01_test.test04;

import java.util.Scanner;

public class Square extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		int w = sc.nextInt();
		System.out.print("세로: ");
		int h = sc.nextInt();
		
		int res = w*h;
		
//		super.setResult(res+""); //setResult:String값 but res:int값+""=>String
		super.setResult(String.valueOf(res));
	}
	
	@Override
	public void print() {
		System.out.println("사각형의 ");
		super.print();
	}
	
	
	
	
	
	
	
}
