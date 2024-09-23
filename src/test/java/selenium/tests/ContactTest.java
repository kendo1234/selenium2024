package selenium.tests;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.screenshot;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import selenium.pages.ContactPage;

import java.io.File;
import java.io.IOException;

public class ContactTest {

    ContactPage contact = new ContactPage();

    @Test
    public void contactForm() {
        contact.open();
        contact.fillContactForm();
    }

    @AfterEach
    public void tearDown() {
    }
}
