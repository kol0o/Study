import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkTest extends BaseTest {

    @Test
    public void testLinkIsWorking() {
        // Находим элемент ссылки по XPath
        WebElement link = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a"));

        // Получаем URL из атрибута href
        String url = link.getAttribute("href");

        // Переходим по ссылке
        assert url != null;
        driver.navigate().to(url);
        System.out.println(url);

        // Проверяем, что страница загрузилась успешно по заголовку
        String expectedTitle = "Порядок оплаты и безопасность интернет платежей";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        assertEquals(expectedTitle, actualTitle, "The page title does not match the expected title.");
    }
}
