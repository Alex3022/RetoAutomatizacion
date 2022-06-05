package co.com.sofka.page.page;

import co.com.sofka.model.IngresaModel;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;




public class IngresarPageCases extends IngresarPage{

    private static final Logger LOGGER = Logger.getLogger(IngresarPageCases.class);
    private IngresaModel ingresaModel;

    public IngresaModel getIngresaModel() {
        return ingresaModel;
    }

    public void setIngresaModel(IngresaModel ingresaModel) {
        this.ingresaModel = ingresaModel;
    }

    public IngresarPageCases(WebDriver driver, IngresaModel ingresaModel) {
        super(driver);
        this.ingresaModel = ingresaModel;
    }
    public void  ingresoUsuarioErrado( ){
        scrollOn(banner);
        clickOn(banner);

        scrollOn(botonIngresar);
        clickOn(botonIngresar);

        scrollOn(campoEmailIngresar);
        clearOn(campoEmailIngresar);
        typeOn(campoEmailIngresar,ingresaModel.getEmail());

        scrollOn(campoClaveIngresar);
        clearOn(campoClaveIngresar);
        typeOn(campoClaveIngresar,ingresaModel.getClave());

        scrollOn(botonSubmit);
        clickOn(botonSubmit);



    }
    public void olvideMiclave (){

        scrollOn(banner);
        clickOn(banner);

        scrollOn(botonIngresar);
        clickOn(botonIngresar);

        scrollOn(botonOlvideMiClave);
        scrollOn(botonOlvideMiClave);

        scrollOn(campoOlvideMiclave);
        clearOn(campoOlvideMiclave);
        typeOn(campoOlvideMiclave,ingresaModel.getEmail());

        scrollOn(botonEnviarEmail);
        clickOn(botonEnviarEmail);

    }
    public String  mensajeDeError() {
        String ingresar = getText(mensajeIngresoErroneo).trim();
        return ingresar;
    }
}
