package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MessageNitification extends BaseTest{

    @Test
    public void notificationMessage() {
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.cssSelector("[href='/notification_message']")).click();
        String text = driver.findElement(By.id("flash")).getAttribute("innerText");
        assertEquals(text, " Action successful\n×", "text doesn't match");
    }

}
