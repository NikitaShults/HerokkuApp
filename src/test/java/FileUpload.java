import org.example.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FileUpload extends BaseTest {
    @Test
    public void loadFile() {

       //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys(System.getProperty("user.dir")+"/src/test/resources/sadd.txt");
        driver.findElement(By.id("file-submit")).click();

    }
}
