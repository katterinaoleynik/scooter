package io.github.katterinaoleynik.scooter;

import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPageTest {

    private final MainPagePOM mainPage = new MainPagePOM();

    @Before
    public void setup() {
        mainPage.linkMainPage();
        mainPage.clickConfirmButton();
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

    //Оформление заказа через кнопку "Заказать" в хедере главной страницы
    //Позитивный сценарий 1
    @Test
    public void createOrderInHeader1() {
        mainPage.waitOrderInHeader();
        mainPage.clickOrderInHeader();
        //заполнение поля с именем
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input")).setValue("Евгений");
        //заполнение поля с фамилией
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input")).setValue("Александров");
        //заполнение поля с адресом
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input")).setValue("Белы Куна 22 квартира 1");
        //ввод и выбор станции "Беговая" в поле "станция метро"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div")).click();
        $(byClassName("select-search__input")).setValue("Беговая");
        $(byCssSelector(".select-search__select")).click();
        //заполнение поля с номером телефона
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input")).setValue("79991999999");
        //нажатие кнопки "Далее"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button")).click();
        //ввод даты
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input")).setValue("12.12.2022").pressEnter();
        //клик на поле "срок аренды"
        $(byXpath("/html/body/div/div/div[2]/div[2]/div[2]/div")).click();
        //выбор варианта "четверо суток" из выпадающего меню
        $(byXpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[4]")).click();
        //выбор цвета самоката "черный жемчуг"
        $(byXpath("//*[@id=\"black\"]")).click();
        //заполнение поля комментария для курьера
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input")).setValue("Позвонить по приезде и купи сиги пж");
        //нажатие на кнопку "заказать"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]")).click();
        //выбрать вариант "да" в модальном окне подтверждения заказа
        $(byXpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]")).click();
    }

    //Оформление заказа через кнопку "Заказать" в хедере
    //Позитивный сценарий 2
    @Test
    public void createOrderInHeader2() {
        mainPage.waitOrderInHeader();
        mainPage.clickOrderInHeader();
        //заполнение поля с именем
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input")).setValue("Тестовый");
        //заполнение поля с фамилией
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input")).setValue("Тест");
        //заполнение поля с адресом
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input")).setValue("Нормальный адрес 90-210");
        //ввод и выбор станции "Лубянка" в поле "станция метро"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div")).click();
        $(byClassName("select-search__input")).setValue("Лубянка");
        $(byCssSelector(".select-search__select")).click();
        //заполнение поля с номером телефона
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input")).setValue("88123456765");
        //нажатие кнопки "Далее"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button")).click();
        //ввод даты
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input")).setValue("20.07.2022").pressEnter();
        //клик на поле "срок аренды"
        $(byXpath("/html/body/div/div/div[2]/div[2]/div[2]/div")).click();
        //выбор варианта "семеро суток" из выпадающего меню
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[7]")).click();
        //выбор цвета самоката "серая безысходность"
        $(byXpath("//*[@id=\"grey\"]")).click();
        //заполнение поля комментария для курьера
        //$(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input")).setValue("Позвонить по приезде и купи сиги пж");
        //нажатие на кнопку "заказать"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]")).click();
        //выбрать вариант "да" в модальном окне подтверждения заказа
        $(byXpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]")).click();
    }


    //Оформление заказа через кнопку "Заказать" на главной странице.
    //Позитивный сценарий 1
    @Test
    public void createOrder1() {
        mainPage.waitOrder();
        mainPage.clickOrder();
        //заполнение поля с именем
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input")).setValue("Андрей");
        //заполнение поля с фамилией
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input")).setValue("суровов");
        //заполнение поля с адресом
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input")).setValue("встречу у метро");
        //ввод и выбор станции "Чистые пруды" в поле "станция метро"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div")).click();
        $(byClassName("select-search__input")).setValue("Чистые пруды");
        $(byCssSelector(".select-search__select")).click();
        //заполнение поля с номером телефона
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input")).setValue("+79098900990");
        //нажатие кнопки "Далее"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button")).click();
        //ввод даты
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input")).setValue("20.02.2022").pressEnter();
        //клик на поле "срок аренды"
        $(byXpath("/html/body/div/div/div[2]/div[2]/div[2]/div")).click();
        //выбор варианта "сутки" из выпадающего меню
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]")).click();
        //выбор цвета самоката "черный жемчуг"
        $(byXpath("//*[@id=\"black\"]")).click();
        //заполнение поля комментария для курьера
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input")).setValue("не звонить. сам найду");
        //нажатие на кнопку "заказать"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]")).click();
        //выбрать вариант "да" в модальном окне подтверждения заказа
        $(byXpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]")).click();

    }
    //Оформление заказа через кнопку "Заказать" на главной странице.
    //Позитивный сценарий 2
    @Test
    public void createOrder2() {
        mainPage.waitOrder();
        mainPage.clickOrder();
        //заполнение поля с именем
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input")).setValue("Имя");
        //заполнение поля с фамилией
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input")).setValue("Фамилия");
        //заполнение поля с адресом
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input")).setValue("Достаточно длинный");
        //ввод и выбор станции "Лубянка" в поле "станция метро"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div")).click();
        $(byClassName("select-search__input")).setValue("Лубянка");
        $(byCssSelector(".select-search__select")).click();
        //заполнение поля с номером телефона
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input")).setValue("89099099999");
        //нажатие кнопки "Далее"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button")).click();
        //ввод даты
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input")).setValue("05.05.2022").pressEnter();
        //клик на поле "срок аренды"
        $(byXpath("/html/body/div/div/div[2]/div[2]/div[2]/div")).click();
        //выбор варианта "двое суток" из выпадающего меню
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[3]")).click();
        //выбор цвета самоката "серая безысходность"
        $(byXpath("//*[@id=\"grey\"]")).click();
        //заполнение поля комментария для курьера
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input")).setValue("Напишем кое-что");
        //нажатие на кнопку "заказать"
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]")).click();
        //выбрать вариант "да" в модальном окне подтверждения заказа
        $(byXpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]")).click();

    }
}



