package Pages;

import Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public abstract class AbstractClass {
    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public void clickMethod(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
        waitASome(250);

    }

    public void sendKeysMethod(WebElement sendKeysElement, String text){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(text);
        waitASome(250);
    }
    /* dropdownmenu */
    public void selectElementFromDropdownMenu(WebElement dropdownMenu , String select ){
        Select slc = new Select(dropdownMenu);
        slc.selectByVisibleText(select);
        waitASome(250);
    }
    public void waitASome(int time){
        try {
            Thread.sleep(time); // sleep/stop a thread for 1 second
        } catch(InterruptedException e) {
            System.out.println("An Excetion occured: " + e);
        }
    }

}