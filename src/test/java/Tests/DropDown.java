package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class DropDown extends BaseTest{
    @Test
    public void dropDown() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        String firstOption = select.getOptions().get(0).getText();
        assertEquals(firstOption, "Please select an option", "Name of option doesn't match");
        String secondOption = select.getOptions().get(1).getText();
        assertEquals(secondOption, "Option 1", "Name of option doesn't match");
        String thirdOption = select.getOptions().get(2).getText();
        assertEquals(thirdOption, "Option 2", "Name of option doesn't match");
        assertEquals(select.getOptions().size(), 3, "Number of options doesn't match");
        assertFalse(select.getOptions().get(0).isEnabled(), "Option 0 is Enabled");
        select.selectByVisibleText("Option 1");
        assertTrue(select.getOptions().get(1).isSelected(), "Option 1 isn't selectable");
        select.selectByVisibleText("Option 2");
        assertTrue(select.getOptions().get(2).isSelected(), "Option 2 isn't selectable");
    }
}
