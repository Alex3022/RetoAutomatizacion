package co.com.sofka.page.page;


import co.com.sofka.model.RegistrerModel;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class RegistrarPageCases extends RegistrarPage{

    private static final Logger LOGGER = Logger.getLogger(RegistrarPageCases.class);

    private RegistrerModel registrerModel;

    public RegistrerModel getRegistrerModel() {
        return registrerModel;
    }

    public void setRegistrerModel(RegistrerModel registrerModel) {
        this.registrerModel = registrerModel;
    }
    public RegistrarPageCases(WebDriver driver,RegistrerModel registrerModel) {
        super(driver);
        this.registrerModel = registrerModel;
    }

    public void  Registroporlapagina( ){

        scrollOn(banner);
        clickOn(banner);

        scrollOn(botonIngresar);
        clickOn(botonIngresar);

        scrollOn(botonRegistrar);
        clickOn(botonRegistrar);

        scrollOn(ingreseNombre);
        clearOn( ingreseNombre);
        typeOn( ingreseNombre, registrerModel.getNombre());

        scrollOn(ingresarApellido);
        clearOn( ingresarApellido);
        typeOn( ingresarApellido, registrerModel.getApellido());

        scrollOn(seleccionePais);
        clearOn( seleccionePais);
        typeOn( seleccionePais, registrerModel.getPais());

        scrollOn(ingresarEmailc);
        clearOn( ingresarEmailc);
        typeOn( ingresarEmailc, registrerModel.getEmail());;

        scrollOn(suministeClave);
        clearOn(suministeClave);
        typeOn( suministeClave, registrerModel.getClave());

        scrollOn(confirmarLaclave);
        clearOn( confirmarLaclave);
        typeOn( confirmarLaclave, registrerModel.getConfirmarClave());

        scrollOn(heledioYaceptoPoliticas);
        clickOn(heledioYaceptoPoliticas);

        scrollOn(botonListo);
        clickOn(botonListo);



    }

    public String registroCorrecto(){
        String registro = getText( mensajeElUsuarioEstaActivado).trim();
        return registro;

    }

    public String clavesnocoinciden(){
        String registro = getText( mensajesClavesnocoiciden).trim();
        return  registro;
    }

}
