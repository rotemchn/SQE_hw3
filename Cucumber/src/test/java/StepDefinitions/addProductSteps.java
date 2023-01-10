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


public class addProductSteps {
    WebDriver driver = null;
    @Given("a browser is open")
    public void a_browser_is_open() {
        System.out.println("Inside Step - browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is : "+projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/Selenium/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
    }

    @And("an admin is logged in to simplCommerce")
    public void an_admin_is_logged_in_to_simpl_commerce() {
        driver.navigate().to("https://ci.simplcommerce.com/login");
        driver.findElement(By.name("Email")).sendKeys("admin@simplcommerce.com");
        driver.findElement(By.name("Password")).sendKeys("1qazZAQ!");
        driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);
    }

    @And("an admin is on a dashboard page")
    public void an_admin_is_on_a_dashboard_page() {
        driver.navigate().to("https://ci.simplcommerce.com/admin#!/dashboard");
    }

    @And("an admin clicks on Catalog -> Products")
    public void an_admin_clicks_on_catalog_products() {
        driver.navigate().to("https://ci.simplcommerce.com/admin#!/product");
    }

    @And("admin clicks on create Product")
    public void admin_clicks_on_create_product() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("(//a[normalize-space()='Create Product'])[1]")).click();
    }
    @And("admim fills product's name")
    public void admin_fills_products_name() {
        driver.findElement(By.name("name")).sendKeys("Iphone 100!");
        driver.findElement(By.name("price")).sendKeys("1");
    }
    @When("admin clicks save")
    public void admin_clicks_save() {
        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
    }

    @Then("product is added")
    public void product_is_added() {

    }
}
