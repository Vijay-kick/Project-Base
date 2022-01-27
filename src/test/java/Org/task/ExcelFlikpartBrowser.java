package Org.task;

import java.io.IOException;

public class ExcelFlikpartBrowser extends BaseClass {
public static void main(String[] args) throws IOException {
	browserLaunch("chrome");
	
urlLaunch("https://www.flipkart.com/");
LoginPage l=new LoginPage();

sendKeys(l.getTxtUserName(), excel("Fb login", "Vijay", 1, 2));
sendKeys(l.getTxtPass(), excel("Fb login", "Vijay", 1, 4));
l.getClick().click();
	
}
}
