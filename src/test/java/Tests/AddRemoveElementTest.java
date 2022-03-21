package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AddRemoveElementTest extends BaseTest {
    WebDriver driver;


    @Test
    public void addRemoveElement(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        int buttonCount = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        assertEquals(buttonCount,1,"Count of Delete button is not correct ") ;
    }

}
