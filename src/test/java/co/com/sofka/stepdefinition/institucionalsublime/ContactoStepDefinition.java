package co.com.sofka.stepdefinition.institucionalsublime;

import co.com.sofka.setup.SetupWebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class ContactoStepDefinition extends SetupWebUI {

    private static final Logger LOGGER = Logger.getLogger(ContactoStepDefinition.class);
    @Dado("el usario navego hasta la pagina y entro al incio")
    public void elUsarioNavegoHastaLaPaginaYEntroAlIncio() {

        try {
            setUpLog4j2();
            setUpWebDriver();

        }catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(),e);
            LOGGER.error(e.getMessage(),e);
        }

    }
    @Cuando("el usario esta en inicio da click en la opcion contacto y el usario entra a contacto llena los campos y le da enviar")
    public void elUsarioEstaEnInicioDaClickEnLaOpcionContactoYElUsarioEntraAContactoLlenaLosCamposYLeDaEnviar() {

    }
    @Entonces("se le muestra un mensaje inidcando que proximamente se comunicaran")
    public void seLeMuestraUnMensajeInidcandoQueProximamenteSeComunicaran() {
        quiteDriver();

    }


    @Cuando(": el usario esta en inicio da click en la opcion contacto y el usario entra a contato llena los campos y coloca el correo errado")
    public void elUsarioEstaEnInicioDaClickEnLaOpcionContactoYElUsarioEntraAContatoLlenaLosCamposYColocaElCorreoErrado() {

    }
    @Entonces("se muestra un mensaje inicando que el correo esta incorrecto")
    public void seMuestraUnMensajeInicandoQueElCorreoEstaIncorrecto() {
        quiteDriver();

    }
}
