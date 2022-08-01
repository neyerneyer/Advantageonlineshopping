package co.com.tyba.reto.advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUser extends PageObject {

    public static final Target MENU_USER = Target.the("menu user")
            .located(By.xpath("//a[@id='menuUserLink']"));
    public static final Target CREATE_NEW_ACCOUNT = Target.the("CREATE NEW ACCOUNT")
            .located(By.cssSelector("a.create-new-account.ng-scope"));
    public static final Target USER_NAME = Target.the("user name")
            .located(By.name("usernameRegisterPage"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.name("emailRegisterPage"));
    public static final Target PASSWORD = Target.the("PASSWORD")
            .located(By.name("passwordRegisterPage"));
    public static final Target CONFIRM_PASSWORD = Target.the("CONFIRM PASSWORD")
            .located(By.name("confirm_passwordRegisterPage"));
    public static final Target CHECK_PRIVACY = Target.the("CHECK PRIVACITY")
            .located(By.cssSelector("div:nth-child(1) sec-view.ng-isolate-scope.sec-view:nth-child(5) > div.inputContainer.ng-scope:nth-child(1)"));
    public static final Target BUTTON_REGISTER = Target.the("BUTTON REGISTER")
            .located(By.id("register_btnundefined"));
    public static final Target QUESTION_REGISTER = Target.the("validate question register")
            .located(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
    private RegisterUser() {
    }
}
