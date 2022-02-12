package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HotelMyCampStepDefinitions {
   HMCPage hmcPage=new HMCPage();
    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {

    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciTipi) {
hmcPage.usernameTextBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
hmcPage.mainPageLogin.click();
    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isDisplayed());
    }


    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isDisplayed());
    }

    @Then("verileri kaydeder")
    public void verileriKaydeder() {
        hmcPage.idveSifreyeGirLoginButonu.click();
    }


    @Then("scenario outline'dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hmcPage.usernameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan kullanici password  olarak {string} yazar")
    public void scenarioOutlineDanKullaniciPasswordOlarakYazar(String password) {
        hmcPage.passwordBox.sendKeys(password);
    }
}
