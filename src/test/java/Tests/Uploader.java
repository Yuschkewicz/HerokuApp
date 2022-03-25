package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Uploader extends BaseTest{
    WebDriverWait wait;



    @Test(description = "Тест на загрузку и соответствиие имени файла")
    public void uploadFile(){

        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.get("http://the-internet.herokuapp.com/upload");
        String file = "C:\\Users\\adala\\HerokuApp\\src\\test\\resources\\1863.html";
        driver.findElement(By.cssSelector("input[type=file]")).sendKeys(file);
        driver.findElement(By.id("file-submit")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploaded-files")));
        String name=driver.findElement(By.id("uploaded-files")).getText();
        assertEquals(name,"1863.html");
    }
}
