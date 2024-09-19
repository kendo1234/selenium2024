package selenium.tests;

import static com.codeborne.selenide.Condition.*;

import org.junit.jupiter.api.Test;
import selenium.pages.ContactPage;

public class ContactTest {

    ContactPage contact = new ContactPage();

    @Test
    public void contactForm() {
        contact.open();
        contact.nameField().setValue("Josuke Higashikata");
        contact.stateOption().selectOptionContainingText("Alabama");
        contact.backpackOption().click();
        contact.newsletterRadio().selectRadio("yes");

        contact.nameField().shouldHave(value("Josuke Higashikata"));

        contact.backpackOption().shouldBe(selected);
        contact.newsletterRadio().shouldHave(value("yes"));

    }
}
