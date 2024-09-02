import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleVerificationTest extends BaseTest {

    @Test
    public void testTitleText() {
        // Находим элемент по его тегу h2 и классу pay__wrapper
        WebElement titleElement = driver.findElement(By.xpath("//div[@class='pay__wrapper']//h2"));

        // Получаем текст элемента
        String titleText = titleElement.getText();
        System.out.println(titleText);

        // Проверяем текст элемента, ожидаем, что он будет "Онлайн пополнение без комиссии" (с учётом переноса строки)
        assertEquals("Онлайн пополнение\nбез комиссии", titleText, "Название блока не соответствует ожидаемому!");
    }
}

