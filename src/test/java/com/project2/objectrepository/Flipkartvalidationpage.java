package com.project2.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project2.resources.Commanactions;

public class Flipkartvalidationpage extends Commanactions {
	
	
	
	public Flipkartvalidationpage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "q")
	private WebElement search;
	
	@FindBy(xpath= "//button[text()='✕']")
	private WebElement closeicon;

	@FindBy(xpath= "//div[@data-id = 'ACCFGYZEGA8ZRGUT']")
	private WebElement selectheadphones;
	
	@FindBy(xpath= "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;
	
	@FindBy(xpath = "//div[contains(text(),'Newest First')]")
	private WebElement sortby;
	
	@FindBy (xpath = "(//input[@type = 'radio'])[1]")
	private WebElement select;
	
	@FindBy(xpath = "//span[@class='B_NuCI']")
	private WebElement name;
	
	@FindBy(xpath = "//div[@class='_30jeq3 _16Jk6d']")
	private WebElement price;
	
	@FindBy(id = "pincodeInputId")
	private WebElement pincode;
	
	@FindBy(id = "swatch-0-color")
	private WebElement colorA;
	
	@FindBy(xpath = "(//div[@class='_2OTVHf _3NVE7n _1mQK5h _2J-DXM'])[1]")
	private WebElement hidetext;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	private WebElement buynow;
	

	public WebElement getBuynow() {
		return buynow;
	}

	public WebElement getHidetext() {
		return hidetext;
	}

	public WebElement getColorA() {
		return colorA;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getCloseicon() {
		return closeicon;
	}

	public WebElement getSelectheadphones() {
		return selectheadphones;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getSortby() {
		return sortby;
	}

	public WebElement getSelect() {
		return select;
	}
	public WebElement getPincode() {
		return pincode;
	}

	


}
