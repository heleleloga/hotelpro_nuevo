/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Leonardo
 */
public class vpersona {
    private int Idpersona;
    private String Nombre;       
    private String Apellidos;
    private String Tipo_Documento;
    private String Num_Documento;
    private String Direccion;       
    private String Telefono;       
    private String Email;

    public vpersona() {
    }

    public vpersona(int Idpersona, String Nombre, String Apellidos, String Tipo_Documento, String Num_Documento, String Direccion, String Telefono, String Email) {
        this.Idpersona = Idpersona;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Tipo_Documento = Tipo_Documento;
        this.Num_Documento = Num_Documento;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getIdpersona() {
        return Idpersona;
    }

    public void setIdpersona(int Idpersona) {
        this.Idpersona = Idpersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNum_Documento() {
        return Num_Documento;
    }

    public void setNum_Documento(String Num_Documento) {
        this.Num_Documento = Num_Documento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTipo_Documento() {
        return Tipo_Documento;
    }

    public void setTipo_Documento(String Tipo_Documento) {
        this.Tipo_Documento = Tipo_Documento;
    }
          
    
    
    
    
    
}
