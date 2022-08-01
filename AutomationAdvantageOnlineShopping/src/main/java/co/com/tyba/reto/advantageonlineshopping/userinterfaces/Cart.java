package co.com.tyba.reto.advantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cart {
    public static final Target LOADER = Target.the("loader")
            .located(By.xpath("//div[@class='loader']"));
    public static final Target SHOPPING_CART = Target.the("Shopping Cart")
            .located(By.id("shoppingCartLink"));
    public static final Target CHECKOUT = Target.the("pagar")
            .located(By.name("check_out_btn"));
    public static final Target NEXT_PAYMENT = Target.the("boton next para pagar")
            .located(By.id("next_btn"));
    public static final Target SAFE_USER_PAYMENT = Target.the("Pago seguro usuario para pagar")
            .located(By.name("safepay_username"));
    public static final Target SAFE_PASS_PAYMENT = Target.the("Pago seguro clave para pagar")
            .located(By.name("safepay_password"));
    public static final Target PAY_NOW = Target.the("boton pagar")
            .located(By.id("pay_now_btn_SAFEPAY"));
    public static final Target QUESTIONS_PAY = Target.the("Pago exitoso")
            .located(By.xpath("//h3[contains(text(),'ORDER PAYMENT')]"));
    private Cart() {}
}