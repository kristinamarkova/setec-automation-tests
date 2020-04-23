package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

    WebDriver driver;
    By myProfileBtn = By.xpath("//*[@id=\"header-right\"]/a/i");
    By myAccountLink = By.xpath("//*[@id=\"column-right\"]/div/div[3]/ul/li[3]/a");
    By addressBookLink = By.xpath("//*[@id=\"column-right\"]/div/div[3]/ul/li[4]/a");
    By wishListLink = By.xpath("//*[@id=\"column-right\"]/div/div[3]/ul/li[5]/a");


    By pageTitle = By.id("title-page");


    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnMyProfileBtn() {
        driver.findElement(myProfileBtn).click();
    }

    public void clickOnMyAccountLink() {
        driver.findElement(myAccountLink).click();
    }

    public void clickOnAddressBookLink() {
        driver.findElement(addressBookLink).click();
    }

    public void clickOnWishListLink() {
        driver.findElement(wishListLink).click();
    }

    public String getPageTitleText() {
        return driver.findElement(pageTitle).getText();
    }



}
