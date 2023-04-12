package carnow.automation.web.tasks.customer.messagenow;

import carnow.automation.web.pageobjects.customer.messagenow.HomePage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenChatWindow {

    public static Task via(String button) {
        return Task.where(
                "{0} open Chat Window by Clicking on " + button,
                Click.on(HomePage.CHAT_ICON_BUTTON)
        );
    }

}
