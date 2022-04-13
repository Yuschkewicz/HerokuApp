package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxes extends BaseTest{

    @Test
    public void checkBox() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        boolean checkBox1 = driver.findElements(By.cssSelector("[type=checkbox]")).get(0).isSelected();
        assertFalse(checkBox1, "checkbox 1 is checked");
        driver.findElements(By.cssSelector("[type=checkbox]")).get(0).click();
        checkBox1 = driver.findElements(By.cssSelector("[type=checkbox]")).get(0).isSelected();
        assertTrue(checkBox1, "checkbox 1 is not checked");
        boolean checkBox2 = driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected();
        assertTrue(checkBox2, "checkbox 2 is not selected");
        driver.findElements(By.cssSelector("[type=checkbox]")).get(1).click();
        checkBox2 = driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected();
        assertFalse(checkBox2, "checkbox 2 is checked");
    }
}
