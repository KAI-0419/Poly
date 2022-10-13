package com.poly.part01_test.test05;

public class MyProfile extends Profile implements Job, Display {

	private String loc;
	
	public MyProfile() {}
	public MyProfile(String name, String phone) {
		super(name, phone);
	}
	
	@Override
	public void display() {
		super.printProfile();
		System.out.println("회사 주소: "+loc);
		System.out.println("회사 직종: "+jobId);
	}

	@Override
	public void JobLoc(String loc) {
		this.loc = loc;
	}
	
	
}
