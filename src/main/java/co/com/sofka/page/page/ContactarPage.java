package co.com.sofka.page.page;

import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactarPage extends CommonActionsOnPages {

    //Entrada de datos

    @FindBy(xpath = "//*[@id=\"bs_dialog\"]/div[1]/a")
    protected WebElement banner;

    @FindBy (xpath = "//*[@id=\"cssmenu\"]/li[5]/a")
    protected WebElement ingresaraOpcionContacto;

    @FindBy (id = "nombres")
    protected WebElement ingresarNombreCompleto;

    @FindBy ( id = "email")
    protected WebElement ingresaEmail;

    @FindBy (id = "pais")
    protected WebElement seleccionarpais;

    @FindBy (id = "telefono")
    protected WebElement ingresarTelefono;

    @FindBy (id = "empresa")
    protected WebElement IngresarEmpresa;

    @FindBy (id = "asunto")
    protected WebElement ingresarAsunto;

    @FindBy ( id = "mensaje")
    protected WebElement ingresarMensajeRequerido;

    @FindBy ( id = "btn_submit0" )
     protected WebElement botonEnviar;

     @FindBy (id = "dhtml_alert_MSG")
     protected WebElement mensajeDeError;

     @FindBy ( xpath = "//*[@id=\"proyecto_sublimesolutions\"]/body/div[6]/div[3]/div[2]/h1")
     protected WebElement mensajeGraciasPorcontactarnos;


    public ContactarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


}
