package gmail.anastasiacoder.test;
import com.github.javafaker.Faker;

public class TestData {

    static Faker FAKER = new Faker();

    public static String FIRST_NAME = FAKER.name().firstName(),
            LAST_NAME = FAKER.name().lastName(),
            ADDRESS = FAKER.address().streetAddress(),
            USER_EMAIL = FAKER.internet().emailAddress();

    public static String GENDER = "Female",
            USER_NUMBER = "9998887766",
            DATE_OF_BIRTH = "11 May,1999",
            SUBJECT = "Computer Science",
            HOBBY_MUSIC = "Music",
            PICTURE = "Test.jpg",
            STATE = "NCR",
            CITY = "Noida";
}