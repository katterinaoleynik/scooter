package io.github.katterinaoleynik.scooter;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;


public class MainPagePOM {


    //Переходим по ссылке в гугл хроме
    public void linkMainPage() {
        open("https://qa-scooter.praktikum-services.ru/");
    }

    //Нажатие на кнопку согласия использования куки
    public void clickConfirmButton() {
        $(byId("rcc-confirm-button")).click();
    }

    //Ожидание кнопки "Заказать" в хедере
    public void waitOrderInHeader() {
        $(byClassName("Button_Button__ra12g")).shouldBe(visible);
    }

    //Кликаем на кнопку "Заказать" в хедере
    public void clickOrderInHeader() {
        $(byClassName("Button_Button__ra12g")).click();
    }

    //Ожидание кнопки "Статус заказа" в хедере
    public void waitStatus() {
        $(byClassName("Header_Link__1TAG7")).shouldBe(visible);
    }

    //Кликаем на кнопку "Статус заказа" в хедере
    public void clickStatus() {
        $(byClassName("Header_Link__1TAG7")).click();
    }

    //Ожидание кнопки Go в Статусе заказа
    public void waitGoButton() {
        $(byClassName("Button_Button__ra12g Header_Button__28dPO")).shouldBe(visible);
    }

    //Кликаем по кнопке Go в Статусе заказа
    public void clickGoButton() {
        $(byClassName("Button_Button__ra12g Header_Button__28dPO")).click();
    }

    //Ввод номера заказа
    public void setOrderNumber(String order) {
        $(byClassName("tagNameInput_Input__1iN_Z Header_Input__xIoUq")).sendKeys(order);
    }

    //Ожидание кнопки "Заказать"
    public void waitOrder() {
        $(byXpath("/html/body/div/div/div/div[4]/div[2]/div[5]/button")).shouldBe(visible);
    }

    //Кликаем на кнопку "Заказать"
    public void clickOrder() {
        $(byXpath("/html/body/div/div/div/div[4]/div[2]/div[5]/button")).click();
    }

    //Кликаем на лого "Самокат" в хедере
    public void clickLogoScooterInHeader() {
        $(byXpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/a[2]/img")).click();
    }

    //Кликаем на лого "Яндекс" в хедере
    public void clickLogoYandexInHeader() {
        $(byClassName("Header_LogoYandex__3TSOI")).click();
    }

    //Получаем текст дисклеймера в хедере
    public String getTextDisclaimer() {
        return $(byClassName("Header_Disclaimer__3VEni")).getText();
    }

    //Получаем текст заголовка страницы
    public String getTextHomeHeader() {
        return $(byClassName("Home_Header__iJKdX")).getText();
    }

    //Получаем текст первого подзаголовка страницы
    public String getTextHomeSubHeader1() {
        return $(byXpath("//*[@id=\"root\"]/div/div/div[2]/div[4]/div[1]")).getText();
    }

    //Получаем текст второго подзаголовка страницы
    public String getTextHomeSubHeader2() {
        return $(byXpath("//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]")).getText();
    }

    //Получаем текст третьего подзаголовка страницы
    public String getTextHomeSubHeader3() {
        return $(byXpath("//*[@id=\"root\"]/div/div/div[4]/div[1]")).getText();
    }

    //Получаем текст четвертого подзаголовка страницы
    public String getTextHomeSubHeader4() {
        return $(byXpath("//*[@id=\"root\"]/div/div/div[5]/div[1]")).getText();
    }


    //Получаем текст страницы с описанием модели
    public String getTextModelDescription() {
        return $(byClassName("Home_Table__2kPxP")).getText();
    }


    //Получаем текст шагов из блока "Как это работает"
    public String getTextFromSteps() {
        return $(byClassName("Home_Status__YkfmH")).getText();
    }

    //Получаем текст первого шага из блока "Как это работает"
    public String getTextStep1() {
        return $(byXpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[1]/div[2]")).getText();
    }

    //Получаем текст второго шага из блока "Как это работает"
    public String getTextStep2() {
        return $(byXpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[2]/div[2]")).getText();
    }

    //Получаем текст третьего шага из блока "Как это работает"
    public String getTextStep3() {
        return $(byXpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[3]/div[2]")).getText();
    }

    //Получаем текст четвертого шага из блока "Как это работает"
    public String getTextStep4() {
        return $(byXpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[4]/div[2]")).getText();
    }

    // ожидание загрузки 1-го вопроса о важном
    public void waitForLoadAccordion1() {
        $(byId("accordion__heading-0")).shouldBe(visible);
    }

    // ожидание загрузки 2-го вопроса о важном
    public void waitForLoadAccordion2() {
        $(byId("accordion__heading-1")).shouldBe(visible);
    }

    // ожидание 3-го вопроса о важном
    public void waitForLoadAccordion3() {
        $(byId("accordion__heading-2")).shouldBe(visible);
    }

    //ожидание загрузки 4-го вопроса о важном
    public void waitForLoadAccordion4() {
        $(byId("accordion__heading-3")).shouldBe(visible);
    }

    // ожидание загрузки 5-го вопроса о важном
    public void waitForLoadAccordion5() {
        $(byId("accordion__heading-4")).shouldBe(visible);
    }

    // ожидание загрузки 6-го вопроса о важном
    public void waitForLoadAccordion6() {
        $(byId("accordion__heading-5")).shouldBe(visible);
    }

    // ожидание загрузки 7-го вопроса о важном
    public void waitForLoadAccordion7() {
        $(byId("accordion__heading-6")).shouldBe(visible);
    }

    // ожидание загрузки 8-го вопроса о важном
    public void waitForLoadAccordion8() {
        $(byId("accordion__heading-7")).shouldBe(visible);
    }

    //Блок "Вопросы о важном "Кликаем на "аккардионы" из блока "Вопросы о важном"
    // Вопрос 1
    public void clickAccordion1() {
        $(byId("accordion__heading-0")).click();
    }

    //Вопрос 2
    public void clickAccordion2() {
        $(byId("accordion__heading-1")).click();
    }

    //Вопрос 3
    public void clickAccordion3() {
        $(byId("accordion__heading-2")).click();
    }

    //Вопрос 4
    public void clickAccordion4() {
        $(byId("accordion__heading-3")).click();
    }

    //Вопрос 5
    public void clickAccordion5() {
        $(byId("accordion__heading-4")).click();
    }

    //Вопрос 6
    public void clickAccordion6() {
        $(byId("accordion__heading-5")).click();
    }

    //Вопрос 7
    public void clickAccordion7() {
        $(byId("accordion__heading-6")).click();
    }

    //Вопрос 8
    public void clickAccordion8() {
        $(byId("accordion__heading-7")).click();
    }
}