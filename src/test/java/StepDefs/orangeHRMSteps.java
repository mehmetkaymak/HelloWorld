package StepDefs;

import cucumber.api.java.en.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHRMSteps {

    WebDriver driver;
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("heyyyyy");

    }

    @Then("verify that logo is present")
    public void verify_that_logo_is_present() {
        boolean status = driver.findElement(By.xpath("//img[@src='/webres_5d186a4a987cc7.73469913/themes/default/images/login/logo.png']")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @Then("close the browser")
    public void close_the_browser() throws InterruptedException {
      Thread.sleep(2000);
        driver.quit();
    }




}
