package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;

public class AccountTest extends BaseTest {

    AccountPage accountPage;

    @Test
    public void testClickOnAccountLinkRedirectsToLoginPage() {
        accountPage = new AccountPage(driver);

        // Go to account page
        accountPage.clickOnMyProfileBtn();
        Assert.assertEquals(accountPage.getPageTitleText().toLowerCase(), "логирај се");

        // Verifying it will redirect to Login page, when not logged in
        accountPage.clickOnMyAccountLink();
        Assert.assertEquals(accountPage.getPageTitleText().toLowerCase(), "логирај се");

        // Verifying it will redirect to Login page, when not logged in
        accountPage.clickOnAddressBookLink();
        Assert.assertEquals(accountPage.getPageTitleText().toLowerCase(), "логирај се");

        // Verifying it will redirect to Login page, when not logged in
        accountPage.clickOnWishListLink();
        Assert.assertEquals(accountPage.getPageTitleText().toLowerCase(), "логирај се");

    }

}
