import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkTest extends BaseTest {

    @Test
    public void testLinkIsWorking() {
        LinkPage linkPage = new LinkPage(driver);

        // Получаем URL ссылки и переходим по ней
        String url = linkPage.getMoreInfoLinkUrl();
        assert url != null;
        driver.navigate().to(url);
        System.out.println("Navigated to: " + url);

        // Проверяем, что страница загрузилась с ожидаемым заголовком
        String expectedTitle = "Порядок оплаты и безопасность интернет платежей";
        String actualTitle = driver.getTitle();
        System.out.println("Page title: " + actualTitle);

        assertEquals(expectedTitle, actualTitle, "The page title does not match the expected title.");
    }
}
