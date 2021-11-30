package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	
	public static void loadUrl(String url) {
		driver.get(url);
}
	public static void winMax() {
		driver.manage().window().maximize();

	}
	
	public static void closeBrowser() {
	
		driver.close();

	}
	
	public static void printTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void printCurrentUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	
}
	public static void fill(WebElement ref,String value) {
		
		ref.sendKeys(value);

	}
	
	
	
	public static void button(WebElement ref) {
		
        ref.click();
	}
	
	public static void moveElement(WebElement ref) {
		
		Actions a=new Actions(driver);
		a.moveToElement(ref).perform();

	}
	
	public static void dragDrop(WebElement ref1, WebElement ref2) {
		
		Actions a=new Actions(driver);
		a.dragAndDrop(ref1, ref2);
}
	public static void doubleClick(WebElement ref) {
		
		Actions a=new Actions(driver);
		a.doubleClick(ref).perform();
		a.contextClick(ref).perform();

	}
	
	public static void down() throws AWTException {
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);


	}
	
	public static void keyEnter() throws AWTException {
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void keyTab() throws AWTException {
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
}
	public static void paste() throws AWTException {
		
		Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);

	}
	
	public static void capitalLetter(WebElement ref,String value) {
		
		Actions a=new Actions(driver);
		a.keyDown(Keys.SHIFT).perform();
		a.sendKeys(ref,value).perform();
		a.keyUp(Keys.SHIFT).perform();

	}
	
	public static void accept() {
		
		Alert a= driver.switchTo().alert();
		a.accept();

	}
	
	public static void getText() {
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());

	}
	
	public static void dismiss() {
		
		Alert a= driver.switchTo().alert();
		a.dismiss();
	
		
}
	public static void AlertSendKeys(String value) {
		
      Alert a= driver.switchTo().alert();
      a.sendKeys(value);
	}
	
	public static void takeScreenshot(String name) throws IOException {
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Sridhar\\eclipse-workspace\\FrameWorkProject\\Screenshot\\"+name+".jpg");
		FileUtils.copyFile(src, f);
        
	}
	
	public static void executeScriptSendKeys(String val, WebElement ref) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', 'val')",ref);
	}
	
	public static void executeScriptClick(WebElement ref) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",ref);


	}
	
	public static void executeScriptGetValue(WebElement ref) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
        Object o = js.executeScript("returs arguments[0].getAttribute('value')",ref);
        String s=(String) o;
        System.out.println(o);

	}
	
	public static void scrollUp(WebElement ref) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ref);

	}
	
	public static void scrollDown(WebElement ref) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ref);


	}
	
	public static void highlightWebElement(WebElement ref) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow; border:10px solid green;')", ref);

	}
	
	public static void idFrame(String id)
	{
		driver.switchTo().frame(id);
	}
	public static void nameFrame(String name)
	{
		driver.switchTo().frame(name);
	}
	
	public static void indexFrame(int a)
	{
		driver.switchTo().frame(a);
	}
	
	public static void webElementFrame(WebElement ref)
	{
		driver.switchTo().frame(ref);
	}
	
	public static void parentFrame()
	{
		driver.switchTo().parentFrame();
	}
	
	public static void defaultContent()
	{
		driver.switchTo().defaultContent();
	}
	
	public static void windowUrl(String url) {
		driver.switchTo().window(url);

	}
	public static void windowTitle(String title) {
		driver.switchTo().window(title);

	}
	   //2 windows coding
	   public static void windowIds() {
		   
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String eachId : allWindowsId) {
			
			if(!parentId.equals(eachId))
			{
				driver.switchTo().window(eachId);
			}
			
		}
		
	}
	   //more than 2 windows
	   public static void allWindowIds(int a) {
		   
		   Set<String> allWindowsId = driver.getWindowHandles();
		   List<String> li= new ArrayList<String>();
		   li.addAll(allWindowsId);
		   String windows = li.get(a);
		   driver.switchTo().window(windows);
			
		}

	
	
	public static String getData(int num,int cellNumber) throws IOException {
		
		File f=new File("C:\\\\Users\\\\Sridhar\\\\eclipse-workspace\\\\FrameWorkProject\\\\testData\\\\facebook.xlsx");
		FileInputStream fin= new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fin);
		Sheet s= w.getSheet("Greens");
		Row r= s.getRow(num);
		org.apache.poi.ss.usermodel.Cell cell = r.getCell(cellNumber);
		int cellType = cell.getCellType();
		
		String value="";
        
		if(cellType==1)
        {
        	value = cell.getStringCellValue(); 
        	
          }
		
		else if (cellType==0) {
			
			if(DateUtil.isCellDateFormatted(cell))
				
			{
				Date d = cell.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd, MMM, yyyy");
			    value = sim.format(d);
			}
			
			else
			{
				double d = cell.getNumericCellValue();
				long l=(long) d;
				value = String.valueOf(l);
			}
			
		}
		return value;
	}
}




