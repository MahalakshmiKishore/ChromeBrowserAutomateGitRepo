package com.sgtesting.unittests.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {
	
	@Test
	public void createProduct()
	{
		System.out.println("The Product demoProduct1 has created Successfully");
	}
	

	@Test
	public void modifyProduct()
	{
		System.out.println("The Product demoProduct1 has modified Successfully");
	}
	
	@Test
	public void deletedProduct()
	{
		System.out.println("The Product demoProduct1 has deleted Successfully");
	}
	
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Browser, Navigate the Application URL and login into the Application");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the application and close the Application");
	}

}
