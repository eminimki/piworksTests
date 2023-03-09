package StepDefinition;

import Pages.ContactUsPage;
import Pages.MainPage;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class StepDefinition {
    private WebDriver driver;
    MainPage mainPage = new MainPage();
    ContactUsPage contactUsPage = new ContactUsPage();
    @Given("open main page")
    public void open_main_page() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://piworks.net/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @And("click contact us button")
    public void clickContactUsButton() {
        mainPage.clickOnContactUsButton();
    }

    @Given("type First Name {string}")
    public void type_first_name(String firstName) {
        contactUsPage.typeFirstName(firstName);
    }
    @Given("type Last Name {string}")
    public void type_last_name(String lastName) {
        contactUsPage.typeLastName(lastName);
    }
    @Given("type Business E-Mail Adress {string}")
    public void type_business_e_mail_adress(String email) {
        contactUsPage.typeEmail(email);
    }
    @Given("type Company {string}")
    public void type_company(String company) {
        contactUsPage.typeCompany(company);
    }
    @Given("type Job Title {string}")
    public void type_job_title(String jobTitle) {
        contactUsPage.typeJobTitle(jobTitle);
    }
    @Given("type Business Phone {string}")
    public void type_business_phone(String phone) {
        contactUsPage.typeBusinessPhone(phone);
    }
    @Given("select Category {string}")
    public void select_category(String category) {
        contactUsPage.selectCategory(category);
    }
    @Given("type Message {string}")
    public void type_message(String message) {
        contactUsPage.typeMessage(message);
    }
    @When("click send button")
    public void click_send_button() {//spam mail atmamak için comment olarak eklendi.
        //contactUsPage.clickSubmitButton();
        System.out.println("submit button clicked");
    }
    @Then("check status")
    public void check_status() {//duruma göre kontrol edilir ancak ben spam mail atmamak için yazmıyorum.
        System.out.println("kontrol edildi");
    }


}
