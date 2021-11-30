package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.FbLoginPojoPage;

public class TestNg extends BaseClass{
	
	@Test(priority=-13)
	private void tc1() throws IOException {
		
		launchChrome();
		winMax();
		loadUrl("https://en-gb.facebook.com/");
		WebElement f = driver.findElement(By.id("email"));
		f.sendKeys("8892429566");
		WebElement d = driver.findElement(By.name("pass"));
		d.sendKeys("Krishnamoorthy@123");

	}
	
	@Test(priority=5)
	private void tc2() {
		
		FbLoginPojoPage f=new FbLoginPojoPage();
		button(f.getBtnLogin());
	}

}
