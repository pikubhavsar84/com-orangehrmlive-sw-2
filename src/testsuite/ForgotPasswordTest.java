package testsuite;
/*
Write down the following test into
‘ForgotPasswordTest’ class
1. userShouldNavigateToForgotPasswordPageSuccessfull
y
* click on the ‘Forgot your password’ link
* Verify the text ‘Reset Password’

 */
import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        WebElement forgotPasswordLink = driver.findElement(By.className("orangehrm-login-forgot"));
        forgotPasswordLink.click();
        //verify the text 'reset password'
        String expectedText = "Reset Password";
        WebElement actualTextElement = driver.findElement(By.xpath("//button[@type='submit']"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("password" ,expectedText,actualText);
        System.out.println(expectedText);


    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}