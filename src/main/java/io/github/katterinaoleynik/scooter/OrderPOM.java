package io.github.katterinaoleynik.scooter;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class OrderPOM {

    //Переходим по ссылке в гугл хроме
    public void linkOrderPage() {
        open("https://qa-scooter.praktikum-services.ru/order");
    }

    //метод заполнения поля с именем
    public void setName(String name) {
        $(byXpath(".//input[@placeholder='* Имя']")).setValue(name);
    }

    //метод заполнения поля с фамилией
    public void setSurname(String surname) {
        $(byXpath(".//input[@placeholder='* Фамилия']")).setValue(surname);
    }

    //метод заполнения поля с адресом
    public void setAddress(String address) {
        $(byXpath(".//input[@placeholder='* Адрес: куда привезти заказ']")).setValue(address);
    }

    //метод заполнения поля станции метро
    public void setSubwayStation(String subwayStation) {
        $(byClassName("select-search__input")).setValue(subwayStation);
    }

    //метод выбора введенной станции метро из списка
    public void clickSubwayStationSelection() {
        $(byClassName("select-search__row")).click();
    }

    //метод для ввода номера телефона
    public void setPhoneNumber(String phoneNumber) {
        $(byXpath(".//input[@placeholder='* Телефон: на него позвонит курьер']")).setValue(phoneNumber);
    }

    //метод нажатия кнопки "Далее"
    public void clickButtonNext() {
        $$(byClassName("Button_Middle__1CSJM")).findBy(exactText("Далее")).click();
    }

    //метод для действия "назад"
    public void clickButtonBack() {
        $$(byClassName("Button_Inverted__3IF-i")).findBy(exactText("Назад")).click();
    }

    //метод для ввода даты
    public void setDate(String date) {
        $(byXpath(".//input[@placeholder='* Когда привезти самокат']")).setValue(date).pressEnter();
    }

    //метод для клика на поле "Срок аренды"
    public void clickRentalPeriodField() {
        $(byClassName("Dropdown-placeholder")).click();
    }

    //метод для выбора варианта "сутки" в поле "Срок аренды"
    public void clickOneDay() {
        $$(byClassName("Dropdown-option")).findBy(exactText("сутки")).click();
    }

    //метод для выбора варианта "двое суток" в поле "Срок аренды"
    public void clickTwoDays() {
        $$(byClassName("Dropdown-option")).findBy(exactText("двое суток")).click();
    }

    //метод для выбора варианта "трое суток" в поле "Срок аренды"
    public void clickThreeDays() {
        $$(byClassName("Dropdown-option")).findBy(exactText("трое суток")).click();
    }

    //метод для выбора варианта "четверо суток" в поле "Срок аренды"
    public void clickFourDays() {
        $$(byClassName("Dropdown-option")).findBy(exactText("четверо суток")).click();
    }

    //метод для выбора варианта "пятеро суток" в поле "Срок аренды"
    public void clickFiveDays() {
        $$(byClassName("Dropdown-option")).findBy(exactText("пятеро суток")).click();
    }

    //метод для выбора варианта "шестеро суток" в поле "Срок аренды"
    public void clickSixDays() {
        $$(byClassName("Dropdown-option")).findBy(exactText("шестеро суток")).click();
    }

    //метод для выбора варианта "семеро суток" в поле "Срок аренды"
    public void clickSevenDays() {
        $$(byClassName("Dropdown-option")).findBy(exactText("семеро суток")).click();
    }

    //метод для выбора цвета самоката "Черный жемчуг"
    public void clickScooterBlackColor() {
        $$(byClassName("Checkbox_Label__3wxSf")).findBy(exactText("чёрный жемчуг")).click();
    }

    //метод для выбора цвета самоката "Серая безысходность"
    public void clickScooterGreyColor() {
        $$(byClassName("Checkbox_Label__3wxSf")).findBy(exactText("серая безысходность")).click();
    }

    //метод для заполнения поля комментария
    public void setCommentField(String comment) {
        $(byXpath(".//input[@placeholder='Комментарий для курьера']")).setValue(comment);
    }

    //метод для действия "заказать"
    public void clickOrder() {
        $$(byClassName("Button_Middle__1CSJM")).findBy(exactText("Заказать")).click();
    }

    //метод для действия подтверждения заказа в модальном окне
    public void clickConfirmation() {
        $$(byClassName("Button_Middle__1CSJM")).findBy(exactText("Да")).click();
    }

    //метод для действия отмены подтверждения заказа в модальном окне
    public void clickOrderCancellation() {
        $$(byClassName("Button_Inverted__3IF-i")).findBy(exactText("Нет")).click();
    }

    //Видимость окна оформленного заказа
    public void checkConfirmation() {
        $(byClassName("Order_ModalHeader__3FDaJ")).shouldHave(exactText("Заказ оформлен"));
    }

    //метод для действия "Посмотреть статус" в модальном окне оформленного  заказа
    public void clickSeeStatus() {
        $$(byClassName("Button_Middle__1CSJM")).findBy(exactText("Посмотреть статус")).click();
    }

}
