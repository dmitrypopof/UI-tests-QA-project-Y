package ru.yandex.practicum.sprintselenium.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MainPageQuestionsAboutImportant {

    private static final By HOW_MATH_AND_HOW_TO_PLAY = By.xpath("//div[text()='Сколько это стоит? И как оплатить?']");//Сколько это стоит? И как оплатить?
    private static final By I_WANT_SEVERAL_SCOOTERS = By.xpath("//div[text()='Хочу сразу несколько самокатов! Так можно?']");//Хочу сразу несколько самокатов! Так можно?
    private static final By HOW_IS_THE_RENTAL_CALCULATED = By.xpath("//div[text()='Как рассчитывается время аренды?']");//Как рассчитывается время аренды?
    private static final By ORDER_SCOOTER_TODAY = By.xpath("//div[text()='Можно ли заказать самокат прямо на сегодня?']");//Можно ли заказать самокат прямо на сегодня?
    private static final By ORDER_SCOOTER_EARLIER = By.xpath("//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");//Можно ли продлить заказ или вернуть самокат раньше?
    private static final By CHARGING_WITH_SCOOTER = By.xpath("//div[text()='Вы привозите зарядку вместе с самокатом?']");//Вы привозите зарядку вместе с самокатом?
    private static final By POSSIBLE_CANCEL_ORDER = By.xpath("//div[text()='Можно ли отменить заказ?']");//Можно ли отменить заказ?
    private static final By I_LIVE_BEHIND_MKAD = By.xpath("//div[text()='Я жизу за МКАДом, привезёте?']");//Я живу за МКАДом, привезёте?
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    private final WebDriver driver;

    public MainPageQuestionsAboutImportant(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get(PAGE_URL);
    }


    public void findQuestionAbout(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = driver.findElement(By.xpath("//div[@class = 'Home_SubHeader__zwi_E'][text()='Вопросы о важном']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }


    public void clickAboutHowMath(){
        driver.findElement(HOW_MATH_AND_HOW_TO_PLAY).click();
    }
    public boolean isDisplayedAnswerHowMath(){
        return driver.findElement(By.xpath("//p[text() = 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.']")).isDisplayed();
    }


    public void clickAboutSeveralScooters(){
        driver.findElement(I_WANT_SEVERAL_SCOOTERS).click();
    }
    public boolean isDisplayedAnswerAboutSeveralScooters(){
        return driver.findElement(By.xpath("//p[text() = 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']")).isDisplayed();
    }



    public void clickAboutHowRentalCalculated(){
        driver.findElement(HOW_IS_THE_RENTAL_CALCULATED).click();
    }
    public boolean isDisplayedAnswerHowRentalCalculated(){
        return driver.findElement(By.xpath("//p[text() = 'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']")).isDisplayed();
    }



    public void clickAboutOrderScooterToday(){
        driver.findElement(ORDER_SCOOTER_TODAY).click();
    }
    public boolean isDisplayedAnswerOrderScooterToday(){
        return driver.findElement(By.xpath("//p[text() = 'Только начиная с завтрашнего дня. Но скоро станем расторопнее.']")).isDisplayed();
    }



    public void clickAboutOrderScooterEarlier(){
        driver.findElement(ORDER_SCOOTER_EARLIER).click();
    }
    public boolean isDisplayedAnswerOrderScooterEarlier(){
        return driver.findElement(By.xpath("//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']")).isDisplayed();
    }



    public void clickAboutChargingWithScooter(){
        driver.findElement(CHARGING_WITH_SCOOTER).click();
    }
    public boolean isDisplayedAnswerChargingWithScooter(){
        return driver.findElement(By.xpath("//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']")).isDisplayed();
    }



    public void clickAboutPossibleCancelOrder(){
        driver.findElement(POSSIBLE_CANCEL_ORDER).click();
    }
    public boolean isDisplayedAnswerPossibleCancelOrder(){
        return driver.findElement(By.xpath("//p[text() = 'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']")).isDisplayed();
    }


    public void clickAboutILiveBehindMCAD(){
        driver.findElement(I_LIVE_BEHIND_MKAD).click();
    }
    public boolean isDisplayedAnswerILiveBehindMCAD(){
        return  driver.findElement(By.xpath("//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']")).isDisplayed();
    }
}
