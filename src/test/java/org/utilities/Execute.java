package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Execute extends BaseClass{
	
	public static void main(String[] args) {
		
		launchChrome();
		loadUrl("https://en-gb.facebook.com");
		winMax();
		printTitle();
		printCurrentUrl();
	    
	}
 
}
