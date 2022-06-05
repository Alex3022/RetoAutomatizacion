package co.com.sofka.stepdefinition.institucionalsublime;

import co.com.sofka.model.IngresaModel;
import co.com.sofka.page.page.IngresarPageCases;
import co.com.sofka.setup.SetupWebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;


public class IngresarStepDefinition extends SetupWebUI {


    private static final Logger  LOGGER = Logger.getLogger(IngresarStepDefinition.class);
    private IngresarPageCases ingresarPageCases;
    @Dado("el usuario busco y navego hasta la pagina y dio clik en incio")
    public void elUsuarioBuscoYNavegoHastaLaPaginaYDioClikEnIncio() {
        try {
            setUpLog4j2();
            setUpWebDriver();

        }catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(),e);
            LOGGER.error(e.getMessage(),e);
        }
    }
    @Cuando("el usuario dio click en ingresar sumistra  un correo y contraseña que no estan registrados")
    public void elUsuarioDioClickEnIngresarSumistraUnCorreoYContraseñaQueNoEstanRegistrados() {

        try {
            ingresarPageCases = new IngresarPageCases(driver,modeloIngreso());
            ingresarPageCases.ingresoUsuarioErrado();

        }catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(),e);
            LOGGER.error(e.getMessage(),e);
        }

    }
    @Entonces("se muestra un mensaje indicado que el correo y la contraseña no existe")
    public void seMuestraUnMensajeIndicadoQueElCorreoYLaContraseñaNoExiste() {
        quiteDriver();

    }

    @Cuando("el usuario dio click en ingresar y da click en olvide mi clave ingresa al correo da enviar")
    public void elUsuarioDioClickEnIngresarYDaClickEnOlvideMiClaveIngresaAlCorreoDaEnviar() {

        try {
            ingresarPageCases = new IngresarPageCases(driver,modeloIngreso());
            ingresarPageCases.olvideMiclave();

        }catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(),e);
            LOGGER.error(e.getMessage(),e);
        }


    }
    @Entonces("se despliega un mensaje que se envia informacion de recuperacion al email")
    public void seDespliegaUnMensajeQueSeEnviaInformacionDeRecuperacionAlEmail() {
        quiteDriver();

    }


    private IngresaModel modeloIngreso(){
        IngresaModel ingresaModel = new IngresaModel();
        ingresaModel.setEmail("dahiana30@yopmail.com");
        ingresaModel.setClave("zeusylanegra22");
        return ingresaModel;
    }
}
