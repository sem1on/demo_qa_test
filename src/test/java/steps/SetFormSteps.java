package steps;

import components.CalendarComponent;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SetFormSteps {

    CalendarComponent calendarComponent = new CalendarComponent();

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

}
