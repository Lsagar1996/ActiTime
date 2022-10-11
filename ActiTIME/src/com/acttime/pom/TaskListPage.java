package com.acttime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
	private WebElement enterCustName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDesc;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDrpDn;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCmpOpt;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement crtCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustCrtd;

	public WebElement getActualCustCrtd() {
		return actualCustCrtd;
	}

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCust() {
		return newCust;
	}

	public WebElement getEnterCustName() {
		return enterCustName;
	}

	public WebElement getEnterCustDesc() {
		return enterCustDesc;
	}

	public WebElement getSelectCustDrpDn() {
		return selectCustDrpDn;
	}

	public WebElement getOurCmpOpt() {
		return ourCmpOpt;
	}

	public WebElement getCrtCustBtn() {
		return crtCustBtn;
	}
	

	
}
