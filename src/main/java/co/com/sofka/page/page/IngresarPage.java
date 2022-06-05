package co.com.sofka.page.page;

import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IngresarPage extends CommonActionsOnPages {

    //Entrada de datos

    @FindBy(xpath = "//*[@id=\"bs_dialog\"]/div[1]/a")
    protected WebElement banner;

    @FindBy(className = "usu")
    protected WebElement botonIngresar;

    @FindBy(id = "login_usuario")
    protected WebElement campoEmailIngresar;

    @FindBy(id = "login_clave")
    protected WebElement campoClaveIngresar;

    @FindBy ( id = "btn_login_submit")
    protected WebElement botonSubmit;

    @FindBy ( id = "dhtml_alert_MSG")
    protected  WebElement mensajeIngresoErroneo;

    //@FindBy ( className = "olvideclave")
    @FindBy (linkText = "Olvidé mi clave")
    protected WebElement botonOlvideMiClave;

    @FindBy ( id = "olvideemail")
    protected WebElement campoOlvideMiclave;

    @FindBy (className = "submit1")
    protected WebElement botonEnviarEmail;




    public IngresarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }
}
