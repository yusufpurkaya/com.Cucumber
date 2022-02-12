package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPages;
import pages.WebdriverUnivPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebdriverUniStepDefinitions {
   WebdriverUnivPage webdriverUnivPage=new WebdriverUnivPage();
    @Then("WUlogin portala kadar asagi iner")
    public void wuloginPortalaKadarAsagiIner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("WUlogin portala tiklar")
    public void wuloginPortalaTiklar() {
webdriverUnivPage.webUniversityLoginButton.click();
    }

    @Then("WUacilan diger window a gecer")
    public void wuacilanDigerWindowAGecer() {
        ReusableMethods.switchToWindow("");
    }

    @And("WU {string} ve {string} kutularina deger yazdirin")
    public void wuVeKutularinaDegerYazdirin(String username, String password) {
webdriverUnivPage.webUniversityLoginButton.sendKeys(username);
webdriverUnivPage.webUniversityPasswordBox.sendKeys(password);
    }

    @Then("WU login butonuna basar")
    public void wuLoginButonunaBasar() {
webdriverUnivPage.webUniversityButton.click();
    }

    @And("WU popup da cikan yazinin {string} oldugunu test eder")
    public void wuPopupDaCikanYazininOldugunuTestEder(String popupYazisi) {
       String alertYazisi=Driver.getDriver().switchTo().alert().getText();
    Assert.assertEquals(popupYazisi,alertYazisi);


    }

    @Then("WU ok diyerek popup a kapatir")
    public void wuOkDiyerekPopupAKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("WU ilk sayfaya geri doner")
    public void wuIlkSayfayaGeriDoner() {
ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }

    @Then("WU ilk sayfaya geri donuldugunu test eder")
    public void wuIlkSayfayaGeriDonuldugunuTestEder() {



    }
}
