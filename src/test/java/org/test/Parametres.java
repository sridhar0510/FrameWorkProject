package org.test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.FbLoginPojoPage;

public class Parametres extends BaseClass{
	@Parameters({"Greens", "Greens@123"})
	@Test
	  private void tc1(String s1,String s2) throws IOException {
		
		launchChrome();
		winMax();
		loadUrl("https://en-gb.facebook.com/");
		FbLoginPojoPage f=new FbLoginPojoPage();
		fill(f.getTxtuser(), s1);
	    
		fill(f.getTxtpass(), s2);
	
		button(f.getBtnLogin());
	}
	

}
