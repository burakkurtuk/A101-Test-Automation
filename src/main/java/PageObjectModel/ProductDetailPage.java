package PageObjectModel;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class ProductDetailPage extends BaseFunctions {

    Faker faker = new Faker();
    WebDriver driver;

    public ProductDetailPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "label[for='attributes_integration_colourSİYAH']")
    private WebElement colorFilter;

    public void filter() throws InterruptedException {
        click(colorFilter);
        waitFor(1000);
    }

    @FindBy(css = "a[title='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    private WebElement product;

    public void clickToProduct() {
        click(product);
    }

    @FindBy(css = "div[class='selected-variant-text']")
    private WebElement productColor;

    public void verifyProductColor() {
        Assert.assertEquals(productColor.getText(), "Seçılen Renk: SİYAH");
    }

    @FindBy(css = "button[class='add-to-basket button green block with-icon js-add-basket']")
    private WebElement addToCartElement;

    public void addtoCart() {
        click(addToCartElement);
    }

    @FindBy(css = "a[class='go-to-shop']")
    private WebElement goToShopElement;

    public void goToShop() {
        click(goToShopElement);
    }

    @FindBy(css = "a[class='button green checkout-button block js-checkout-button']")
    private WebElement proceedToCheckoutElement;

    public void proceedToCheckout() {
        click(proceedToCheckoutElement);
    }

    @FindBy(css = "a[class='auth__form__proceed js-proceed-to-checkout-btn']")
    private WebElement continueWithoutRegistration;

    public void withoutRegistration() {
        click(continueWithoutRegistration);
    }

    @FindBy(css = "input[name='user_email']")
    private WebElement emailElement;

    public void email() {
        String mail = faker.internet().emailAddress();
        type(emailElement, mail);

    }

    @FindBy(css = "button[class='button block green']")
    private WebElement submitElement;

    public void submit() {
        click(submitElement);
    }

}
