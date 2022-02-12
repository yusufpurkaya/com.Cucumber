package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebdriverUnivPage {
    public WebdriverUnivPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@class='section-title'])[2]")
    public WebElement webUniversityLoginButton;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement webUniversityUserNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement webUniversityPasswordBox;
    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement webUniversityButton;
}
