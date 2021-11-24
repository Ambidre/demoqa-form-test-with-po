package gmail.anastasiacoder.test;

import gmail.anastasiacoder.test.base.TestBase;
import org.junit.jupiter.api.Test;
import pageObjects.RegistrationPage;

import static utils.TestData.*;

public class FormPageObjectsTest extends TestBase {
    private RegistrationPage registrationPage;
    @Test
    public void fillOutFormWithRealDataTest() {
        registrationPage = new RegistrationPage();
        registrationPage.openPage();
        registrationPage.calendar.setDate("11","May","1999");
        registrationPage.setFirstName(FIRST_NAME)
                        .setLastName(LAST_NAME)
                        .setEmail(USER_EMAIL)
                        .chooseGender(GENDER)
                        .setMobile(USER_NUMBER)
                        .setSubject(SUBJECT)
                        .setHobby(HOBBY_MUSIC)
                        .uploadPicture(PICTURE)
                        .setAddress(ADDRESS)
                        .chooseState(STATE)
                        .chooseCity(CITY)
                        .clickSubmitButton()
                        .checkPopapTitle();

        registrationPage.checkInformation("Student Name", FIRST_NAME + " " + LAST_NAME)
                .checkInformation("Student Email", USER_EMAIL)
                .checkInformation("Gender", GENDER)
                .checkInformation("Mobile", USER_NUMBER)
                .checkInformation("Date of Birth", DATE_OF_BIRTH)
                .checkInformation("Subjects", SUBJECT)
                .checkInformation("Hobbies", HOBBY_MUSIC)
                .checkInformation("Picture", PICTURE)
                .checkInformation("Address", ADDRESS)
                .checkInformation("State and City", STATE + " " + CITY);
    }
}