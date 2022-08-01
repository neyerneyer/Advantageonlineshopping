package co.com.tyba.reto.advantageonlineshopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopularItems {
    public static final Target POPULAR_ITEMS = Target.the("popular items")
            .located(By.xpath("//a[contains(text(),'POPULAR ITEMS')]"));
    public static final Target HP_ROAR_PLUS_WIRELESS_SPEAKER = Target.the("speaker")
            .located(By.id("details_21"));
    public static final Target COLOR_SPEAKER = Target.the("color speaker")
            .located(By.id("bunny"));
    public static final Target ADD_TO_CART = Target.the("Agregar al carrito")
            .located(By.name("save_to_cart"));
    public static final Target CERRAR = Target.the("cerrar x")
            .located(By.cssSelector("div.removeProduct.iconCss.iconX"));
    public static final Target HP_ELITEPAD_1000_G2_TABLET = Target.the("Tablet")
            .located(By.id("details_16"));
    public static final Target COLOR_TABLET = Target.the("Color Tablet")
            .located(By.id("rabbit"));
    public static final Target HOME = Target.the("Inicio")
            .located(By.className("logo"));
    public static final Target HP_ELITEBOOK_FOLIO = Target.the("pc")
            .located(By.id("details_10"));
    private PopularItems() {
    }
}