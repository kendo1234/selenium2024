package selenium.tests;

import static com.codeborne.selenide.Condition.*;

import org.junit.jupiter.api.Test;
import selenium.pages.ContactPage;

public class ContactTest {

    ContactPage contact = new ContactPage();

    @Test
    public void contactForm() {
        contact.open();

        contact.fillContactForm();
    }
}
