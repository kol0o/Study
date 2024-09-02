import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopUpBalanceTest extends BaseTest {

    @Test
    public void testPhoneAndSumInput() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Обработка всплывающего окна cookies
        try {
            // Пытаемся найти и нажать кнопку принятия cookies, если она существует
            WebElement cookiesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Принять']")));
            cookiesButton.click();
        } catch (Exception e) {
            // Если кнопка не найдена, можно записать лог или просто игнорировать
            System.out.println("Всплывающее окно cookies не найдено или уже закрыто.");
        }

        WebElement phoneInput = driver.findElement(By.xpath("//*[@id='connection-phone']"));

        String phoneNumber = "297777777";
        phoneInput.sendKeys(phoneNumber);
        Thread.sleep(2000);

        String enteredText = phoneInput.getAttribute("value");
        assertEquals("(29)777-77-77", enteredText, "The phone number entered in the input field does not match the expected value.");

        WebElement sumInput = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        String sum = "10";
        sumInput.sendKeys(sum);
        Thread.sleep(2000);

        enteredText = sumInput.getAttribute("value");
        assertEquals(sum, enteredText, "The sum entered in the input field does not match the expected value ");

        WebElement submitButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));

        submitButton.click();
    }
}


