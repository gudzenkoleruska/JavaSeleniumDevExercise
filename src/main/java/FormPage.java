import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void submitForm (WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Valeriia");

        driver.findElement(By.id("last-name")).sendKeys("Smit");

        driver.findElement(By.id("job-title")).sendKeys("QA specialist");

        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='2']")).click();    //option =tag

        driver.findElement(By.id("datepicker")).sendKeys("06/18/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);     //CLOSE Datepicker

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

}
