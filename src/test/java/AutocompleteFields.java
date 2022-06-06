import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteFields {public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://formy-project.herokuapp.com/autocomplete");
    WebElement autocomplete = driver.findElement(By.id("autocomplete"));
    autocomplete.sendKeys("1555 Park Blvd Alto, CA");
    Thread.sleep(1000);

    WebElement autocomplete_result = driver.findElement(By.className("pac-item"));
    autocomplete_result.click();

    driver.quit();
}
}
