package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By emailInput = By.id("input-email");
    By passwordInput = By.id("input-password");
    By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]");
    //By forgottenPasswordLink = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickOnLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    public void loginToSetec(String email,String password){
        setEmail(email);
        setPassword(password);
        clickOnLoginBtn();
    }

}
