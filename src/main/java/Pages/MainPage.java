package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractClass {
    WebDriver driver;

    public MainPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/header/div/div/div/nav/div[4]/a[2]")
    private WebElement contactUsButton;
    public void clickOnContactUsButton(){
        clickMethod(contactUsButton);
    }

}