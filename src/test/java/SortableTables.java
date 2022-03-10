import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SortableTables extends BaseTest{


    @Test
    public void sortableTables(){

       driver.get("http://the-internet.herokuapp.com/tables");
              //проверка значения в таблице "ячейки" 1:1
       String first= driver.findElement(By.xpath("//table//tr[1]//td[1]")).getText();
       assertEquals(first,"Smith");
              // проверка значения в таблице "ячейки" 1:2
        String second= driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
        assertEquals(second,"John");
              //проверка значения в таблице "ячейки" 2:4
        String third= driver.findElement(By.xpath("//table//tr[2]//td[4]")).getText();
        assertEquals(third,"$51.00");
              //проверка значения в таблице два "ячейки" 4:2
        String fourth = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[4]/td[2]")).getText();
        assertEquals(fourth,"Tim");
              //проверка значения в таблице два "ячейки" 3:4
        String fifth =driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[3]/td[4]")).getText();
        assertEquals(fifth,"$100.00");

    }
}
