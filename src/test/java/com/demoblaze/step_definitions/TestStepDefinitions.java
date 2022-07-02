package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestStepDefinitions {

    ProductPage productPage = new ProductPage();

    @Given("buyer is on the homepage of demoblaze")
    public void buyer_is_on_the_homepage_of_demoblaze() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("buyer adds from {string} category {string} product to cart")
    public void buyer_adds_from_category_product_to_cart(String category, String product) {
        productPage.getLink(category);
        productPage.getLink(product);
        productPage.getLink("Add to cart");
        //handle alert
        // handle the synchronization issue
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @When("buyer clicks on {string} link")
    public void buyer_clicks_on_link(String link) {
        productPage.getLink(link);
    }

    @Then("buyer should se {string} is added to cart")
    public void buyerShouldSeIsAddedToCart(String product) {
        Assert.assertTrue(productPage.getProductElement(product).isDisplayed());
    }
}
