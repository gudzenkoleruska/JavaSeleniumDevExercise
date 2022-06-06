import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FormsSend {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("Valeriia");

        driver.findElement(By.id("last-name")).sendKeys("Smit");

        driver.findElement(By.id("job-title")).sendKeys("QA specialist");

        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='2']")).click();    //option =tag

        driver.findElement(By.id("datepicker")).sendKeys("06/18/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);     //CLOSE Datepicker

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alert =wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

        String alertText = alert.getText();
        Assert.assertEquals("The form was successfully submitted!", alertText);

        driver.quit();
    }
}
