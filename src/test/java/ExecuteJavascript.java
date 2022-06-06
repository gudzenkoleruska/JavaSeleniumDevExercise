import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modal_button = driver.findElement(By.id("modal-button"));
        modal_button.click();

        WebElement close_button = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;   // для встроенных форм JavaScript
        js.executeScript("arguments[0].click",close_button);

    driver.quit();
}
}
