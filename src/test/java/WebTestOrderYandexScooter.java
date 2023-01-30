import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.practicum.sprintselenium.model.MainPageYandexScooter;

@RunWith(Parameterized.class)
public class WebTestOrderYandexScooter {
    private final String name;
    private final String surname;
    private final String address;
    private final String number;
    private final String date;
    private final String comment;
    private WebDriver driver;

    public WebTestOrderYandexScooter(String name, String surname, String address, String number, String date, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.number = number;
        this.date = date;
        this.comment = comment;
    }
    @Parameterized.Parameters
    public static Object[][] getInput(){
        return new Object[][]{
                {"Владимир","Маяковский","Открытое шоссе, 9с5","88002000600","05.02.2023", ""},
                {"Лев Николаевич","Толстой","Кутузова 56","+79009001010","10.10.2023","Тестовый комментарий"}
        };


    }

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
    }


    @Test
    public void orderButtonFirstUpPositive(){
        MainPageYandexScooter page = new MainPageYandexScooter(driver);
        page.open();
        page.clickOrderButtonFirst();
        page.inputNameFolder(name);
        page.inputSurnameFolder(surname);
        page.inputAddressFolder(address);
        page.selectMetro();
        page.inputPhoneNumber(number);
        page.pressButtonNext();
        page.inputDate(date);
        page.selectColor();
        page.selectRentalPeriod();
        page.writeComment(comment);
        page.clickButtonOrderWithCompletedForm();
        page.isOrderSuccessfullyCreated();
        Assert.assertTrue("Ожидание isOrderSuccessfullyCreated не совпадает",page.isOrderSuccessfullyCreated());

    }

    @Test
    public void orderButtonDownScrollPositive(){
        MainPageYandexScooter page = new MainPageYandexScooter(driver);
        page.open();
        page.findButtonDownScroll();
        page.clickOrderButtonDownScroll();
        page.inputNameFolder(name);
        page.inputSurnameFolder(surname);
        page.inputAddressFolder(address);
        page.selectMetro();
        page.inputPhoneNumber(number);
        page.pressButtonNext();
        page.inputDate(date);
        page.selectColor();
        page.selectRentalPeriod();
        page.writeComment(comment);
        page.clickButtonOrderWithCompletedForm();
        page.isOrderSuccessfullyCreated();
        Assert.assertTrue("Ожидание isOrderSuccessfullyCreated не совпадает",page.isOrderSuccessfullyCreated());



    }

    @After
    public void cleanUP(){
        driver.quit();
    }

}
