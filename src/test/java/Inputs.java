import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class Inputs extends  BaseTest {

    @Test
    public void inputs() {

        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("5");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        String numb= driver.findElement(By.tagName("input")).getText();
        assertEquals(numb,6);
        driver.findElement(By.tagName("input")).sendKeys("r");
        String value= driver.findElement(By.tagName("input")).getText();
        assertEquals(value,null);


    }
}
