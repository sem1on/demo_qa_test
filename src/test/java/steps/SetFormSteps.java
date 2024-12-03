package steps;

import components.CalendarComponent;
import components.SelectStateAndCityComponent;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SetFormSteps {

    CalendarComponent calendarComponent = new CalendarComponent();
    SelectStateAndCityComponent selectStateAndCityComponent = new SelectStateAndCityComponent();

    @Step("Ввести имя")
    public void setFirstName (String firstName) {
        $("#firstName").setValue(firstName);
    }

    @Step("Ввести фамилию")
    public void setLastName (String lastName) {
        $("#lastName").setValue(lastName);
    }

    @Step("Ввести електронную почту")
    public void setEmail (String email) {
        $("#userEmail").setValue(email);
    }

    @Step("Ввести номер телефона")
    public void setPhone (String phoneNumber) {
        $("#userNumber").setValue(phoneNumber);
    }

    @Step("Ввести адрес")
    public void setAddress(String address) {
        $("#currentAddress").setValue(address);
    }

    @Step("Ввести дату рождения")
    public void setBDay(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
    }

    @Step("Выбрать пол (Other)")
    public void setGender() {
        $("#gender-radio-2").parent().click();
    }

    @Step("Ввод предмета")
    public void setSubject (String subject) {
        $("#subjectsInput").setValue(subject).pressEnter();
    }

    @Step("Выбор хоббы")
    public void setHobbies (String hobbies) {
        $("#hobbiesWrapper").$(byText(hobbies)).click();
    }

    @Step("Добавление фото")
    public void loadPhoto (String photoName) {
        $("#uploadPicture").uploadFromClasspath(photoName);
    }

    @Step("Выбор штата и города")
    public void setStateCity (String state, String city) {
        selectStateAndCityComponent.setStateCity(state, city);
    }

}
