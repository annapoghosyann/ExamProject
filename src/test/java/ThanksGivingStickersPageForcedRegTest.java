import config.DriverUtils;
        import config.HomePage;
        import config.ThanksgivingStickersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

public class ThanksGivingStickersPageForcedRegTest {

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

        WebElement elementOfForcedRegWindow = DriverUtils.driver.findElement(By.cssSelector("[class=\"pa-uiLib-textInput-element-0-2-213\"][name=\"email\"]"));
        thanksgivingStickersPage.clickTryStickersMainButton();
        System.out.println(elementOfForcedRegWindow.isDisplayed());

        thanksgivingStickersPage.clickTryStickersForSMButton();
        System.out.println(elementOfForcedRegWindow.isDisplayed());

        thanksgivingStickersPage.clickTryStickersForFlyersButton();
        System.out.println(elementOfForcedRegWindow.isDisplayed());

        thanksgivingStickersPage.clickTryStickersForInvitations();
        System.out.println(elementOfForcedRegWindow.isDisplayed());

        thanksgivingStickersPage.clickTryStickersForDecorations();
        System.out.println(elementOfForcedRegWindow.isDisplayed());

        thanksgivingStickersPage.clickTryStickersForAllStyles();
        System.out.println(elementOfForcedRegWindow.isDisplayed());

        thanksgivingStickersPage.clickMakeStickersButton();
        System.out.println(elementOfForcedRegWindow.isDisplayed());
    }


    @AfterMethod
    public void killDriver() throws InterruptedException {
        DriverUtils.killDriver();
    }
}


