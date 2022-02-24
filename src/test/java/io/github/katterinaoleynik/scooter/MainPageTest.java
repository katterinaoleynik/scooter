package io.github.katterinaoleynik.scooter;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;


public class MainPageTest {

    private final MainPagePOM mainPage = new MainPagePOM();

    public class YandexTest {
        ChromeDriver driver;
    }


    @Before
    public void setup() {
        mainPage.linkMainPage();
        mainPage.clickAcceptButton();
    }


    // Проверка соответствия текста при нажатии на стрелочки в блоке "Вопросы о важном"
    //Ответ на первый вопрос
    @Test
    public void checkTextQuestions1() { ;
        mainPage.waitForLoadAccordion1();
        mainPage.clickAccordion1();
        $(byId("accordion__panel-0")).shouldHave(exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    //Ответ на второй вопрос
    @Test
    public void checkTextQuestions2() {
        mainPage.waitForLoadAccordion2();
        mainPage.clickAccordion2();
        $(byId("accordion__panel-1")).shouldHave(exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    //Ответ на третий вопрос
    @Test
    public void checkTextQuestions3() {
        mainPage.waitForLoadAccordion3();
        mainPage.clickAccordion3();
        $(byId("accordion__panel-2")).shouldHave(exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    //Ответ на четвертый вопрос
    @Test
    public void checkTextQuestions4() {
        mainPage.waitForLoadAccordion4();
        mainPage.clickAccordion4();
        $(byId("accordion__panel-3")).shouldHave(exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    //Ответ на пятый вопрос
    @Test
    public void checkTextQuestions5() {
        mainPage.waitForLoadAccordion5();
        mainPage.clickAccordion5();
        $(byId("accordion__panel-4")).shouldHave(exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    //Ответ на шестой вопрос
    @Test
    public void checkTextQuestions6() {
        mainPage.waitForLoadAccordion6();
        mainPage.clickAccordion6();
        $(byId("accordion__panel-5")).shouldHave(exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    //Ответ на седьмой вопрос
    @Test
    public void checkTextQuestions7() {
        mainPage.waitForLoadAccordion7();
        mainPage.clickAccordion7();
        $(byId("accordion__panel-6")).shouldHave(exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    //Ответ на восьмой вопрос
    @Test
    public void checkTextQuestions8() {
        mainPage.waitForLoadAccordion8();
        mainPage.clickAccordion8();
        $(byId("accordion__panel-7")).shouldHave(exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

}



