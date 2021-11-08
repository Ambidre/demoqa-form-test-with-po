package gmail.anastasiacoder.test;

import com.codeborne.selenide.Configuration;
import gmail.anastasiacoder.PageObjects.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }
}