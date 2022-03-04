package io.github.katterinaoleynik.scooter;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;


public class MainPagePOM {


    //Переходим по ссылке в гугл хроме
    public void linkMainPage() {
        open("https://qa-scooter.praktikum-services.ru/");
    }

    //Условие на проверку и нажатие на кнопку согласия использования куки
    public void clickAcceptButton() {
        if ($(byClassName("App_CookieButton__3cvqF")).exists())
            $(byClassName("App_CookieButton__3cvqF")).click();
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
        $(byClassName("Button_Button__ra12g Button_Middle__1CSJM")).shouldBe(visible);
    }

    //Кликаем на кнопку "Заказать"
    public void clickOrder() {
        $(byClassName("Button_Button__ra12g Button_Middle__1CSJM")).click();
    }

    //Кликаем на лого "Самокат" в хедере
    public void clickLogoScooterInHeader() {
        $(byClassName("Header_LogoScooter__3lsAR")).click();
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

    //Получаем текст страницы с описанием модели
    public String getTextModelDescription() {
        return $(byClassName("Home_Table__2kPxP")).getText();
    }

    //Получаем текст шагов из блока "Как это работает"
    public String getTextFromSteps() {
        return $(byClassName("Home_Status__YkfmH")).getText();
    }

    //Блок "Вопросы о важном"
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

    //Получаем ответ на 1-й вопрос
    public SelenideElement getAnswerStep1() {
        return $(byId("accordion__panel-0"));
    }

    //Вопрос 2
    public void clickAccordion2() {
        $(byId("accordion__heading-1")).click();
    }

    //Получаем ответ на 2-й вопрос
    public SelenideElement getAnswerStep2() {
        return $(byId("accordion__panel-1"));
    }

    //Вопрос 3
    public void clickAccordion3() {
        $(byId("accordion__heading-2")).click();
    }

    //Получаем ответ на 3-й вопрос
    public SelenideElement getAnswerStep3() {
        return $(byId("accordion__panel-2"));
    }

    //Вопрос 4
    public void clickAccordion4() {
        $(byId("accordion__heading-3")).click();
    }

    //Получаем ответ на 4-й вопрос
    public SelenideElement getAnswerStep4() {
        return $(byId("accordion__panel-3"));
    }

    //Вопрос 5
    public void clickAccordion5() {
        $(byId("accordion__heading-4")).click();
    }

    //Получаем ответ на 5-й вопрос
    public SelenideElement getAnswerStep5() {
        return $(byId("accordion__panel-4"));
    }

    //Вопрос 6
    public void clickAccordion6() {
        $(byId("accordion__heading-5")).click();
    }

    //Получаем ответ на 6-й вопрос
    public SelenideElement getAnswerStep6() {
        return $(byId("accordion__panel-5"));
    }

    //Вопрос 7
    public void clickAccordion7() {
        $(byId("accordion__heading-6")).click();
    }

    //Получаем ответ на 7-й вопрос
    public SelenideElement getAnswerStep7() {
        return $(byId("accordion__panel-6"));
    }

    //Вопрос 8
    public void clickAccordion8() {
        $(byId("accordion__heading-7")).click();
    }

    //Получаем ответ на 8-й вопрос
    public SelenideElement getAnswerStep8() {
        return $(byId("accordion__panel-7"));
    }

}