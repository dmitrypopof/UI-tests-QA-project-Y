import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.practicum.sprintselenium.model.MainPageQuestionsAboutImportant;

public class WebTestQuestionsAboutImportant {
    private WebDriver driver;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void clickDropdownListHowMath(){
        MainPageQuestionsAboutImportant page = new MainPageQuestionsAboutImportant(driver);
        page.open();
        page.findQuestionAbout();
        page.clickAboutHowMath();
        page.isDisplayedAnswerHowMath();
        Assert.assertTrue("Ожидание в clickDropdownListHowMath не совпадает",page.isDisplayedAnswerHowMath());

    }

    @Test
    public void clickDropdownListAboutSeveralScooters(){
        MainPageQuestionsAboutImportant page = new MainPageQuestionsAboutImportant(driver);
        page.open();
        page.findQuestionAbout();
        page.clickAboutSeveralScooters();
        page.isDisplayedAnswerAboutSeveralScooters();
        Assert.assertTrue("Ожидание в clickDropdownListAboutSeveralScooters не совпадает", page.isDisplayedAnswerAboutSeveralScooters());

    }

    @Test
    public void clickDropdownListAboutHowRentalCalculated(){
        MainPageQuestionsAboutImportant page = new MainPageQuestionsAboutImportant(driver);
        page.open();
        page.findQuestionAbout();
        page.clickAboutHowRentalCalculated();
        page.isDisplayedAnswerHowRentalCalculated();
        Assert.assertTrue("Ожидание clickDropdownListAboutHowRentalCalculated не совпадает", page.isDisplayedAnswerHowRentalCalculated());
    }

    @Test
    public void clickDropdownListAboutOrderScooterToday(){
        MainPageQuestionsAboutImportant page = new MainPageQuestionsAboutImportant(driver);
        page.open();
        page.findQuestionAbout();
        page.clickAboutOrderScooterToday();
        page.isDisplayedAnswerOrderScooterToday();
        Assert.assertTrue("Ожидание clickDropdownListAboutOrderScooterToday не совпадает", page.isDisplayedAnswerOrderScooterToday());
    }

    @Test
    public void clickDropdownListAboutOrderScooterEarlier(){
        MainPageQuestionsAboutImportant page = new MainPageQuestionsAboutImportant(driver);
        page.open();
        page.findQuestionAbout();
        page.clickAboutOrderScooterEarlier();
        page.isDisplayedAnswerOrderScooterEarlier();
        Assert.assertTrue("Ожидание clickDropdownListAboutOrderScooterEarlier не совпадает", page.isDisplayedAnswerOrderScooterEarlier());
    }

    @Test
    public void clickDropdownListAboutChargingWithScooter(){
        MainPageQuestionsAboutImportant page = new MainPageQuestionsAboutImportant(driver);
        page.open();
        page.findQuestionAbout();
        page.clickAboutChargingWithScooter();
        page.isDisplayedAnswerChargingWithScooter();
        Assert.assertTrue("Ожидание clickDropdownListAboutChargingWithScooter не совпадает", page.isDisplayedAnswerChargingWithScooter());
    }

    @Test
    public void clickDropdownListAboutPossibleCancelOrder(){
        MainPageQuestionsAboutImportant page = new MainPageQuestionsAboutImportant(driver);
        page.open();
        page.findQuestionAbout();
        page.clickAboutPossibleCancelOrder();
        page.isDisplayedAnswerPossibleCancelOrder();
        Assert.assertTrue("Ожидание clickDropdownListAboutPossibleCancelOrder не совпадает",page.isDisplayedAnswerPossibleCancelOrder());
    }

    @Test
    public void clickDropdownListAboutILiveBehindMCAD(){
        MainPageQuestionsAboutImportant page = new MainPageQuestionsAboutImportant(driver);
        page.open();
        page.findQuestionAbout();
        page.clickAboutILiveBehindMCAD();
        page.isDisplayedAnswerILiveBehindMCAD();
        Assert.assertTrue("Ожидание clickDropdownListAboutILiveBehindMCAD не совпадает",page.isDisplayedAnswerILiveBehindMCAD());
    }

    @After
    public void cleanUp(){
        driver.quit();
    }

}
