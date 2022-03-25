package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class ContextMenu extends BaseTest{
@Test(description = "Валидация текста на алерте")
    public void validationText(){

        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/context_menu");
        actions.contextClick(driver.findElement(By.id("hot-spot"))).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());  //  долго не получалось совместисть, но гугл помог
        alert.accept();
        driver.switchTo().defaultContent();





    }
}
