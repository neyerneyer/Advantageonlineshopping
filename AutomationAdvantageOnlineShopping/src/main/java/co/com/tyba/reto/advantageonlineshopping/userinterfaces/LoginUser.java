package co.com.tyba.reto.advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUser extends PageObject {
    public static final Target POP_UP = Target.the("login password")
            .located(By.xpath("//div[@class='PopUp']//div[@class='login ng-scope']"));
    public static final Target LOGIN_USERNAME = Target.the("login user name")
            .located(By.name("username"));
    public static final Target LOGIN_PASSWORD = Target.the("login password")
            .located(By.name("password"));
    public static final Target REMEMBER_ME = Target.the("remenber me")
            .located(By.name("remember_me"));
    public static final Target SIGN_IN = Target.the("button sign in")
            .located(By.id("sign_in_btnundefined"));
    private LoginUser() {
    }
}