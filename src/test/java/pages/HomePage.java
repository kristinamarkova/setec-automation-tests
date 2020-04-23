package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    By logo = By.xpath("//*[@id=\"header-left\"]/div/a");
    By shoppingCartBtn = By.xpath("//*[@id=\"top\"]/div[2]/div[2]/div[1]/div/ul/li[4]/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLogo() {
        driver.findElement(logo).click();
    }

    public void clickOnShoppingCart() {
        driver.findElement(shoppingCartBtn).click();
    }
}
