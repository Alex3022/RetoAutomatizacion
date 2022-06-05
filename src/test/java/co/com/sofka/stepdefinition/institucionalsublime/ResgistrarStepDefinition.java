package co.com.sofka.stepdefinition.institucionalsublime;

import co.com.sofka.model.RegistrerModel;
import co.com.sofka.page.page.ContactarPageCases;
import co.com.sofka.page.page.RegistrarPageCases;
import co.com.sofka.setup.SetupWebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class ResgistrarStepDefinition extends SetupWebUI {

    private RegistrarPageCases registrarPageCases;

    private static final Logger LOGGER = Logger.getLogger(ResgistrarStepDefinition.class);
    @Dado("el usuario navego hasta la pagina y entro al inicio")
    public void elUsuarioNavegoHastaLaPaginaYEntroAlInicio() {

        try {
            setUpLog4j2();
            setUpWebDriver();

        }catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(),e);
            LOGGER.error(e.getMessage(),e);
        }

    }
    @Cuando("el usuario da click a la opcion ingresar y da clik a opcion registro procedio a llenar los datos requerimientos")
    public void elUsuarioDaClickALaOpcionIngresarYDaClikAOpcionRegistroProcedioALlenarLosDatosRequerimientos() {


        try {
            registrarPageCases = new RegistrarPageCases(driver,modelRegistro());
            registrarPageCases.Registroporlapagina();

        }catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(),e);
            LOGGER.error(e.getMessage(),e);
        }
    }
    @Entonces("se muestra un mensaje indicando que ya el usurio quedo correctamente registrado")
    public void seMuestraUnMensajeIndicandoQueYaElUsurioQuedoCorrectamenteRegistrado() {
        quiteDriver();

    }


    @Cuando("el usuario da click a la opcion ingresar y da clik a opcion registro procedio a llenar los datos y puso claves incorrectas")
    public void elUsuarioDaClickALaOpcionIngresarYDaClikAOpcionRegistroProcedioALlenarLosDatosYPusoClavesIncorrectas() {
        try {
            registrarPageCases = new RegistrarPageCases(driver,modelRegistro());
            registrarPageCases.Registroporlapagina();

        }catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(),e);
            LOGGER.error(e.getMessage(),e);
        }
    }
    @Entonces("se muestra un mensaje indicando y que la clave no coincide")
    public void seMuestraUnMensajeIndicandoYQueLaClaveNoCoincide() {
        quiteDriver();

    }
     private RegistrerModel modelRegistro(){
        RegistrerModel registrerModel = new RegistrerModel();
        registrerModel.setApellido("sanchez");
        registrerModel.setEmail("dahiana30@yopmail.com");
        registrerModel.setPais("colombia");
        registrerModel.setNombre("dahii");
        registrerModel.setClave("zeusteamo");
        registrerModel.setConfirmarClave("zeusteamo");
        registrerModel.setSitioWeb("el que sea ");
        return registrerModel;
     }
}
