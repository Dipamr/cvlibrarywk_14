package uk.co.library.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;

public class HomePagesteps {
    @Given("^User On HomePage$")
    public void user_On_HomePage()  {
    }

    @When("^User accept cookies$")
    public void user_accept_cookies() throws InterruptedException {
        new HomePage().acceptCookiesandSwitchToIframe();
    }

    @And("^User enter job title \"([^\"]*)\"$")
    public void user_enter_job_title(String jobT) throws Throwable {
        new HomePage().enterJobTitle(jobT);
    }

    @And("^User entre location \"([^\"]*)\"$")
    public void user_entre_location(String loc)  {
        new HomePage().enterLocation(loc);
    }

    @And("^User select distance \"([^\"]*)\"$")
    public void user_select_distance(String dis)  {
        new HomePage().selectDistanceFromDropDown(dis);
    }

    @And("^User click on moreSearchOptionsLink$")
    public void user_click_on_moreSearchOptionsLink()  {
        new HomePage().clickOnMoreSearchOption();
    }

    @And("^User enter salaryMin \"([^\"]*)\"$")
    public void user_enter_salaryMin(String Smin)  {
        new HomePage().enterSalaryMin(Smin);
    }

    @And("^User enter salaryMax \"([^\"]*)\"$")
    public void user_enter_salaryMax(String Smax)  {
        new HomePage().enterSalaryMax(Smax);
    }

    @And("^User select salaryType \"([^\"]*)\"$")
    public void user_select_salaryType(String sT)  {
        new HomePage().selectSalaryTypeDropDown(sT);
    }

    @And("^User select jobType \"([^\"]*)\"$")
    public void user_select_jobType(String jT)  {
        new HomePage().selectJobTypeDropDown(jT);
    }

    @And("^User click on Find Jobs button$")
    public void user_click_on_Find_Jobs_button() {
        new HomePage().clickOnFINDJOBS();
    }

    @Then("^User verify the result \"([^\"]*)\"$")
    public void user_verify_the_result(String mess)  {
        Assert.assertEquals(mess, new HomePage().verifyTheResults(mess));


    }
}


