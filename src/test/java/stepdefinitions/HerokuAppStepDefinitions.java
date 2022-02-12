package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuAppPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class HerokuAppStepDefinitions {

    HerokuAppPage herokuAppPage=new HerokuAppPage();
    @When("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
      herokuAppPage.addButonElement.click();
    }
    @Then("Delete butonu gorununceye kadar bekler")
    public void delete_butonu_gorununceye_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuAppPage.deleteButonElement,20);
    }

    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuAppPage.deleteButonElement.click();
    }

    @And("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(herokuAppPage.deleteButonElement.isDisplayed());
    }
}
