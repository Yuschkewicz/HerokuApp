package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Typos extends BaseTest{
    @Test
    public void typos(){
        driver.get("http://the-internet.herokuapp.com/typos");
        String a= driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]")).getText();
        assertEquals(a,"Sometimes you'll see a typo, other times you won,t.");

        // логично, что иногда зеленый тест, иногда желтый. Все зависит от ожиданий. А можно депенсить два ожидния?
    }
}
