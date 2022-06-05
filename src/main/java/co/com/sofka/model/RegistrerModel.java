package co.com.sofka.model;

public class RegistrerModel {

    private String nombre;

    private String apellido;

    private String pais;

    private String sitioWeb;

    private String email;

    private String clave;

    private  String ConfirmarClave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getConfirmarClave() {
        return ConfirmarClave;
    }

    public void setConfirmarClave(String confirmarClave) {
        ConfirmarClave = confirmarClave;
    }
}
