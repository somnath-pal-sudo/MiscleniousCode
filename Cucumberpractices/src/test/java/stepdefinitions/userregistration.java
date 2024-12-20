package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userregistration {
	@Given("user is on registartion page")
	public void user_is_on_registartion_page() {
	    System.out.println("user navigates registration page");
	}

	@When("user eneters following  details")
	public void user_eneters_following_details(DataTable dataTable) {
		List<List<String>>userlist=dataTable.asList(String.class);
		for(List<String> e: userlist)//datatable object
		{
			System.out.println(e);
		}
	    
	}
	@When("user eneters following  details with columns")
	public void user_eneters_following_details_with_columns(io.cucumber.datatable.DataTable dataTable) {
	   
		
		List<Map<String,String>>userlist= dataTable.asMaps(String.class, String.class){
			System.out.println(userlist);
			System.out.println(userlist.get(0).get("firsgtname"));
			for(Map<String,String> e: userlist) {
				System.out.println(e.get("firstgname"));
				System.out.println(e.get("lastname"));
			}
		}
	}


	@Then("user successfully LoggedIn")
	public void user_successfully_logged_in() {
	   
	}

}
