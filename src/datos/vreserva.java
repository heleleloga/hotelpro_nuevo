/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Date;

/**
 *
 * @author Leonardo
 */
public class vreserva {
    
    private int Idreserva;
    private int Idhabitacion;
    private int Idcliente; 
    private int Idtrabajador;
    private String Tipo_reserva;
    private Date Fecha_reserva;
    private Date Fecha_ingresa;
    private Date Fecha_salida;
    private double Costo_alojamiento;
    private String Estado;

    public vreserva() {
    }

    public vreserva(int Idreserva, int Idhabitacion, int Idcliente, int Idtrabajador, String Tipo_reserva, Date Fecha_reserva, Date Fecha_ingresa, Date Fecha_salida, double Costo_alojamiento, String Estado) {
        this.Idreserva = Idreserva;
        this.Idhabitacion = Idhabitacion;
        this.Idcliente = Idcliente;
        this.Idtrabajador = Idtrabajador;
        this.Tipo_reserva = Tipo_reserva;
        this.Fecha_reserva = Fecha_reserva;
        this.Fecha_ingresa = Fecha_ingresa;
        this.Fecha_salida = Fecha_salida;
        this.Costo_alojamiento = Costo_alojamiento;
        this.Estado = Estado;
    }

    public double getCosto_alojamiento() {
        return Costo_alojamiento;
    }

    public void setCosto_alojamiento(double Costo_alojamiento) {
        this.Costo_alojamiento = Costo_alojamiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Date getFecha_ingresa() {
        return Fecha_ingresa;
    }

    public void setFecha_ingresa(Date Fecha_ingresa) {
        this.Fecha_ingresa = Fecha_ingresa;
    }

    public Date getFecha_reserva() {
        return Fecha_reserva;
    }

    public void setFecha_reserva(Date Fecha_reserva) {
        this.Fecha_reserva = Fecha_reserva;
    }

    public Date getFecha_salida() {
        return Fecha_salida;
    }

    public void setFecha_salida(Date Fecha_salida) {
        this.Fecha_salida = Fecha_salida;
    }

    public int getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(int Idcliente) {
        this.Idcliente = Idcliente;
    }

    public int getIdhabitacion() {
        return Idhabitacion;
    }

    public void setIdhabitacion(int Idhabitacion) {
        this.Idhabitacion = Idhabitacion;
    }

    public int getIdreserva() {
        return Idreserva;
    }

    public void setIdreserva(int Idreserva) {
        this.Idreserva = Idreserva;
    }

    public int getIdtrabajador() {
        return Idtrabajador;
    }

    public void setIdtrabajador(int Idtrabajador) {
        this.Idtrabajador = Idtrabajador;
    }

    public String getTipo_reserva() {
        return Tipo_reserva;
    }

    public void setTipo_reserva(String Tipo_reserva) {
        this.Tipo_reserva = Tipo_reserva;
    }
    
    
    
    
             
}
