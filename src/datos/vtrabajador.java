/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Leonardo
 */
public class vtrabajador extends vpersona{
    
    double Sueldo;
    String Acceso;
    String login;
    String Password;
    String Estado;

    public vtrabajador() {
    }

    public vtrabajador(double Sueldo, String Acceso, String login, String Password, String Estado) {
        this.Sueldo = Sueldo;
        this.Acceso = Acceso;
        this.login = login;
        this.Password = Password;
        this.Estado = Estado;
    }

    public String getAcceso() {
        return Acceso;
    }

    public void setAcceso(String Acceso) {
        this.Acceso = Acceso;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
  
}
