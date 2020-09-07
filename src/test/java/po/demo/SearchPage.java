package po.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    public static void input(WebDriver driver,String search_key){
        driver.findElement(By.id("kw")).sendKeys(search_key);

    }
    public static void button(WebDriver driver)
    {
        driver.findElement(By.id("su")).click();
    }
}
