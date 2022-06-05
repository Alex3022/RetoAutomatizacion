package co.com.sofka.page.page;

import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrarPage extends CommonActionsOnPages {

    //Entrada de datos


    @FindBy(xpath = "//*[@id=\"bs_dialog\"]/div[1]/a")
    protected WebElement banner;

    @FindBy(className = "usu")
    protected WebElement botonIngresar;

    @FindBy ( xpath = "//*[@id=\"frm_login\"]/div[6]/div[2]/a")
    protected WebElement botonRegistrar;

    @FindBy ( id = "nombres")
    protected WebElement ingreseNombre;

    @FindBy ( id = "apellido")
    protected  WebElement ingresarApellido;

    @FindBy ( id = "id_pais")
    protected WebElement seleccionePais;

    @FindBy ( id = "email")
    protected WebElement ingresarEmailc;

    @FindBy ( id = "clave")
    protected WebElement suministeClave;

    @FindBy (id = "confirm_clave")
    protected WebElement confirmarLaclave;

    @FindBy ( id = "acepto_politicas")
    protected WebElement heledioYaceptoPoliticas;

    @FindBy ( id = "btn_summit")
    protected WebElement botonListo;

    @FindBy (xpath = "//*[@id=\"proyecto_sublimesolutions\"]/body/div[6]/div[3]/div[2]/h1")
    protected WebElement  mensajeElUsuarioEstaActivado;

    @FindBy (id = "dhtm_alert_MSG")
    protected WebElement mensajesClavesnocoiciden;

    public RegistrarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }
}
