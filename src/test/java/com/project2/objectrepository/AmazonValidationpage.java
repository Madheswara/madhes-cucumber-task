package com.project2.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project2.resources.Commanactions;

public class AmazonValidationpage extends Commanactions{
	
	public AmazonValidationpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement searchbutton;

	@FindBy(xpath = "//div[@data-index='3']")
	private WebElement selectproduct;
	
	@FindBy(id = "buy-now-button")
	private WebElement buynow;
	
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getBuynow() {
		return buynow;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	public WebElement getSelectproduct() {
		return selectproduct;
	}

}
