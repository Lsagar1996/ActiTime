package com.acttime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskTb;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logutlink;
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setTaskTb() {
		taskTb.click();
	}
	
	public void setlogutlink(){
		logutlink.click();
	}

}
