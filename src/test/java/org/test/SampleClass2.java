package org.test;

import org.junit.Ignore;
import org.junit.Test;
import org.utilities.BaseClass;

import junit.framework.Assert;

public class SampleClass2 extends BaseClass{

	@Test
	public void tc4() {
		String title = driver.getTitle();
		Assert.assertTrue("Verify the title", title.contains("facebook"));
		System.out.println("Success");

	}
	@Ignore
	@Test
	public void tc5() {
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertEquals("https://facebook.com", currentUrl);

	}

}
