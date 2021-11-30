package org.test;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.FbLoginPojoPage;

import junit.framework.Assert;

public class JunitOrder extends BaseClass{
	
	@BeforeClass
	public static void launchingBrowser() {
		
		launchChrome();
		loadUrl("https://www.facebook.com");
		winMax();
		

	}
	
	@AfterClass
	public static void closingBrowser() {
	
		closeBrowser();

	}
	
	@Before
	public void startTime() {
		Date d=new Date();
		System.out.println(d);

	}
	
	@After
	public void endTime() {
		System.out.println(new Date());

	}
	
	@Test
	public void tc1() throws IOException {
		
		FbLoginPojoPage f=new FbLoginPojoPage();
		fill(f.getTxtuser(), getData(1, 0));

	}
	@Test
	public void tc3() throws InterruptedException, IOException {
		
		FbLoginPojoPage f=new FbLoginPojoPage();
		button(f.getBtnLogin());
		Thread.sleep(2000);
	}
	
	@Test
	public void tc2() throws IOException {
		
		FbLoginPojoPage f=new FbLoginPojoPage();
		fill(f.getTxtpass(),getData(1,0));
		takeScreenshot(null);

}
	@Test
	public void tc4() {
		String title = driver.getTitle();
		Assert.assertTrue("Verify the title", title.contains("Facebook"));
		System.out.println("Success");

	}
	
	@Test
	public void tc5() {
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("https://facebook.com", currentUrl);

	}
}