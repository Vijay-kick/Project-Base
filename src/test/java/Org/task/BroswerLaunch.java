package Org.task;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BroswerLaunch extends BaseClass {
	public static void main(String[] args) throws AWTException {
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		//gettile("title2");
		currentUrl("url");
		//waitmax(10);
		// btnClk(findElement("xpath", "//button[@class='btn btn-danger']"));
		// System.out.println(switchToAlert("Accept"));
		LoginPage l = new LoginPage();
		// sendKeys(findElement("xpath",
		// "(//input[@type='text'])[2]"),"kvijay.kick@gmail.com");
		// sendKeys(findElement("xpath", "//input[@type='password']"), "Vijay@12345");
		// btnClk(findElement("xpath", "(//button[@type='submit'])[2]"));

//		 sendKeys(l.getTxtUserName(), "super@gmail.com");
//		 sendKeys(l.getTxtPass(), "12345678");
//		l.getClick().click();
		//l.login("super@gmail.com", "1234567");

//		 driver.navigate().refresh();
//		l.login("kvijay.kick@gmail.com","Vijay@12345");
//
//		waitmax(10);
//		SearchBox s = new SearchBox();
//		driver.navigate().refresh();
//
//		sendKeys(s.getSearchBox(), "samsung");
		// driver.navigate().refresh();
		// sendKeys(s.getSearchBox(), value);
//		s.getSearchBtn().click();
//		s.getFirstPrd().click();
//		nextScreen(1);
//		waitmax(10);
//		s.getAddCart().click();
		// driver.navigate().back();
		// driver.navigate().back();
		// waitmax(50);
		// WebElement txtUser=findElement("name","q" );
		// sendKeys(txtUser,"Iphone");
		//
		// btnClk(findElement("xpath", "//button[@class='L0Z3Pu']'"));
		//// btnClk(findElement("xpath", "//div[text()='realme C11 2021 (Cool Grey, 32
		// GB)']"));
		// Doubleclk(findElement("xpath", "//span[text()='Apple iPhone XR (64GB) -
		// White']"));
		// Doubleclk(findElement("id", "email"));
		// keyBoard();
		// nextScreen();

		//// javaScript(findElement("xpath", "//a[text()='Help']"));
		// System.out.println(getAtrribute(findElement("id", "email")));
		// System.out.println(getText(findElement("xpath",
		//// "(//span[text()='₹34,999.00'])[4]")));
		// try {
		// Thread.sleep(2000);
		// } catch (InterruptedException e1) { // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		// try {
		// screenShot("Vijay1");
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// javaScriptText(txtUser);

	}
}
