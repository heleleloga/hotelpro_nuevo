/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Leonardo
 */
public class vconsumo {
    private int Idconsumo;
    private int Idreserva;
    private int Idproducto;
    private Double Cantidad;
    private Double Precio_venta;
    private String Estado;

    public vconsumo() {
    }

    public vconsumo(int Idconsumo, int Idreserva, int Idproducto, Double Cantidad, Double Precio_venta, String Estado) {
        this.Idconsumo = Idconsumo;
        this.Idreserva = Idreserva;
        this.Idproducto = Idproducto;
        this.Cantidad = Cantidad;
        this.Precio_venta = Precio_venta;
        this.Estado = Estado;
    }

    public Double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIdconsumo() {
        return Idconsumo;
    }

    public void setIdconsumo(int Idconsumo) {
        this.Idconsumo = Idconsumo;
    }

    public int getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(int Idproducto) {
        this.Idproducto = Idproducto;
    }

    public int getIdreserva() {
        return Idreserva;
    }

    public void setIdreserva(int Idreserva) {
        this.Idreserva = Idreserva;
    }

    public Double getPrecio_venta() {
        return Precio_venta;
    }

    public void setPrecio_venta(Double Precio_venta) {
        this.Precio_venta = Precio_venta;
    }
    
    
    
    
    
    
}
