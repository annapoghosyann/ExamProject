package config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverUtils.driver, this);
    }

    public abstract void openPage();

    protected void click(WebElement element){
        WaitHelper.getWait().elementToBeClickable(element);
        element.click();
    }
}
