import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LogoPresenceTest extends BaseTest {
    @Test
    public void testVisaLogoPresence() {
        WebElement visaLogo = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg' and @alt='Visa']"));
        assertTrue(visaLogo.isDisplayed(), "Visa logo is not displayed on the page");
    }

    @Test
    public void testVisaVerifiedLogoPresence() {
        WebElement visaVerifiedLogo = driver.findElement(By.xpath("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg' and @alt='Verified By Visa']"));
        assertTrue(visaVerifiedLogo.isDisplayed(), "Verified By Visa logo is not displayed on the page");
    }

    @Test
    public void testMastercardLogoPresence() {
        WebElement mastercardVerifiedLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
        assertTrue(mastercardVerifiedLogo.isDisplayed(), "Mastercard logo is not displayed on the page");
    }

    @Test
    public void testMastercardSecureCodeLogoPresence() {
        WebElement mastercardSecureCodeLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
        assertTrue(mastercardSecureCodeLogo.isDisplayed(), "MastercardVerified logo is not displayed on the page");
    }

    @Test
    public void testBelcardLogoPresence() {
        WebElement belcardLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
        assertTrue(belcardLogo.isDisplayed(), "Belcard logo is not displayed on the page");
    }
}
