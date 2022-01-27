package Org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Hotel extends BaseClass {
public  Hotel() {
	PageFactory.initElements(driver, this);

}
@FindBy(name ="username")
private WebElement txtUser;
@FindBy(name="password")
private WebElement txtPass;
@FindBy(id= "login")
private WebElement loginClk;
@FindBy(id= "location")
private WebElement location;
@FindBy(id ="hotels")
private WebElement hotels;
@FindBy(id ="room_type")
private WebElement roomType;
@FindBy(id ="room_nos")
private WebElement roomNos;
@FindBy(id ="Submit")
private WebElement submit;
@FindBy(id ="radiobutton_0")
private WebElement radioButton;
@FindBy(id ="continue")
private WebElement contBtn;
@FindBy(id ="first_name")
private WebElement firstName;
@FindBy(id="last_name")
private WebElement lastName;
@FindBy(id ="address")
private WebElement addres;
@FindBy(id= "cc_num")
private WebElement ccNum;
@FindBy(id ="cc_type")
private WebElement ccType;
@FindBy(id ="cc_exp_month")
private WebElement expMonth;
@FindBy(id ="cc_exp_year")
private WebElement expYear;
@FindBy(id= "cc_cvv")
private WebElement cvvNo;
@FindBy(id ="book_now")
private WebElement bookNow;
//@FindBy(id ="order_no")
//private WebElement order;
public WebElement getTxtUser() {
	return txtUser;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getLoginClk() {
	return loginClk;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomType() {
	return roomType;
}
public WebElement getRoomNos() {
	return roomNos;
}
public WebElement getSubmit() {
	return submit;
}
public WebElement getRadioButton() {
	return radioButton;
}
public WebElement getContBtn() {
	return contBtn;
}
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddres() {
	return addres;
}
public WebElement getCcNum() {
	return ccNum;
}
public WebElement getCcType() {
	return ccType;
}
public WebElement getExpMonth() {
	return expMonth;
}
public WebElement getExpYear() {
	return expYear;
}
public WebElement getCvvNo() {
	return cvvNo;
}
public WebElement getBookNow() {
	return bookNow;
}
//public WebElement getOrder() {
//	return order;
//}
public void loginPage(String name, String password) {
	sendKeys(getTxtUser(), name);
	sendKeys(getTxtPass(), password);
	getLoginClk().click();

}
public void roomDetails(String Loca,int hot,int rmTy,int rmNo) {
	Select s=new Select(getLocation());
	s.selectByVisibleText(Loca);
	Select s1=new Select(getHotels());
	s1.selectByIndex(hot);
	Select s2=new Select(getRoomType());
	s2.selectByIndex(rmTy);
	Select s3=new Select(getRoomNos());
	s3.selectByIndex(rmNo);
	getSubmit().click();

}
public void bookingHotel() {
	getRadioButton().click();
	getContBtn().click();
	}
public void personalDetails(String ftName,String ltName,String addr,String num,int cc,int month,String year,String cvv) {
	sendKeys(getFirstName(), ftName);
	sendKeys(getLastName(), ltName);
	sendKeys(getAddres(), addr);
	sendKeys(getCcNum(), num);
	Select s=new Select(getCcType());
	s.selectByIndex(cc);
	Select s1=new Select(getExpMonth());
	s1.selectByIndex(month);
	Select s2=new Select(getExpYear());
	s2.selectByVisibleText(year);
	sendKeys(getCvvNo(), cvv);
	getBookNow().click();
	
	
	

}
}
