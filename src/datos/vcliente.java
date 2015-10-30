/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Leonardo
 */
public class vcliente extends vpersona {
    
    private String Codigo_Cliente;

    public vcliente() {
    }

    public vcliente(String Codigo_Cliente) {
        this.Codigo_Cliente = Codigo_Cliente;
    }

    public String getCodigo_Cliente() {
        return Codigo_Cliente;
    }

    public void setCodigo_Cliente(String Codigo_Cliente) {
        this.Codigo_Cliente = Codigo_Cliente;
    }
    
    
    
}
