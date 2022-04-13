package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Inputs extends BaseTest{
    @Test
    public void input() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("10");
        String input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "10", "input doesn't equal 10");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "11", "input doesn't equal 11");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "10", "input doesn't equal 10");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("1e2");
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "1e2", "input doesn't equal 1e2");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("b");
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "", "input is not empty");
    }

}
