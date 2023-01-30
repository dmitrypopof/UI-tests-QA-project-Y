package ru.yandex.practicum.sprintselenium.model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MainPageYandexScooter {
    private static final By ORDER_BUTTON_FIRST = By.cssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g");  //верхняя кнопка заказать (стартовой страницы)
    private static final By ORDER_BUTTON_DOWN_SCROLL = By.xpath("//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']"); // кнопка заказать при скролле вниз
    private static final By NAME_FOLDER = By.cssSelector("div.Order_Form__17u6u > div:nth-child(1) > input");    //поле ввода имени
    private static final By SURNAME_FOLDER = By.cssSelector("div.Order_Form__17u6u > div:nth-child(2) > input");//поле ввода фамилии
    private static final By ADDRESS_ORDER = By.cssSelector("div.Order_Form__17u6u > div:nth-child(3) > input");//поле ввода адреса
    private static final By SELECT_METRO_PLACEHOLDER = By.cssSelector("div.Order_Form__17u6u > div:nth-child(4) > div > div > input");//выбор плейсхолдера станций метро
    private static final By STATION_METRO_ROKOSSOVSKY = By.cssSelector("div.select-search__select > ul > li:nth-child(1) > button > div.Order_Text__2broi");//Станция метро Рокоссовская
    private static final By PHONE_NUMBER = By.cssSelector("div.Order_Form__17u6u > div:nth-child(5) > input");//ввод телефонного номера
    private static final By NEXT_BUTTON = By.cssSelector("div.Order_NextButton__1_rCA > button");//кнопка далее
    private static final By DATE_SELECT = By.cssSelector("div.react-datepicker-wrapper > div > input");//выбрать дату
    private static final By RENTAL_FIELD_PLACEHOLDER = By.cssSelector("div.Dropdown-arrow-wrapper > span");//кнопка плейсхолдера время аренды
    private static final By RENTAL_PERIOD_ONE_DAY = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div.Dropdown-root.is-open > div.Dropdown-menu > div:nth-child(1)");//выбор время аренды - сутки
    private static final By COMMENT_ORDER = By.cssSelector("div.Order_Form__17u6u > div.Input_InputContainer__3NykH > input");//поле комментарии в заказе
    private static final By SELECT_COLOR_TRANSPORT = By.cssSelector("#grey");// выбор цвета самоката
    private static final By ORDER_BUTTON_COMPLETED_FORM = By.cssSelector("div.Order_Buttons__1xGrp > button:nth-child(2)");//кнопка заказать
    private static final By ORDER_BUTTON_COMPLETED_FORM_CONFIRMATION = By.cssSelector("div.Order_Modal__YZ-d3 > div.Order_Buttons__1xGrp > button:nth-child(2)");//кнопка подтверждения заказа
    private static final By WINDOW_ORDER_SUCCESSFULLY = By.xpath("//div[@class = 'Order_Modal__YZ-d3']/div[@class = 'Order_ModalHeader__3FDaJ'][text() = 'Заказ оформлен']");//окно с текстом Заказ оформлен
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    private final WebDriver driver;
    public MainPageYandexScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get(PAGE_URL);  // открываем страницу, используя метод get
    }

    public void clickOrderButtonFirst(){
        driver.findElement(ORDER_BUTTON_FIRST).click();
    }
    public void clickOrderButtonDownScroll(){
        driver.findElement(ORDER_BUTTON_DOWN_SCROLL).click();
    }

    public void findButtonDownScroll(){
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //для всех вызовов findElements неявное ожидание 15 секунд
        WebElement element = driver.findElement(ORDER_BUTTON_DOWN_SCROLL);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public  String inputNameFolder(String name){
        driver.findElement(NAME_FOLDER).clear();
        driver.findElement(NAME_FOLDER).sendKeys(name);
        return name;
    }

    public String inputSurnameFolder(String surname){
        driver.findElement(SURNAME_FOLDER).clear();
        driver.findElement(SURNAME_FOLDER).sendKeys(surname);
        return surname;

    }

    public String inputAddressFolder(String address){
        driver.findElement(ADDRESS_ORDER).clear();
        driver.findElement(ADDRESS_ORDER).sendKeys(address);
        return address;
    }

    public void selectMetro(){
        driver.findElement(SELECT_METRO_PLACEHOLDER).click();
        driver.findElement(STATION_METRO_ROKOSSOVSKY).click();
    }

    public String inputPhoneNumber(String number){
        driver.findElement(PHONE_NUMBER).clear();
        driver.findElement(PHONE_NUMBER).sendKeys(number);
        return number;
    }

    public void pressButtonNext(){
        driver.findElement(NEXT_BUTTON).click();
    }

    public String inputDate(String date){
        driver.findElement(DATE_SELECT).clear();
        driver.findElement(DATE_SELECT).sendKeys(date);
        driver.findElement(DATE_SELECT).click();
        return date;
    }

    public void selectColor(){
        driver.findElement(SELECT_COLOR_TRANSPORT).click();
    }

    public void selectRentalPeriod(){
        driver.findElement(RENTAL_FIELD_PLACEHOLDER).click();
        driver.findElement(RENTAL_PERIOD_ONE_DAY).click();
    }

    public String writeComment(String comment){
        driver.findElement(COMMENT_ORDER).clear();
        driver.findElement(COMMENT_ORDER).sendKeys(comment);
        return comment;
    }

    public void clickButtonOrderWithCompletedForm(){
        driver.findElement(ORDER_BUTTON_COMPLETED_FORM).click();
        driver.findElement(ORDER_BUTTON_COMPLETED_FORM_CONFIRMATION).click();
    }

    public boolean isOrderSuccessfullyCreated (){//поправить
        return driver.findElement(WINDOW_ORDER_SUCCESSFULLY).isDisplayed();
    }


}
