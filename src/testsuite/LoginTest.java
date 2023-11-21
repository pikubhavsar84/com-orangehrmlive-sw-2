package testsuite;
/*
Write down the following test into ‘LoginTest’ class
1. userSholdLoginSuccessfullyWithValidCredentials
* Enter “Admin” username
* Enter “admin123 password
* Click on ‘LOGIN’ button
* Verify the ‘Dashboard’ text is display

 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
       //Enter Admin username
        WebElement adminUsername = driver.findElement(By.name("username"));
        adminUsername.sendKeys("Admin");
        WebElement adminPassword = driver.findElement(By.name("password"));
        adminPassword.sendKeys("admin123");
        WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        loginLink.click();
        //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        String expectedTestMessage = "Dashboard";
        // Find the errorMessage element and get the text
        String actualMessage = driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals("Error message not displayed",expectedTestMessage, actualMessage);


    }
    @After
   public void tearDown(){
     closeBrowser();
    }
}
