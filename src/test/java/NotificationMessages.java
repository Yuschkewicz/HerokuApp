import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class NotificationMessages extends BaseTest{
  @Test
    public void notification(){
      driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
      driver.findElement(By.xpath("//*[@id=\"content\"]/div/p/a")).click();
      String text = driver.findElement(By.xpath("//*[@id=\"flash-messages\"]")).getText();
      assertEquals(text,"Action unsuccesful, please try again");
      // Скрытый символ "х" в результате на отдельной строчке портит всю картину

    }
}
