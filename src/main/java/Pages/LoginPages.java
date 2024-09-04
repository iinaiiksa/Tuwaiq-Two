package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectPath.LoginObject.*;

public class LoginPages {
    WebDriver driver =null;
    public LoginPages(WebDriver driver) {
        this.driver=driver;
    }
    public void openUrl() {
        driver.get("https://github.com/login");
    }
    public void usernameField(){
        WebElement userName = driver.findElement(username);
        userName.sendKeys("naif.sar1122@gmail.com");
    }
    public void passwordField(){
        WebElement userName = driver.findElement(password);
        userName.sendKeys("****");
    }
    public void loginbtn(){
        WebElement loginbtn =driver.findElement(loginButton);
        loginbtn.click();
    }

}
