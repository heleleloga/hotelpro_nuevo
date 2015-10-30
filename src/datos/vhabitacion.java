/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Leonardo
 */
public class vhabitacion {
    
     private int IdHabhitacion;
    private String Numero;
    private String Piso;
    private String Descripcion;
    private String Caracteristica;
    private Double Precio_Diario;
    private String Estado;
    private String Tipo_Habitacion;

    public vhabitacion(int IdHabhitacion, String Numero, String Piso, String Descripcion, String Caracteristica, String Estado, String Tipo_Habitacion) {
        this.IdHabhitacion = IdHabhitacion;
        this.Numero = Numero;
        this.Piso = Piso;
        this.Descripcion = Descripcion;
        this.Caracteristica = Caracteristica;
        this.Estado = Estado;
        this.Tipo_Habitacion = Tipo_Habitacion;
    }

    public vhabitacion() {
    }

    public int getIdHabhitacion() {
        return IdHabhitacion;
    }

    public void setIdHabhitacion(int IdHabhitacion) {
        this.IdHabhitacion = IdHabhitacion;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getPiso() {
        return Piso;
    }

    public void setPiso(String Piso) {
        this.Piso = Piso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCaracteristica() {
        return Caracteristica;
    }

    public void setCaracteristica(String Caracteristica) {
        this.Caracteristica = Caracteristica;
    }

    public Double getPrecio_Diario() {
        return Precio_Diario;
    }

    public void setPrecio_Diario(Double Precio_Diario) {
        this.Precio_Diario = Precio_Diario;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTipo_Habitacion() {
        return Tipo_Habitacion;
    }

    public void setTipo_Habitacion(String Tipo_Habitacion) {
        this.Tipo_Habitacion = Tipo_Habitacion;
    }
      
             
    

    
}
