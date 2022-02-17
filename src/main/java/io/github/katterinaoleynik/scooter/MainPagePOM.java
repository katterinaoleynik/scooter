package io.github.katterinaoleynik.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MainPagePOM {
    public WebDriver driver;

    //Создаём драйвер для браузера Chrome
    public void linkMainPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    //Кликаем на кнопку "Заказать" в хедере
    public void clickOrderInHeader() {
        driver.findElement(By.className("Button_Button__ra12g")).click();
    }

    //Кликаем на кнопку "Статус заказа" в хедере
    public void clickStatus() {
        driver.findElement(By.className("Header_Link__1TAG7")).click();
    }

    //Кликаем по кнопке Go в Статусе заказа
    public void clickGoButton() {
        driver.findElement(By.className("Button_Button__ra12g Header_Button__28dPO")).click();
    }

    //Ввод номера заказа
    public void setOrderNumber(String order) {
        driver.findElement(By.className("tagNameInput_Input__1iN_Z Header_Input__xIoUq")).sendKeys(order);
    }

    //Кликаем на кнопку "Заказать"
    public void clickOrder() {
        driver.findElement(By.className("Button_Button__ra12g Button_Middle__1CSJM")).click();
    }

    //Кликаем на лого "Самокат" в хедере
    public void clickLogoScooterInHeader() {
        driver.findElement(By.className("Header_LogoScooter__3lsAR")).click();
    }

    //Кликаем на лого "Яндекс" в хедере
    public void clickLogoYandexInHeader() {
        driver.findElement(By.className("Header_LogoYandex__3TSOI")).click();
    }

    //Получаем текст дисклеймера в хедере
    public String getTextDisclaimer() {
        return driver.findElement(By.className("Header_Disclaimer__3VEni")).getText();
    }

    //Получаем текст заголовков страницы
    public String getTextHomeHeader() {
        return driver.findElement(By.className("Home_Header__iJKdX")).getText();
    }

    //Получаем текст подзаголовков страницы
    public String getTextHomeSubHeader() {
        return driver.findElement(By.className("Home_SubHeader__zwi_E")).getText();
    }

    //Получаем текст страницы с описанием модели
    public String getTextHomeColumn() {
        return driver.findElement(By.className("Home_Column__xlKDK")).getText();
    }

    //Получаем текст шагов из блока "Как это работает"
    public String getTextFromSteps() {
        return driver.findElement(By.className("Home_Status__YkfmH")).getText();
    }

    //Получаем описание шагов
    public String getTextByStepTwo() {
        return driver.findElement(By.className("Home_StatusDescription__3WGl5")).getText();
    }

    //Блок "Вопросы о важном "Кликаем на "аккардионы" из блока "Вопросы о важном"
    public void clickAccordion1() {
        driver.findElement(By.id("accordion__heading-16")).click();
    }

    public void clickAccordion2() {
        driver.findElement(By.id("accordion__heading-17")).click();
    }

    public void clickAccordion3() {
        driver.findElement(By.id("accordion__heading-18")).click();
    }

    public void clickAccordion4() {
        driver.findElement(By.id("accordion__heading-19")).click();
    }

    public void clickAccordion5() {
        driver.findElement(By.id("accordion__heading-20")).click();
    }

    public void clickAccordion6() {
        driver.findElement(By.id("accordion__heading-21")).click();
    }

    public void clickAccordion7() {
        driver.findElement(By.id("accordion__heading-22")).click();
    }

    public void clickAccordion8() {
        driver.findElement(By.id("accordion__heading-23")).click();
    }
}
