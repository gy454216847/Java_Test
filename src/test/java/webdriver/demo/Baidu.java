package webdriver.demo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Baidu {
        private WebDriver driver = new ChromeDriver();
    @Before
        public void setUp() {

            driver.get("https://www.baidu.com/");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);}
    @Test
        public void test_searchJava() {
            driver.findElement(By.id("kw")).sendKeys("Java");
            driver.findElement(By.id("kw")).submit();
            }


    @After
        public void tearDown(){
            driver.quit();

            }


        }


