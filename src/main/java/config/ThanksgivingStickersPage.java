package config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThanksgivingStickersPage extends BasePage{

    @FindBy(css = ".button-text-0-2-105.button-text-d3-0-2-107")
    public WebElement tryStickersMainButton;

    @FindBy(css = ".button-text-0-2-105.button-text-d7-0-2-109")
    public WebElement TryStickersForSMButton;

    @FindBy(css = ".button-text-0-2-105.button-text-d11-0-2-111")
    public WebElement TryStickersForFlyersButton;

    @FindBy(css = ".button-text-0-2-105.button-text-d19-0-2-116")
    public WebElement TryStickersForInvitationsButton;

    @FindBy(css = ".button-text-0-2-105.button-text-d23-0-2-118")
    public WebElement TryStickersForDecorationsButton;

    @FindBy(css = ".button-text-0-2-105.button-text-d27-0-2-120")
    public WebElement TryStickersForAllStylesButton;

    @FindBy(css = ".button-text-0-2-105.button-text-d31-0-2-122")
    public WebElement MakeStickersButton;


    public void openPage() {
        DriverUtils.driver.get(Configuration.ENVIRONMENT + "/thanksgiving-stickers");
    }

    public void clickTryStickersMainButton() {
        tryStickersMainButton.click();
    }
    public void clickTryStickersForSMButton(){
        TryStickersForSMButton.click();
    }
    public void clickTryStickersForFlyersButton(){
        TryStickersForFlyersButton.click();
    }
    public void clickTryStickersForInvitations(){
        TryStickersForInvitationsButton.click();
    }
    public void clickTryStickersForDecorations(){
        TryStickersForDecorationsButton.click();
    }
    public void clickTryStickersForAllStyles(){
        TryStickersForAllStylesButton.click();
    }
    public void clickMakeStickersButton(){
        MakeStickersButton.click();
    }
}
