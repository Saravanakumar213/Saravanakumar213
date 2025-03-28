package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver;

    @Given("the user is on the OrangeHRM login page")
    public void the_user_is_on_the_OrangeHRM_login_page() {
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @When("the user enters {string}")
    public void the_user_enters_and(String data) throws InterruptedException {
       WebElement datas= driver.findElement(By.xpath("//*[@class='gLFyf']"));
       datas.sendKeys(data);
      
        
    }


}
