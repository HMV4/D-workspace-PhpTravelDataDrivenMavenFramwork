package com.sample;

public class Caller extends Mercury {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Caller c1= new Caller();
		c1.Launch();
		System.out.println("Launch Successfully");
		c1.Register();
		System.out.println("Register Successfully");
		//c1.SignUp();

	}

}
