import config.DriverUtils;
import config.HomePage;
import config.ThanksgivingStickersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThanksGivingStickerPageTest {

    @BeforeMethod
    public void initDriver(){
        DriverUtils.initDriver();
        HomePage homePage = new HomePage();
        homePage.openPage();
    }

    @Test
    public void check (){
        ThanksgivingStickersPage thanksgivingStickersPage = new ThanksgivingStickersPage();
        thanksgivingStickersPage.openPage();

        WebElement elementOfEditorPage = DriverUtils.driver.findElement(By.cssSelector("[class=\"sidebarCategoryIndicator-0-2-150\"]"));
        thanksgivingStickersPage.clickTryStickersMainButton();
        System.out.println(elementOfEditorPage.isDisplayed());
        //after every click should be added "Tap on Back button" functionality

        thanksgivingStickersPage.clickTryStickersForSMButton();
        System.out.println(elementOfEditorPage.isDisplayed());

        thanksgivingStickersPage.clickTryStickersForFlyersButton();
        System.out.println(elementOfEditorPage.isDisplayed());

        thanksgivingStickersPage.clickTryStickersForInvitations();
        System.out.println(elementOfEditorPage.isDisplayed());

        thanksgivingStickersPage.clickTryStickersForDecorations();
        System.out.println(elementOfEditorPage.isDisplayed());

        thanksgivingStickersPage.clickTryStickersForAllStyles();
        System.out.println(elementOfEditorPage.isDisplayed());

        thanksgivingStickersPage.clickMakeStickersButton();
        System.out.println(elementOfEditorPage.isDisplayed());
    }


    @AfterMethod
    public void killDriver() throws InterruptedException {
        DriverUtils.killDriver();
    }
}


