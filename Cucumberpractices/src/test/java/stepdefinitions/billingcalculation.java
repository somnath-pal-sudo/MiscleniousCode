package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class billingcalculation {
	double billingamount;
	double taxamount;
	double finalamount;
	@Given("user is on biling page")
	public void user_is_on_biling_page() {
	   
	}

	@When("user enters billing amount  <biling amount>")
	public void user_enters_billing_amount_biling_amount(Integer billingamount) {
	    this.billingamount=billingamount;
	}

	@When("userenters tax amount {double}")
	public void userenters_tax_amount(Double taxamount) {
		this.taxamount=taxamount;
	}

	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {
	   
	}

	@Then("it gives the final amount {double}")
	public void it_gives_the_final_amount(String expectedfinalamount) {
		this.finalamount= this.billingamount+this.taxamount;
		System.out.println("this.finalamount=="+ Double.parseDouble(expectedfinalamount));
		Assert.assertTrue(this.finalamount==finalamount);
	}


}
