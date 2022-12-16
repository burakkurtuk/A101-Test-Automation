package stepDefinition;

import PageObjectModel.AddressAndShippingPage;
import PageObjectModel.HomePage;
import PageObjectModel.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import static PageObjectModel.BaseFunctions.log;


public class testSteps {

    private WebDriver driver;

    HomePage homePage = new HomePage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    AddressAndShippingPage addressAndShippingPage = new AddressAndShippingPage();

    @Given("navigate to url")
    public void navigate_to_url() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.a101.com.tr/");

        log.info("Navigated to url");

    }


    @Given("accept cookie")
    public void closeCookie() {
        homePage.acceptCookie();
        log.info("Cookie is closed");
    }
    @Given("move from clothing and accessories to knee high socks")
    public void move_from_clothing_and_accessories_to_knee_high_socks() {
        homePage.moveToClothesAndAccessoires();
        homePage.closeCookie();
        log.info("Moved from clothing & accessories to knee high socks");
    }

    @Given("filter product")
    public void filter_product() throws InterruptedException {
        productDetailPage.filter();

        log.info("Filtered colors");
    }

    @Given("choose product")
    public void choose_product() {
        productDetailPage.clickToProduct();

        log.info("Product is selected");
    }

    @Given("verify product color")
    public void verify_product_color() {
        productDetailPage.verifyProductColor();

    }

    @Given("click add to cart")
    public void click_add_to_cart() {
        productDetailPage.addtoCart();

        log.info("Product added to cart");
    }

    @Given("click go to shop")
    public void click_go_to_shop() {
        productDetailPage.goToShop();

        log.info("Clicked go to shop button");
    }

    @Given("click proceed to checkout")
    public void click_proceed_to_checkout() {
        productDetailPage.proceedToCheckout();

        log.info("Clicked proceed to checkout button");
    }

    @Given("click continue without registration")
    public void click_continue_without_registration() {
        productDetailPage.withoutRegistration();

        log.info("Clicked continue without registration button");
    }

    @Given("type email")
    public void type_email() {
        productDetailPage.email();

        log.info("typed email");
    }

    @Given("click continue")
    public void click_continue() {
        productDetailPage.submit();

        log.info("Clicked continue button");
    }

    @Given("click create new address")
    public void click_create_new_address() {
        addressAndShippingPage.newAdress();

        log.info("Clicked create new address button");
    }

    @Given("type address title")
    public void type_address_title() {
        addressAndShippingPage.title();
    }

    @Given("type name")
    public void type_name() {
        addressAndShippingPage.firstName();
    }

    @Given("type lastname")
    public void type_lastname() {
        addressAndShippingPage.lastName();
    }

    @Given("type mobile phone")
    public void type_mobile_phone() {
        addressAndShippingPage.phoneNumber();
    }

    @Given("choose city")
    public void choose_city() {
        addressAndShippingPage.selectCity();
    }

    @Given("choose district")
    public void choose_district() throws InterruptedException {
        addressAndShippingPage.selectTownship();
    }

    @Given("choose neighbourhood")
    public void choose_neighbourhood() throws InterruptedException {
        addressAndShippingPage.selectDistrict();
    }

    @Given("type address")
    public void type_address() {
        addressAndShippingPage.addressLine();
    }

    @Given("click save")
    public void click_save() {
        addressAndShippingPage.saveButton();

        log.info("Filled the form and clicked save button");
    }

    @When("click save and continue")
    public void click_save_and_continue() throws InterruptedException {
        addressAndShippingPage.saveAndContinue();

        log.info("Clicked save and continue button");
    }

    @Then("verify payment page")
    public void verify_payment_page() {
        addressAndShippingPage.verifyPaymentPage();

        log.info("Payment page verified");
    }

    @Then("quit")
    public void quit() {
        driver.quit();
    }


}
