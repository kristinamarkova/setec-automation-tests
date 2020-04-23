package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void testLoginFunctionality() {
        loginPage = new LoginPage(driver);

        loginPage.clickOnLoginBtn();

        // Valid email address, no password entered
        loginPage.loginToSetec("yavet81215@2go-mail.com", "");

        // Empty email address, valid password
        loginPage.loginToSetec("", "Teskalozinka1");

        // Invalid email address, valid password
        loginPage.loginToSetec("yavet81215@2go-mail.co", "Teskalozinka1");
        loginPage.loginToSetec("yavet81215@2go-mail.com", "Teskalozinka1");
        loginPage.loginToSetec("yavet81215@2go-mail.com", "Teskalozinka123");
        loginPage.loginToSetec("yavet81215@2go-mail.com", "Teskalozinka1");
    }

}
