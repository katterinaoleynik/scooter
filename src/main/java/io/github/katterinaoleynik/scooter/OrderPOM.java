package io.github.katterinaoleynik.scooter;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderPOM {

    //Переходим по ссылке в гугл хроме
    public void linkOrderPage() {
        open("https://qa-scooter.praktikum-services.ru/order");
    }

    //метод заполнения поля с именем
    public void setName(String name) {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input")).setValue(name);
    }

    //метод заполнения поля с фамилией
    public void setSurname(String surname) {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input")).setValue(surname);
    }

    //метод заполнения поля с адресом
    public void setAddress(String address) {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input")).setValue(address);
    }

    //метод заполнения поля станции метро
    public void setSubwayStation(String subwayStation) {
        $(byClassName("select-search__input")).setValue(subwayStation);
    }

    //метод выбора введенной станции метро из списка
    public void clickSubwayStationSelection() {
        $(byCssSelector(".select-search__select")).click();
    }

    //метод для ввода номера телефона
    public void setPhoneNumber(String phoneNumber) {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input")).setValue(phoneNumber);
    }

    //метод нажатия кнопки "Далее"
    public void clickButtonNext() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button")).click();
    }

    //метод для действия "назад"
    public void clickButtonBack() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[1]")).click();
    }

    //метод для ввода даты
    public void setDate(String date) {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div/input")).setValue(date).pressEnter();
    }

    //метод для клика на поле "Срок аренды"
    public void clickRentalPeriodField() {
        $(byXpath("/html/body/div/div/div[2]/div[2]/div[2]/div")).click();
    }

    //метод для выбора варианта "сутки" в поле "Срок аренды"
    public void clickOneDay() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]")).click();
    }

    //метод для выбора варианта "двое суток" в поле "Срок аренды"
    public void clickTwoDays() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
    }

    //метод для выбора варианта "трое суток" в поле "Срок аренды"
    public void clickThreeDays() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[3]")).click();
    }

    //метод для выбора варианта "четверо суток" в поле "Срок аренды"
    public void clickFourDays() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[4]")).click();
    }

    //метод для выбора варианта "пятеро суток" в поле "Срок аренды"
    public void clickFiveDays() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[5]")).click();
    }

    //метод для выбора варианта "шестеро суток" в поле "Срок аренды"
    public void clickSixDays() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[6]")).click();
    }

    //метод для выбора варианта "семеро суток" в поле "Срок аренды"
    public void clickSevenDays() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[7]")).click();
    }

    //метод для выбора цвета самоката "Черный жемчуг"
    public void clickScooterBlackColor() {
        $(byXpath("//*[@id=\"black\"]")).click();
    }

    //метод для выбора цвета самоката "Серая безысходность"
    public void clickScooterGreyColor() {
        $(byXpath("//*[@id=\"grey\"]")).click();
    }

    //метод для заполнения поля комментария
    public void setCommentField(String comment) {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input")).setValue(comment);
    }

    //метод для действия "заказать"
    public void clickOrder() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]")).click();
    }

    //метод для действия подтверждения заказа в модальном окне
    public void clickConfirmation() {
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]")).shouldHave(exactText("Да")).click();
    }

    //метод для действия отмены подтверждения заказа в модальном окне
    public void clickOrderCancellation() {
        $(byXpath("/html/body/div/div/div[2]/div[5]/div[2]/button[1]")).click();
    }



    //Видимость окна оформленного заказа
    public void confirmation() {
        $(byClassName("Order_ModalHeader__3FDaJ")).shouldHave(exactText("Заказ оформлен"));
    }

    //метод для действия "Посмотреть статус" в модальном окне оформленного  заказа
    public void clickSeeStatus() {
        $(byXpath("/html/body/div/div/div[2]/div[5]/div[2]/button")).click();
    }



}
