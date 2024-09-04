package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectPath.HomePath.*;
public class HomePages
{
    WebDriver driver =null;
    public HomePages(WebDriver driver) {
        this.driver=driver;
    }
    public void openProject(){
        WebElement openProject =driver.findElement(openProjectt);
        openProject.click();
    }
    public void openArray(){
        WebElement openArray =driver.findElement(openArrayy);
        openArray.click();
    }
    public void copy(){
        WebElement copy =driver.findElement(copyy);
        copy.click();
    }
    public void dock(){
        driver.findElement(dockk).click();
    }

}



