package Org.task;

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
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			return driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			return driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			return driver = new EdgeDriver();
		}
		return driver;

	}
//1. Url Launch
	public static void urlLaunch(String url) {
		driver.get(url);

	}
//2.Window Maximizw
	//3.Wait
	public static void waitmax(int sec) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	//4.Get Title

	public static void gettile(String title) {
		String title2 = driver.getTitle();
		System.out.println(title2);

	}
//5.Get Current Url
	public static void currentUrl(String url) {
		System.out.println(driver.getCurrentUrl());

	}
//6. Find Elements
	public static WebElement findElement(String locator, String loc) {
		WebElement e = null;
		if (locator.equals("id")) {
			e = driver.findElement(By.id(loc));
		}
		if (locator.equals("name")) {
			e = driver.findElement(By.name(loc));
		}
		if (locator.equals("xpath")) {
			e = driver.findElement(By.xpath(loc));
		}
		return e;

	}
//7.Text Box
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);

	}
//8.Click
	public static void btnClk(WebElement e) {
		e.click();

	}
	// 9.Close
	public static void closeWindow() {
		driver.close();
	}
//10.Quit
	public static void quit() {
		driver.quit();
	}
// 11.Get Attributes
	public static String getAtrribute(WebElement e) {
		String text = e.getAttribute("value");
		return text;

	}
// 12. Get Text
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;

	}
	
	
//13. Double Click
	// 14. Context Click
	public static void Doubleclk(WebElement e) {
		Actions a = new Actions(driver);
		 a.doubleClick(e).perform();
		a.contextClick(e).perform();

	}
// 15. Robot
	public static void keyBoard() throws AWTException {
		Robot r = new Robot();

		for (int i = 0; i < 1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
//16. Simple Alert
	//17. Confirm Alert
	public static String switchToAlert(String warning) {
		String text = null;
		if (warning.equalsIgnoreCase("Accept")) {
			Alert a = driver.switchTo().alert();
			text = a.getText();
			a.accept();

		} else {
			Alert a = driver.switchTo().alert();
			text = a.getText();
			a.dismiss();

		}
		return text;

	}
// 18.Move To Element
	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}
// 19.Drage and Drop
	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target);

	}
// 20. select By Index
	public static void selectByIndex(WebElement e, int n) {
		Select s = new Select(e);
		s.selectByIndex(n);

	}
// 21. Select By Value
	public static void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);

	}
// 22. Select By Visible
	public static void selectByVisible(WebElement e, String text) {
		Select s = new Select(e);
		s.selectByVisibleText(text);

	}
// 23. Window Handling
	public static void nextScreen(int index) {
		Set<String> getallId = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(getallId);
		driver.switchTo().window(li.get(index));
	}
// 24. ScreenShot
	public static String screenShot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenTask\\ScreenShot\\" + name + ".png");
		FileUtils.copyFile(src, des);
		return name;

	}
//25. ScrollDown
	public static void javaScript(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);

	}
//26.JS Text 
	public static void javaScriptText(WebElement e, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argements[0].setAttribute('value','" + text + "')", e);

	}
//27. Action Click
	public static void actionClick(WebElement e) {
		Actions a=new Actions(driver);
		a.click(e).perform();

	}
	//28.Promt Alert
	
	public static void promptAlert(String text) {
		Alert a = driver.switchTo().alert();
a.sendKeys(text);
a.accept();
	}
	//29. isMultipe
	public static boolean multipeClick(WebElement e) {
		Select s=new Select(e);
	   return  s.isMultiple();
	
           
	}
	// 30. Get First Selection Option
	public static String getFirstOption(WebElement e) {
		Select s=new Select(e);
		WebElement option = s.getFirstSelectedOption();
		 return option.getText();
		
       
	}
	//31. DeSelectByIndex
	public static void deSelectIndex(WebElement e, int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);

	}
	//32. DeSelect By Vlue
	public static void deSelectValue(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByValue(value);

	}
	// 33.DeSelect By VisibleText
	public static void deSelectVisible(WebElement e,String text) {
		Select s=new Select(e);
		s.selectByVisibleText(text);
		

	}
	//35.DeSelectAll
	public static void deselectAll(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();

	}
	// 36. Excel
	public static String excel(String name,String sheetname ,int rono, int ceno) throws IOException {
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\MavenTask\\src\\test\\resources\\"+name+".xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheetname );
		Row row = s.getRow(rono);
		
		Cell cell = row.getCell(ceno);
		int type = cell.getCellType();
		String value=null;
		if(type==1)
		   {
			    value = cell.getStringCellValue();
			   
		   } else { 
			   if(DateUtil.isCellDateFormatted(cell))
			   {
				   Date date = cell.getDateCellValue();
				   SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
				    value = sd.format(date);
				   
			   }
			   else {
				   double num = cell.getNumericCellValue();
				   long l=(long)num;
				    value = String.valueOf(l);
				   
			   }
	}
		return value;
	

	}
}
 