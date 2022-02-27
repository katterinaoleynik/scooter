package io.github.katterinaoleynik.scooter;
import org.junit.Before;
import org.junit.Test;


public class OrderTest {

    private final OrderPOM orderPOM = new OrderPOM();
    private final MainPagePOM mainPage = new MainPagePOM();

    @Before
    public void setup() {
        orderPOM.linkOrderPage();
        mainPage.clickAcceptButton();
    }

    //Оформление заказа. Позитивный сценарий с заполнением всех полей 1
    @Test
    public void createOrder1() {
        //заполнение поля с именем
        orderPOM.setName("Имя");
        //заполнение поля с фамилией
        orderPOM.setSurname("Фамилия");
        //заполнение поля с адресом
        orderPOM.setAddress("Белы Куна 22 квартира 1");
        //ввод станции "Беговая" в поле "станция метро"
        orderPOM.setSubwayStation("Беговая");
        //выбор введенной станции метро из списка
        orderPOM.clickSubwayStationSelection();
        //заполнение поля с номером телефона
        orderPOM.setPhoneNumber("79991999999");
        //нажатие кнопки "Далее"
        orderPOM.clickButtonNext();
        //ввод даты
        orderPOM.setDate("12.12.2022");
        //клик на поле "срок аренды"
        orderPOM.clickRentalPeriodField();
        //выбор варианта "четверо суток" из выпадающего меню
        orderPOM.clickFourDays();
        //выбор цвета самоката "черный жемчуг"
        orderPOM.clickScooterBlackColor();
        //заполнение поля комментария для курьера
        orderPOM.setCommentField("Позвонить по приезде");
        //нажатие на кнопку "заказать"
        orderPOM.clickOrder();
        //выбрать вариант "да" в модальном окне подтверждения заказа
        orderPOM.clickConfirmation();
        //убедиться в появлении окна "Заказ оформлен"
        orderPOM.confirmation();
        //нажать кнопку "Посмотреть заказ"
        orderPOM.clickSeeStatus();
    }

    //Оформление заказа. Позитивный сценарий с заполнением всех полей 2
    @Test
    public void createOrder2() {
        //заполнение поля с именем
        orderPOM.setName("Тест");
        //заполнение поля с фамилией
        orderPOM.setSurname("Тестовый");
        //заполнение поля с адресом
        orderPOM.setAddress("Нормальный адрес 90-210");
        //ввод и выбор станции "Лубянка" в поле "станция метро"
        orderPOM.setSubwayStation("Лубянка");
        //выбор введенной станции метро из списка
        orderPOM.clickSubwayStationSelection();
        //заполнение поля с номером телефона
        orderPOM.setPhoneNumber("88123456765");
        //нажатие кнопки "Далее"
        orderPOM.clickButtonNext();
        //ввод даты
        orderPOM.setDate("20.07.2022");
        //клик на поле "срок аренды"
        orderPOM.clickRentalPeriodField();
        //выбор варианта "семеро суток" из выпадающего меню
        orderPOM.clickSevenDays();
        //выбор цвета самоката "серая безысходность"
        orderPOM.clickScooterGreyColor();
        //заполнение поля комментария для курьера
        orderPOM.setCommentField("Не звонить");
        //нажатие на кнопку "заказать"
        orderPOM.clickOrder();
        //выбрать вариант "да" в модальном окне подтверждения заказа
        orderPOM.clickConfirmation();
        //убедиться в появлении окна "Заказ оформлен"
        orderPOM.confirmation();
        //нажать кнопку "Посмотреть заказ"
        orderPOM.clickSeeStatus();
    }

}