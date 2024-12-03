package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class OpenPageStep {

    @Step("Открытие стартовой страницы")
    public void openMainPage(String url) {
        open(url);
    }
}
