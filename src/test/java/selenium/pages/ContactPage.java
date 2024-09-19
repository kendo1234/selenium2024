package selenium.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ContactPage {

    public SelenideElement nameField() {
        return $("#name").should(appear);
    }
    public SelenideElement commentField() {
        return $("#comments").should(appear);
    }
    public SelenideElement stateOption() {
        return $("#state");
    }
    public SelenideElement backpackOption() {
        return $("#backpack");
    }
    public SelenideElement newsletterRadio() {
        return  $(By.name("newsletter"));
    }

    public ContactPage open() {
        Selenide.open("http://explorecalifornia.org/contact.htm");
        return this;
    }

    public void fillContactForm() {
        nameField().setValue("Josuke Higashikata");
        stateOption().selectOptionContainingText("Alabama");
        backpackOption().click();
        newsletterRadio().selectRadio("yes");

        nameField().shouldHave(value("Josuke Higashikata"));

        backpackOption().shouldBe(selected);
        newsletterRadio().shouldHave(value("yes"));
    };

}
