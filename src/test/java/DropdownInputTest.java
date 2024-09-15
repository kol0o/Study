import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropdownInputTest extends BaseTest {
    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        super.setUp();
        mainPage = new MainPage(driver);
        mainPage.rejectCookies();
    }

    @Test
    public void testConnectionServiceDropdownInputs() {
        mainPage.selectOption("Услуги связи");
        assertEquals("Номер телефона", mainPage.getConnectionPhonePlaceholder(), "Placeholder для номера телефона в 'Услуги связи' неверный.");
        assertEquals("Сумма", mainPage.getConnectionSumPlaceholder(), "Placeholder для суммы в 'Услуги связи' неверный.");
    }

    @Test
    public void testHomeInternetDropdownInputs() {
        mainPage.selectOption("Домашний интернет");
        assertEquals("Номер абонента", mainPage.getHomeInternetPhonePlaceholder(), "Placeholder для номера телефона в 'Домашний интернет' неверный.");
        assertEquals("Сумма", mainPage.getHomeInternetSumPlaceholder(), "Placeholder для суммы в 'Домашний интернет' неверный.");
    }

    @Test
    public void testInstalmentDropdownInputs() {
        mainPage.selectOption("Рассрочка");
        assertEquals("Номер счета на 44", mainPage.getInstalmentAccountPlaceholder(), "Placeholder для номера счета в 'Рассрочка' неверный.");
        assertEquals("Сумма", mainPage.getInstalmentSumPlaceholder(), "Placeholder для суммы в 'Рассрочка' неверный.");
        assertEquals("E-mail для отправки чека", mainPage.getInstalmentEmailPlaceholder(), "Placeholder для e-mail в 'Рассрочка' неверный.");
    }

    @Test
    public void testArrearsDropdownInputs() {
        mainPage.selectOption("Задолженность");
        assertEquals("Номер счета на 2073", mainPage.getArrearsAccountPlaceholder(), "Placeholder для номера счета в 'Задолженность' неверный.");
        assertEquals("Сумма", mainPage.getArrearsSumPlaceholder(), "Placeholder для суммы в 'Задолженность' неверный.");
        assertEquals("E-mail для отправки чека", mainPage.getArrearsEmailPlaceholder(), "Placeholder для e-mail в 'Задолженность' неверный.");
    }
}
