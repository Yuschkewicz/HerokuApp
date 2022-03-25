package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class DynamicControls extends BaseTest{
    WebDriverWait wait;
// сначала очень плохой вариант, пока просто запихиваю неявное ожидание и да, копирую xpath. очень ограничен
// во времени. Обязуюсь переделать на человеческий с явными ожиданиями, ведь там само явное
// ожидание является
// автоматическим ассертом
//
    @Test(description = "Проверка динамических изменяемых штуковин")
    public void dynamicControlsRemoveAdd(){

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.cssSelector("input[type=checkbox]")).click();
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text = driver.findElement(By.id("message")).getText();
        assertEquals(text,"It's gone!");
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text3 =driver.findElement(By.id("message")).getText();
        assertEquals(text3,"It's enabled!");
        driver.findElement(By.cssSelector("input[type=text]")).sendKeys("12453466");
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text2 =driver.findElement(By.id("message")).getText();
        assertEquals(text2,"It's disabled!");
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        assertEquals( text3,"It's enabled!");

    }




    }




