package io.github.katterinaoleynik.scooter;

import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Condition.exactText;

public class MainPageTest {

    private final MainPagePOM mainPage = new MainPagePOM();

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
        mainPage.getAnswerStep1().shouldHave(exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    //Ответ на второй вопрос
    @Test
    public void checkTextQuestions2() {
        mainPage.waitForLoadAccordion2();
        mainPage.clickAccordion2();
        mainPage.getAnswerStep2().shouldHave(exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }

    //Ответ на третий вопрос
    @Test
    public void checkTextQuestions3() {
        mainPage.waitForLoadAccordion3();
        mainPage.clickAccordion3();
        mainPage.getAnswerStep3().shouldHave(exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    //Ответ на четвертый вопрос
    @Test
    public void checkTextQuestions4() {
        mainPage.waitForLoadAccordion4();
        mainPage.clickAccordion4();
        mainPage.getAnswerStep4().shouldHave(exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    //Ответ на пятый вопрос
    @Test
    public void checkTextQuestions5() {
        mainPage.waitForLoadAccordion5();
        mainPage.clickAccordion5();
        mainPage.getAnswerStep5().shouldHave(exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }

    //Ответ на шестой вопрос
    @Test
    public void checkTextQuestions6() {
        mainPage.waitForLoadAccordion6();
        mainPage.clickAccordion6();
        mainPage.getAnswerStep6().shouldHave(exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    //Ответ на седьмой вопрос
    @Test
    public void checkTextQuestions7() {
        mainPage.waitForLoadAccordion7();
        mainPage.clickAccordion7();
        mainPage.getAnswerStep7().shouldHave(exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    //Ответ на восьмой вопрос
    @Test
    public void checkTextQuestions8() {
        mainPage.waitForLoadAccordion8();
        mainPage.clickAccordion8();
        mainPage.getAnswerStep8().shouldHave(exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

}



