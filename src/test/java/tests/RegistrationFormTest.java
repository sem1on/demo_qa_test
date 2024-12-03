package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import steps.OpenPageStep;
import steps.SetFormSteps;
import steps.VerificationFormSteps;

public class RegistrationFormTest extends TestBase {

    private static final String URL = "";
    private static final String FIRSTNAME = "";
    private static final String LASTNAME = "";
    private static final String EMAIL = "";
    private static final String PHONE_NUMBER = "";
    private static final String ADDRESS = "";
    private static final String DAY = "";
    private static final String MONTH = "";
    private static final String YEAR = "";
    private static final String SUBJECT = "";
    private static final String HOBBIES = "";
    private static final String PHOTO_NAME = "";
    private static final String STATE = "";
    private static final String CITY = "";
    private static final String BUTTON_ID = "";
    private static final String MODAL_TEXT = "Thanks for submitting the form";
    private static final String KEY_1 = "";
    private static final String VALUE_1 = "";
    private static final String KEY_2 = "";
    private static final String VALUE_2 = "";
    private static final String KEY_3 = "";
    private static final String VALUE_3 = "";
    private static final String KEY_4 = "";
    private static final String VALUE_4 = "";

    @Test
    void formTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        OpenPageStep openPageStep = new OpenPageStep();
        SetFormSteps setFormSteps = new SetFormSteps();
        VerificationFormSteps verificationFormSteps = new VerificationFormSteps();

        openPageStep.openMainPage(URL);

        setFormSteps.setFirstName(FIRSTNAME);
        setFormSteps.setLastName(LASTNAME);
        setFormSteps.setEmail(EMAIL);
        setFormSteps.setPhone(PHONE_NUMBER);
        setFormSteps.setAddress(ADDRESS);
        setFormSteps.setBDay(DAY, MONTH, YEAR);
        setFormSteps.setGender();
        setFormSteps.setSubject(SUBJECT);
        setFormSteps.setHobbies(HOBBIES);
        setFormSteps.loadPhoto(PHOTO_NAME);
        setFormSteps.setStateCity(STATE, CITY);
        setFormSteps.buttonClick(BUTTON_ID);

        verificationFormSteps.verifyModalAppears(MODAL_TEXT);
        verificationFormSteps.verifyResult(KEY_1, VALUE_1);
        verificationFormSteps.verifyResult(KEY_2, VALUE_2);
        verificationFormSteps.verifyResult(KEY_3, VALUE_3);
        verificationFormSteps.verifyResult(KEY_4, VALUE_4);
    }
 }
