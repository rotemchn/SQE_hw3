package test.java.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class addReviewSteps {

    WebDriver driver = null;

    @Given("^browser is open$")
    public void browser_is_open() {
        System.out.println("Inside Step - browser is open");
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is : "+projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/Selenium/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        // driver.manage().window().maximize();
    }

    @And("^user is logged in to simplCommerce$")
    public void user_is_logged_in_to_simpl_commerce() {
        System.out.println("Inside Step - user is logged in");
        driver.navigate().to("https://ci.simplcommerce.com/login");
        driver.findElement(By.name("Email")).sendKeys("rotem3@post.bgu.ac.il");
        driver.findElement(By.name("Password")).sendKeys("Rotem123!");
        driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);

    }

    @And("^user is on a product's page$")
    public void user_is_on_a_product_s_page() {
        System.out.println("Inside Step - user is on products page");
        driver.navigate().to("https://ci.simplcommerce.com/iphone-100!");

    }
    @And("^user purchases a product$")
    public void user_purchases_product() {
        //button[normalize-space()='Add to cart']
        driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='View cart']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Process to Checkout']")).click();

        //driver.findElement(By.xpath("(//input[@name='ShippingAddressId'])[3]")).click();
        driver.findElement(By.name("NewAddressForm.ContactName")).sendKeys("Rotem");
        driver.findElement(By.xpath("//select[@id='NewAddressForm_CountryId']//option[@value='US'][normalize-space()='United States']")).click();
        driver.findElement(By.xpath("//select[@id='NewAddressForm_StateOrProvinceId']//option[@value='2']")).click();
        driver.findElement(By.name("NewAddressForm.AddressLine1")).sendKeys("Rotem");
        driver.findElement(By.name("NewAddressForm.Phone")).sendKeys("0544444444");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(By.xpath("//button[normalize-space()='Payment']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Cash on Delivery']")).click();
    }


    @And("^user clicks on Add Review$")
    public void user_clicks_on_add_review() {
        driver.navigate().to("https://ci.simplcommerce.com/iphone-100!#addreview");
    }

    @When("^user enters a text in review box$")
    public void user_enters_a_text_in_review_box() {
        System.out.println("Inside Step - user enters a text in review box");
        WebElement hiddenField = driver.findElement(By.id("Rating"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='5';", hiddenField);
        driver.findElement(By.name("Comment")).sendKeys("Great Iphone, didn't know there is an iphone 100!!\n nice to know!");
        driver.findElement(By.name("Title")).sendKeys("Great Iphone!");
    }

    @And("^hits add$")
    public void hits_add() {
        System.out.println("Inside Step - hits add");
        driver.findElement(By.xpath("//button[@id='btn-addreview']")).click();
    }

    @Then("^user's review is added to the product's reviews$")
    public void user_s_review_is_added_to_the_product_s_reviews() {
        System.out.println("Inside Step - user's review is added to the product's reviews");
        driver.close();
        driver.quit();
    }


}
