package pf.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;
    WebElement wd;
    WebElement su;

    public SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void inputText(String search){
        wd.clear();
        wd.sendKeys(search);


    }
    public void clickButton(){
        su.click();
    }
}
