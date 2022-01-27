package Org.task;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class JunitPOMBrowserLaunch extends BaseClass {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		browserLaunch("Chrome");
		urlLaunch("http://adactinhotelapp.com/");
		waitmax(10);
	}

	@AfterClass
	public static void afterClass() {
		// driver.close();
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

	Hotel h = new Hotel();

	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test 1 Case -----------------");
		h.loginPage("SuperBook", "7XOO0P");
		Thread.sleep(3000);

	}

	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test 2 Case---------------------");
		h.roomDetails("Sydney", 1, 2, 3);
		Thread.sleep(2000);
	}

	@Test
	public void test3() {
		System.out.println("Test 3 Case ----------------------------");
		h.bookingHotel();
	}

	@Test
	public void test4() throws InterruptedException {
		System.out.println("Test 4 Case -------------------------");
		h.personalDetails("Test", "Task", "America", "1234567890123456", 1, 2, "2022", "123");
		Thread.sleep(3000);
		System.out.println("Order No is " + getAtrribute(findElement("id", "order_no")));
	}
}
