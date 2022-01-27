package Org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtUserName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPass;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement click;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	 
	
	public WebElement getTxtPass() {
		return txtPass;
	}
	
	public WebElement getClick() {
		return click;
	}
	
	public  void login(String name,String Pass) {
		sendKeys(getTxtUserName(),name);
		sendKeys(getTxtPass(),Pass);
		getClick().click();

	}

}
