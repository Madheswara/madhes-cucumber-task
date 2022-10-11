package com.project2.stepdefenition;

import java.util.List;

import com.project2.objectrepository.AmazonValidationpage;
import com.project2.resources.Commanactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonValidationSetup extends Commanactions {
	
	Commanactions cm = new Commanactions();
	
	AmazonValidationpage avp = new AmazonValidationpage();
	
	@Given("login the webpage")
	public void login_the_webpage() {
		cm.launch("https://www.amazon.in");
		System.out.println("login successfully");
	}
	String name = ""; 
	@When("search the headphones by list")
	public void search_the_headphones_by_list(DataTable dataTable) {
		List<String> list = dataTable.asList();
		String text = list.get(0);
	 cm.Inserttext(avp.getSearchbox(), text);

	}

	@When("sortby high to low")
	public void sortby_high_to_low() {
	   System.out.println("sorted");
	   avp.getSelectproduct().click();
	}

	@When("windows handling")
	public void windows_handling() {
		cm.windowshandling();
	   
	}

	@When("validation of details of features")
	public void validation_of_details_of_features() {
	    avp.getBuynow().click();
	}

	@Then("take screenshot of the page")
	public void take_screenshot_of_the_page() throws Throwable {
		cm.impwait(30);
	    cm.takesrnshot("C:\\Users\\et\\eclipse-workspace\\CuProject2\\src\\test\\resources\\TSS\\sshot2.png");
	    
	}
}
