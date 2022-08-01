package co.com.tyba.reto.advantageonlineshopping.stepdefinitions;

import co.com.tyba.reto.advantageonlineshopping.exceptions.ExcepcionEnvioInformacion;
import co.com.tyba.reto.advantageonlineshopping.exceptions.ExcepcionInicioSesion;
import co.com.tyba.reto.advantageonlineshopping.exceptions.ExcepcionPagoProducto;
import co.com.tyba.reto.advantageonlineshopping.exceptions.ExcepcionRegistroUsuario;
import co.com.tyba.reto.advantageonlineshopping.models.ModeloContacto;
import co.com.tyba.reto.advantageonlineshopping.models.ModeloSesion;
import co.com.tyba.reto.advantageonlineshopping.questions.Inicio;
import co.com.tyba.reto.advantageonlineshopping.questions.Pago;
import co.com.tyba.reto.advantageonlineshopping.questions.Usuario;
import co.com.tyba.reto.advantageonlineshopping.questions.Verificar;
import co.com.tyba.reto.advantageonlineshopping.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.tyba.reto.advantageonlineshopping.utils.Excepcion.*;
import static co.com.tyba.reto.advantageonlineshopping.utils.Numeros.CERO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AdvantageOnlineShoppingDefinition {

    @Dado("que {string} necesita ingresar al sitio web advantage shopping")
    @Dado("que {string} necesita entrar en la pagina advantage onlines hopping para realizar un registro del formulario de contacto")
    @Dado("{string} necesita ingresar a la pagina advantage shopping para registrarse")
    @Dado("que {string} necesita entrar en la pagina de compras online de advantage")
    public void necesitaIngresarALaPaginaAdvantageShoppingParaRegistrarse(String usuario) {
        theActorCalled(usuario).wasAbleTo(Iniciar.elNavegador());
    }

    @Y("se registra en el pagina web advantage shopping")
    @Cuando("el ingresa la informacion necesaria para crear el registro")
    public void elIngresaLaInformacionNecesariaParaCrearElRegistro() {
        theActorInTheSpotlight().attemptsTo(Crear.elRegistro());
    }

    @Entonces("el verifica que te has registrado en el sistema")
    public void elVerificaQueTeHasRegistradoEnElSistema() {
        theActorInTheSpotlight().should(seeThat(Usuario.seRegistro(), Matchers.comparesEqualTo(theActorInTheSpotlight().recall("user")))
                .orComplainWith(ExcepcionRegistroUsuario.class, NO_CREO_USUARIO.getMensaje()));
    }

    @Cuando("el introduce los datos necesarios para iniciar la sesion")
    public void elIntroduceLosDatosNecesariosParaIniciarLaSesion(List<ModeloSesion> user) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.con(user.get(CERO.getNumero())));
    }

    @Entonces("El verifica que ha iniciado la sesion con exito")
    public void elVerificaQueHaIniciadoLaSesionConExito() {
        theActorInTheSpotlight().should(seeThat(Inicio.sesion()).orComplainWith(ExcepcionInicioSesion.class, USUARIO_NO_ENCONTRADO.getMensaje()));
    }

    @Cuando("El ingresa la informacion necesaria desde el formulario de contacto")
    public void elIngresaLaInformacionNecesariaDesdeElFormularioDeContacto(List<ModeloContacto> contacto) {
        theActorInTheSpotlight().attemptsTo(Ingresar.informacionDe(contacto.get(CERO.getNumero())));
    }

    @Entonces("el verifica que ha enviado correctamente la informacion con el mensaje {string}")
    public void elVerificaQueHaEnviadoCorrectamenteLaInformacionConElMensaje(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                Verificar.informacionCon(mensaje)).orComplainWith(ExcepcionEnvioInformacion.class, MENSAJE_NO_FUE_ENVIADO.getMensaje()));
    }

    @Cuando("el agrega al carrito articulos populares")
    public void elAgregaAlCarritoArticulosPopulares() {
        theActorInTheSpotlight().attemptsTo(Agregar.productos(), Realizar.compras());
    }

    @Entonces("el verifica que el pago se finalizo con el mensaje {string}")
    public void elVerificaQueElPagoSeFinalizoConElMensaje(String mensaje) {
        theActorInTheSpotlight().should(seeThat(Pago.elProducto(), Matchers.containsStringIgnoringCase(mensaje)).orComplainWith(ExcepcionPagoProducto.class, MENSAJE_ERRADO.getMensaje()));
    }
}