package org.test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Date;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.FbLoginPojoPage;

public class TestNg extends BaseClass{
	
	@Test(priority=-13)
	private void tc1() throws IOException {
		
		launchChrome();
		winMax();
		loadUrl("https://en-gb.facebook.com/");
		FbLoginPojoPage f=new FbLoginPojoPage();
		fill(f.getTxtuser(), getData(1, 0));
	    
		fill(f.getTxtpass(), getData(2, 0));
	}
	
	@Test(priority=5)
	private void tc2() {
		
		FbLoginPojoPage f=new FbLoginPojoPage();
		button(f.getBtnLogin());
	}
	
	
	@Test (enabled=false)
	private void tc3() {
		System.out.println("Test Case 3");

	}
	 @Test(priority=6)
	private void tc4() {
		System.out.println("Test case 4");

	}
	 @BeforeClass
	 private void startTime() {
		Date d=new Date();
		System.out.println(d);
	}
   
	 @AfterClass
	 private void endTime() {
		
		 Date d =new Date();
		 System.out.println(d);

	}
	 
	 @Test
	 private void tc5() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"), "Invalid Title");

	}
	 
	 @Test(priority=7)
	 private void tc6() {
		System.out.println("Success");

	}
	 
	 @Test
	 private void tc7() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals("https://en-gb.facebook.com/", "https://en-gb.facebook.com", "Current URl failed");

	}
}
