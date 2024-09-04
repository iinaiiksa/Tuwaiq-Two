package TuwaiqWeb;
import Base.BaseClass;
import Pages.HomePages;
import Pages.LoginPages;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class HomeTest2 extends BaseClass {
    @Test
    public void homePageMethod() throws InterruptedException {
        LoginPages homelogin = new LoginPages(driver);
        HomePages homepage = new HomePages(driver);
        homelogin.openUrl();
        homelogin.usernameField();
        homelogin.passwordField();
        homelogin.loginbtn();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        homepage.dock();
        Thread.sleep(5000);
    }
}





