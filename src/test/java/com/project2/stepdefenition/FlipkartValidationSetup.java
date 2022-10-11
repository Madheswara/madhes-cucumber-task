package com.project2.stepdefenition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.project2.objectrepository.Flipkartvalidationpage;
import com.project2.resources.Commanactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartValidationSetup extends Commanactions {

	Commanactions cm = new Commanactions();
	Flipkartvalidationpage fpp = new Flipkartvalidationpage();
	
	@Given("login to the page")
	public void login_to_the_page() {
		cm.launch("http://www.Flipkart.com");
	    fpp.getCloseicon().click();
	}

	public String name;
	@When("search the headphones by outline {string}")
	public void search_the_headphones_by_outline(String headphones) {
		cm.Inserttext(fpp.getSearch(), headphones);
		System.out.println("search done");
	}
	
	@When("select sortby high to low")
	public void select_sortby_high_to_low() {
		cm.impwait(30);
		fpp.getSortby();
	}

	@When("select product and switch window")
	public void select_product_and_switch_window() {
	    fpp.getSelectheadphones().click();
	    cm.impwait(30);
	    cm.windowshandling();
	}
	public String str = "600045";
	@When("validation of details")
	public void validation_of_details() {
		boolean checkbox = fpp.getSelect().isSelected();
		boolean pinenabled = fpp.getPincode().isEnabled();
		WebElement colorA = fpp.getColorA();
		if (checkbox == true) {
			System.out.println("without exchange selected:"+checkbox);
		}
		else if (pinenabled == true) {
			System.out.println("pincode text is enabled");
			cm.Inserttext(fpp.getPincode(), str);
		}
			else {
				System.out.println("not selected");
			}
		
		Actions ac = new Actions(driver);
		ac.moveToElement(colorA).build().perform();
		cm.impwait(20);
		boolean hidetex = fpp.getHidetext().isDisplayed();
		if (hidetex == true) {
			String text = fpp.getHidetext().getText();
			System.out.println(text);
		}
		 String text2 = fpp.getName().getText();
		 System.out.println(text2);
		 String text3 = fpp.getPrice().getText();
		 String replace = text3.toString().replaceAll("^[0-9]","");
		 System.out.println(replace);
		}
	@Then("take screenshot")
	public void take_screenshot() throws Throwable {
		boolean atc = fpp.getAddtocart().isDisplayed();
		boolean bn = fpp.getBuynow().isDisplayed();
		if (atc== true && bn == true) {
			fpp.getBuynow().click();
		}
		else {
			System.out.println("buy and atc Not displayed");
		}
		cm.impwait(30);
		cm.takesrnshot("C:\\Users\\et\\eclipse-workspace\\CuProject2\\src\\test\\resources\\TSS\\task1.png");
		}

}
