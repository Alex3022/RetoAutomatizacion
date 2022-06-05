package co.com.sofka.page.page;

import co.com.sofka.model.ContactoModel;
import co.com.sofka.model.IngresaModel;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class ContactarPageCases extends ContactarPage {

    private static final Logger LOGGER = Logger.getLogger(ContactarPageCases.class);

    private ContactoModel contactoModel;

    public ContactoModel getContactoModel() {
        return contactoModel;
    }

    public void setContactoModel(ContactoModel contactoModel) {
        this.contactoModel = contactoModel;
    }


    public ContactarPageCases(WebDriver driver, ContactoModel contactoModel) {
        super(driver);
        this.contactoModel = contactoModel;


    }

    public void contactarPorlaPagina() {

        scrollOn(banner);
        clickOn(banner);

        scrollOn(ingresaraOpcionContacto);
        clickOn(ingresaraOpcionContacto);


        //scrollOn(ingresarNombreCompleto);
        clearOn(ingresarNombreCompleto);
        typeOn(ingresarNombreCompleto, contactoModel.getNombreCompleto());


        //scrollOn(ingresaEmail);
        clearOn(ingresaEmail);
        typeOn(ingresaEmail, contactoModel.getEmail());

        //scrollOn(ingresarAsunto);
        clearOn(ingresarAsunto);
        typeOn(ingresarAsunto, contactoModel.getAsunto());

        //scrollOn(ingresarMensajeRequerido);
        clearOn(ingresarMensajeRequerido);
        typeOn(ingresarMensajeRequerido, contactoModel.getMensaje());

        //scrollOn(seleccionarpais);
        //clearOn(seleccionarpais);
        //typeOn(seleccionarpais, contactoModel.getPais());


        //scrollOn(ingresarTelefono);
        clearOn(ingresarTelefono);
        typeOn(ingresarTelefono, contactoModel.getTelefono());

        //scrollOn(IngresarEmpresa);
        clearOn(IngresarEmpresa);
        typeOn(IngresarEmpresa, contactoModel.getEmpresa());

        //scrollOn(botonEnviar);
        clickOn(botonEnviar);


    }

    public String mensajeDeError() {
        String contactar = getText(mensajeDeError).trim();
        return contactar;
    }

    public String mensajeGraciasPorContactarnos() {
        String contactar = getText(mensajeGraciasPorcontactarnos).trim();
        return contactar;
    }
}
