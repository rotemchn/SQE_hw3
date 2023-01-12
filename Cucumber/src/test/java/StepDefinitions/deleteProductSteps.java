package test.java.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class deleteProductSteps {

    WebDriver driver = null;

    @Given("^the browser is open$")
    public void the_browser_is_open() {
        System.out.println("Inside Step - browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is : "+projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/Selenium/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
    }

    @Given("^admin is logged in to simplCommerce$")
    public void admin_is_logged_in_to_simpl_commerce() {
        driver.navigate().to("https://ci.simplcommerce.com/login");
        driver.findElement(By.name("Email")).sendKeys("admin@simplcommerce.com");
        driver.findElement(By.name("Password")).sendKeys("1qazZAQ!");
        driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);
    }

    @And("^admin is on a dashboard page$")
    public void admin_is_on_a_dashboard_page() {
        driver.navigate().to("https://ci.simplcommerce.com/admin#!/dashboard");
    }

    @And("^admin clicks on Catalog -> Products$")
    public void admin_clicks_on_catalog_products() {
        driver.navigate().to("https://ci.simplcommerce.com/admin#!/product");
    }

    @When("^admin clicks on delete$")
    public void admin_clicks_on_delete() {
        driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-remove'])[1]")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='OK'])[1]")).click();

    }

    @Then("^product is deleted$")
    public void product_is_deleted() {
        driver.close();
        driver.quit();
    }


}
