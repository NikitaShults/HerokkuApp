import org.example.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class ContextMenu extends BaseTest {
    @Test
    public void rightClickOnElement(){
        Actions action = new Actions(driver);

        driver.get("http://the-internet.herokuapp.com/context_menu");
       WebElement field = driver.findElement(By.id("hot-spot"));
       action.contextClick(field).perform();

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        Assert.assertEquals(text,"You selected a context menu");
        alert.accept();

    }


}
