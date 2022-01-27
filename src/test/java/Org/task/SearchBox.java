package Org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox extends BaseClass {
	public SearchBox() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
private WebElement searchBox;
	
	@FindBy(xpath="//button[@type='submit']")
private WebElement searchBtn;
	
	@FindBy(xpath="//div[text()='SAMSUNG Galaxy F22 (Denim Blue, 128 GB)']")
	private WebElement firstPrd;
	
	@FindBy(xpath="//button[text()='GO TO CART']")
	private WebElement AddCart;
	
public WebElement getSearchBox() {
	return searchBox;
}
public WebElement getSearchBtn() {
	return searchBtn;
}
public WebElement getFirstPrd() {
	return firstPrd;
}
public WebElement getAddCart() {
	return AddCart;
}

}
