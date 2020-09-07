package demo;

import core.BrowserEmulator;
import core.knifeException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class BaiduDemoArrow {
    BrowserEmulator driver;
    String baseUrl;

    String searchBox = "id=>kw";
    String searchBtn = "id=>su";

    @BeforeMethod
    public void setUp() throws knifeException {
        baseUrl = "https://www.baidu.com";
        driver = new BrowserEmulator();
    }

    @Test
    public void testCase() throws Exception{
        driver.open(baseUrl);
        driver.type("id=>kw","github");
        driver.click("id=>su");
        Thread.sleep(2000);
        assertEquals(driver.getTitle(),"github_百度搜索");

    }
    @AfterMethod
        public void tearDowm() throws Exception{
            driver.quit();

    }
}
