package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest{

    HomePage homePage;

    @Test
    public void testLogoRedirectsToHomepage() {
        homePage = new HomePage(driver);

        // Going away from homepage
        homePage.clickOnShoppingCart();
        String shoppingCartUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(shoppingCartUrl, url);

        // Verify if navigated to homepage from click on logo
        homePage.clickOnLogo();
        String redirectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(redirectedUrl, "https://setec.mk/index.php?route=common/home");
    }

}
