package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addRemoveElements extends BaseTest {
    @Test
    public void AddRemoveElementsTest() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        Assert.assertEquals(driver.findElements(By.xpath("//button[text()='Delete']")).size(), 1);
    }
}
