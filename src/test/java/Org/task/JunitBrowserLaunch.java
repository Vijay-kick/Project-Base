package Org.task;

import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitBrowserLaunch extends BaseClass {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		browserLaunch("Chrome");
		urlLaunch("http://adactinhotelapp.com/");
		waitmax(10);
	}

	@AfterClass
	public static void afterClass() {
		//driver.close();
	}

	@Before
	public void before() {
		Date d = new Date();
		System.out.println("Before ... Test  " + d);
	}

	@After
	public void after() {
		Date d = new Date();
		System.out.println("After...Test  " + d);
	}

	@Test
	public void test1() throws InterruptedException {
System.out.println("Test 1 Case -----------------");
		sendKeys(findElement("name", "username"), "SuperBook");
		sendKeys(findElement("name", "password"), "7XOO0P");
		btnClk(findElement("id", "login"));
		Thread.sleep(3000);
	}

	@Test
	public void test2() throws InterruptedException {
		
System.out.println("Test 2 Case---------------------");
		selectByVisible(findElement("id", "location"), "Sydney");
		selectByIndex(findElement("id", "hotels"), 1);
		selectByIndex(findElement("id", "room_type"), 2);
		selectByIndex(findElement("id", "room_nos"), 3);
		btnClk(findElement("id", "Submit"));
		Thread.sleep(2000);
	}

	@Test
	public void test3() {
		System.out.println("Test 3 Case ----------------------------");
		btnClk(findElement("id", "radiobutton_0"));
		btnClk(findElement("id", "continue"));
	}

	@Test
	public void test4() throws InterruptedException {
		System.out.println("Test 4 Case -------------------------");
		sendKeys(findElement("id", "first_name"), "Test");
		sendKeys(findElement("id", "last_name"), "Task");
		sendKeys(findElement("id", "address"), "America");
		sendKeys(findElement("id", "cc_num"), "1234567890123456");
		selectByIndex(findElement("id", "cc_type"), 1);
		selectByIndex(findElement("id", "cc_exp_month"), 2);
		selectByVisible(findElement("id", "cc_exp_year"), "2022");
		sendKeys(findElement("id", "cc_cvv"), "123");
		btnClk(findElement("id", "book_now"));
		Thread.sleep(3000);
		System.out.println("Order No is "+getAtrribute(findElement("id", "order_no")));
	}
}
