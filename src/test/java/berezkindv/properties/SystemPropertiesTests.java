package berezkindv.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SystemPropertiesTests {

//        System.getProperty("key");
//        System.setProperty("key", "value");

    @Test
    void someTest1() {
        String someValue = System.getProperty("someKey");
        System.out.println(someValue); // null
    }

    @Test
    void someTest2() {
        System.setProperty("someKey", "Red value");
        String someValue = System.getProperty("someKey");
        System.out.println(someValue); // red value
    }

    @Test
    void someTest3() {
        String someValue = System.getProperty("someKey", "blue value");
        System.out.println(someValue);
    }

//    @Test
//    void someTest4() {
//        Boolean someValue = Boolean.parseBoolean(
//                System.getProperty("someKey", "true"));
//        assertTrue(someValue);
//        System.out.println(someValue);
//    }


    @Test
    @Tag("properties")
    void someTest5() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
        //  запускаем в терминале с - gradle clean properties_tests
        //  получаем - null

        //  запускаем в терминале с - gradle clean properties_tests -Dbrowser=chrome
        //  получаем - chrome
    }

    @Test
    @Tag("properties")
    void someTest6() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");
        String browserSize = System.getProperty("browserSize", "300x300");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);
    }

    @Test
    @Tag("edge")
    void edgeTest() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }

//        @BeforeAll
//    static void setUp() {
//        Configuration.browser = System.getProperty("browser", "chrome");
//        Configuration.browserVersion = System.getProperty("version", "91");
//        Configuration.browserSize = System.getProperty("browserSize", "300x300");
//    }

    @Test
    @Tag("properties")
    void someTest7() {
        System.out.println("I want to say: " + System.getProperty("someText"));
    }

}
