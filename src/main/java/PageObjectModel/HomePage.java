package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage extends BaseFunctions {

    WebDriver driver;

    public HomePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    private WebElement cookieElement;

    public void acceptCookie(){
        click(cookieElement);
    }
    @FindBy(css = "div.closePopuppersonaNewUser")
    private WebElement closeCookieElement;

    public void closeCookie(){
        click(closeCookieElement);
    }

    @FindBy(css = "a[title='Dizaltı Çorap']")
    private WebElement fromCategoriesToKneeHighSocks;

    public void moveToClothesAndAccessoires() {

        Actions actions = new Actions(driver);
        List<WebElement> menuBar = driver.findElements(By.cssSelector(".desktop-menu>li"));
        actions.moveToElement(menuBar.get(3)).perform();
        click(fromCategoriesToKneeHighSocks);

    }


}
