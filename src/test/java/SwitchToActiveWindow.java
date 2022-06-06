import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://formy-project.herokuapp.com/switch-window");
    WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
    newTabButton.click();
    String newHandle =driver.getWindowHandle(); //continue focussing on the original page
    for (String handle1:driver.getWindowHandles()) {
        driver.switchTo().window(handle1);     //move to 2nd page
    }
    driver.switchTo().window(newHandle);      //come back to original page

    driver.quit();
}
}
