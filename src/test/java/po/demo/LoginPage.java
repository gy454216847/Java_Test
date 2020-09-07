package po.demo;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    public static class getElement{
        public static final String Title = "QQ邮箱";
        public static final String Username_ID = "u";
        public static final String Password_ID = "p";
        public static final String Login_btn_ID = "login_button";
        public static final String Login_success_text_ID = "imglogo";

    }

    private WebDriver driver;
    private String url;

    public LoginPage(WebDriver driver,String url){
        this.driver = driver;
        this.url = url;
        this.driver.get(url);

    }

    public String getTitle(){
        return this.driver.getTitle();
    }


}
