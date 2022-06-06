import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RefactoringTestPageObject {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage =new FormPage();          //из page objects
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage =new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);

        String alertText = confirmationPage.getAlertBannerText(driver);

        Assert.assertEquals("The form was successfully submitted!", alertText);

        driver.quit();
    }

}
