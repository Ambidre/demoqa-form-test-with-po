package gmail.anastasiacoder.PageObjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    private final static String RESULT_TITLE = "Thanks for submitting the form";

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            mobileInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            pictureSelect = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateSelect = $(byText("Select State")),
            stateName = $(byText("NCR")),
            citySelect = $(byText("Select City")),
            cityName = $(byText("Noida")),
            submitButton = $("#submit"),
            submitTitle = $("#example-modal-sizes-title-lg"),
            resultsTable = $(".table-responsive");

    public CalendarComponent calendar = new CalendarComponent();

    public void openPage( ){
        open("https://demoqa.com/automation-practice-form");
    }

    public RegistrationPage setFirstName(String value){
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value){
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value){
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage chooseGender(String value) {
        $(byText(value)).click();
        return this;
    }

    public RegistrationPage setMobile(String value){
        mobileInput.setValue(value);
        return this;
    }

    public RegistrationPage setSubject(String value){
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobby(String value){
        $(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String value){
        pictureSelect.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setAddress(String value){
        addressInput.setValue(value);
        return this;
    }

    public RegistrationPage chooseState(){
        stateSelect.click();
        stateName.click();
        return this;
    }

    public RegistrationPage chooseCity(){
        citySelect.click();
        cityName.click();
        return this;
    }

    public RegistrationPage clickSubmitButton(){
        submitButton.click();
        return this;
    }

    public RegistrationPage checkTitle(){
        submitTitle.shouldHave(text(RESULT_TITLE));
        return this;
    }

    public RegistrationPage checkInformation(String key, String value) {
        resultsTable.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }
}