import org.example.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicControls extends BaseTest {
@Test
    public void checkBox(){
    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("http://the-internet.herokuapp.com/dynamic_controls");
    WebElement checkbox =driver.findElement(By.xpath("//*[@type='checkbox']"));
    checkbox.click();
    driver.findElement(By.xpath("//*[@type='button']")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
    wait.until(ExpectedConditions.invisibilityOf(checkbox));
    driver.findElement(By.xpath("//*[@type='text']"));
    WebElement enableButton =driver.findElement(By.xpath("//*[text()='Enable']"));
    enableButton.click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Disable']")));








}
}
