package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;




@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on NetBanking landing pages$")
    public void user_is_on_netbanking_landing_pages() throws Throwable {
        //code to navigate to login url
    	System.out.println("navigate the  login URL");
    }

    @When("^user login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    	
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //home page validation
    	System.out.println("home page validation");
    }

    @And("^Card  displayed are \"([^\"]*)\"$")
    public void card_displayed_are_something(String Arg1) throws Throwable {
    	System.out.println(Arg1);
    }

}
