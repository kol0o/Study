import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LogoPresenceTest extends BaseTest {
    @Test
    public void testVisaLogoPresence() {
        WebElement visaLogo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='Visa']"));
        assertTrue(visaLogo.isDisplayed(), "Visa logo is not displayed on the page");
    }

    @Test
    public void testVisaVerifiedLogoPresence() {
        WebElement visaVerifiedLogo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='Verified By Visa']"));
        String logoSrc = visaVerifiedLogo.getAttribute("src");
        System.out.println(logoSrc);
        assertTrue(visaVerifiedLogo.isDisplayed(), "Verified By Visa logo is not displayed on the page");
    }

    @Test
    public void testMastercardLogoPresence() {
        WebElement mastercardVerifiedLogo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='MasterCard']"));
        assertTrue(mastercardVerifiedLogo.isDisplayed(), "Mastercard logo is not displayed on the page");
    }

    @Test
    public void testMastercardSecureCodeLogoPresence() {
        WebElement mastercardSecureCodeLogo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='MasterCard Secure Code']"));
        assertTrue(mastercardSecureCodeLogo.isDisplayed(), "MastercardVerified logo is not displayed on the page");
    }

    @Test
    public void testBelcardLogoPresence() {
        WebElement belcardLogo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='Белкарт']"));
        assertTrue(belcardLogo.isDisplayed(), "Belcard logo is not displayed on the page");
    }
}
