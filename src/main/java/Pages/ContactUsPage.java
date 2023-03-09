package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends AbstractClass{
    WebDriver driver;
    public ContactUsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "Name")
    private WebElement firstNameArea;
    public void typeFirstName(String firstName){
        sendKeysMethod(firstNameArea,firstName);
    }

    @FindBy(name = "Surame")
    private WebElement lastNameArea;
    public void typeLastName(String lastName){
        sendKeysMethod(lastNameArea,lastName);
    }

    @FindBy(name = "Email")
    private WebElement emailArea;
    public void typeEmail(String email){
        sendKeysMethod(emailArea,email);
    }

    @FindBy(name = "Company")
    private WebElement companyArea;
    public void typeCompany(String company){
        sendKeysMethod(companyArea,company);
    }

    @FindBy(name = "JobTitle")
    private WebElement jobTitleArea;
    public void typeJobTitle(String jobTitle){
        sendKeysMethod(jobTitleArea,jobTitle);
    }

    @FindBy(name = "BusinessPhone")
    private WebElement businessPhoneArea;
    public void typeBusinessPhone(String businessPhone){
        sendKeysMethod(businessPhoneArea,businessPhone);
    }

    @FindBy(name = "ContactCategory")
    private WebElement categoryArea;
    public void selectCategory(String category){
        selectElementFromDropdownMenu(categoryArea,category);
    }

    @FindBy(name = "Message")
    private WebElement messageArea;
    public void typeMessage(String message){
        sendKeysMethod(messageArea,message);
    }

    @FindBy(name = "submit")
    private WebElement submitButton;
    public void clickSubmitButton(){
        clickMethod(submitButton);
    }




}
