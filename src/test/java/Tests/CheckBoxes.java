package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class CheckBoxes extends BaseTest{
    @Test
    public void checkBoxes(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        boolean isSelected = driver.findElement(By.cssSelector("[type=checkbox]")).isSelected();
       assertTrue(isSelected);
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        boolean isSelectedAgain = driver.findElement(By.cssSelector("[type=checkbox]")).isSelected();
        assertFalse(isSelectedAgain);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        boolean isSelected2= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected();
        assertFalse(isSelected2);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        boolean isSelected2again= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected();
        assertTrue(isSelected2again);

    }
}
