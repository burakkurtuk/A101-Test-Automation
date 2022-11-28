package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddressAndShippingPage extends BaseFunctions {


    WebDriver driver;

    public AddressAndShippingPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@title='Yeni adres oluştur'])[1]")
    private WebElement newAdressElement;

    public void newAdress() {
        click(newAdressElement);
    }

    @FindBy(css = "input[name='title']")
    private WebElement titleElement;

    public void title() {
        type(titleElement, "Home");
    }

    @FindBy(css = "input[name='first_name']")
    private WebElement firstNameElement;

    public void firstName() {
        String firstname = faker.name().firstName();
        type(firstNameElement, firstname);
    }

    @FindBy(css = "input[name='last_name']")
    private WebElement lastNameElement;

    public void lastName() {
        String lastname = faker.name().lastName();
        type(lastNameElement, lastname);
    }

    @FindBy(css = "input[name='phone_number']")
    private WebElement phoneNumberElement;

    public void phoneNumber() {

        String phoneNumber = faker.phoneNumber().phoneNumber();
        type(phoneNumberElement, phoneNumber);
    }

    @FindBy(name = "city")
    private WebElement citiesElement;

    public void selectCity() {
        select(citiesElement, "40");
    }

    @FindBy(name = "township")
    private WebElement townshipElement;

    public void selectTownship() throws InterruptedException {
        waitFor(500);
        select(townshipElement, "475");
    }

    @FindBy(name = "district")
    private WebElement districtElement;

    public void selectDistrict() throws InterruptedException {
        waitFor(500);
        select(districtElement, "36024");
    }

    @FindBy(className = "js-address-textarea")
    private WebElement addressLineElement;

    public void addressLine() {

        String address = faker.address().fullAddress();
        type(addressLineElement, address);
    }

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement saveButtonElement;

    public void saveButton() {
        click(saveButtonElement);
    }

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement saveAndContinueElement;

    public void saveAndContinue() throws InterruptedException {
        waitFor(1500);
        click(saveAndContinueElement);
        waitFor(3000);
        click(saveAndContinueElement);
    }

    @FindBy(xpath = "(//div[@class='section-hero'])[5]")
    private WebElement verifyPaymentPageElement;

    public void verifyPaymentPage() {
        Assertion(verifyPaymentPageElement, "Masterpass ile Ödeme");

    }
}
