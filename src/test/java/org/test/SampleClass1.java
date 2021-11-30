package org.test;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.FbLoginPojoPage;

public class SampleClass1 extends BaseClass{
	
	@BeforeClass
	public static void launchingBrowser() {
		
		launchChrome();
		loadUrl("https://www.facebook.com");
		winMax();
	}
	
	@Test
	public void tc1() throws IOException {
		
		FbLoginPojoPage f=new FbLoginPojoPage();
		fill(f.getTxtuser(), getData(1, 0));
		takeScreenshot("kk");

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

}
