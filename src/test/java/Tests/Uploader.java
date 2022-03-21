package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Uploader extends BaseTest{
    WebDriverWait wait;



    @Test
    public void uploadFile(){
        driver.get("http://the-internet.herokuapp.com/upload");
        String file = "src/test/resources/1863.html";
        driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys(file);
        driver.findElement(By.cssSelector("[value=Upload]")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/h3")));
    }
}
