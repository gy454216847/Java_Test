package pf.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");

        SearchPage2 po = new SearchPage2(driver);
        po.inputText("Java");
        po.clickButton();
        Thread.sleep(2000);
        driver.quit();
    }
}
