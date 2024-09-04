package TuwaiqWeb;

import Base.BaseClass;
import Pages.HomePages;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class HomeTest extends BaseClass{

    @Test
        public void homePageMethod() throws InterruptedException {
            LoginPages homelogin = new LoginPages(driver);
            homelogin.openUrl();
            homelogin.usernameField();
            homelogin.passwordField();
            homelogin.loginbtn();
        }

@Test
    public void homePageMethod2() throws InterruptedException {
        HomePages homePage =new HomePages(driver);
        homePage.openProject();
        homePage.openArray();
        homePage.copy();
        Thread.sleep(5000);
}
    }
