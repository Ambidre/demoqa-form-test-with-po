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
            citySelect = $(byText("Select City")),
            submitButton = $("#submit"),
            submitTitle = $("#example-modal-sizes-title-lg"),
            resultsTable = $(".table-responsive");

    public CalendarComponent calendar = new CalendarComponent();

    public void openPage( ){
        open("https://demoqa.com/automation-practice-form");
    }

    public RegistrationPage setFirstName(String firstName){
        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName){
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage setEmail(String email){
        emailInput.setValue(email);
        return this;
    }

    public RegistrationPage chooseGender(String gender) {
        $(byText(gender)).click();
        return this;
    }

    public RegistrationPage setMobile(String mobileNumber){
        mobileInput.setValue(mobileNumber);
        return this;
    }

    public RegistrationPage setSubject(String subject){
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage setHobby(String hobby){
        $(byText(hobby)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String picture){
        pictureSelect.uploadFromClasspath(picture);
        return this;
    }

    public RegistrationPage setAddress(String address){
        addressInput.setValue(address);
        return this;
    }

    public RegistrationPage chooseState(String stateName){
        stateSelect.click();
        $(byText(stateName)).click();
        return this;
    }

    public RegistrationPage chooseCity(String cityName){
        citySelect.click();
        $(byText(cityName)).click();
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