import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class SeleniumTest1 {

    public static ChromeDriver driver;

//   @Before
//    public static void setUp() {
//        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.i.ua/?_rand=1600871277");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//      // authorize();
//   }

//    private static void authorize() {
//        driver.findElement(By.cssSelector("[name='login']")).sendKeys("eskimo2020@i.ua");
//        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("lemon2020");
//        WebElement btn = driver.findElement(By.cssSelector("[value='Войти'"));
//        btn.click();
//    }

    @Test
    public void test_userNameExisted() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.i.ua/?_rand=1600871277");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("[name='login']")).sendKeys("eskimo2020@i.ua");
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("lemon2020");
        WebElement btn = driver.findElement(By.cssSelector("[value='Войти'"));
        btn.click();

        String actual = driver.findElement(By.className("user_name")).getText();
        String expected = "Eskimo";
        Assert.assertEquals(expected, actual);
    }
    }

