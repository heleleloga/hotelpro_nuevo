/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Leonardo
 */
public class vproducto {
    
    private int Idproducto;
    private String Nombre;
    private String Descripcion;
    private String Unidad_Medida;
    private double Precio_Venta;

    public vproducto() {
    }

    public vproducto(int Idproducto, String Nombre, String Descripcion, String Unidad_Medida, double Precio_Venta) {
        this.Idproducto = Idproducto;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Unidad_Medida = Unidad_Medida;
        this.Precio_Venta = Precio_Venta;
    }

    public int getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.Idproducto = idproducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public String getUnidad_medida() {
        return Unidad_Medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.Unidad_Medida = unidad_medida;
    }

    public double getPrecio_venta() {
        return Precio_Venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.Precio_Venta = precio_venta;
    }
    
    
    
}
