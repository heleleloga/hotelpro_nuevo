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
public class vpago {
    
    private int Idpago;
    private int Idreserva;
    private String Tipo_comprobante;
    private String Num_comprobante;
    private Double  Igv;
    private Double Total_pago;
    private Date Fecha_emision;
    private Date Fecha_pago;

    public vpago() {
    }

    public vpago(int Idpago, int Idreserva, String Tipo_comprobante, String Num_comprobante, Double Igv, Double Total_pago, Date Fecha_emision, Date Fecha_pago) {
        this.Idpago = Idpago;
        this.Idreserva = Idreserva;
        this.Tipo_comprobante = Tipo_comprobante;
        this.Num_comprobante = Num_comprobante;
        this.Igv = Igv;
        this.Total_pago = Total_pago;
        this.Fecha_emision = Fecha_emision;
        this.Fecha_pago = Fecha_pago;
    }

    public Date getFecha_emision() {
        return Fecha_emision;
    }

    public void setFecha_emision(Date Fecha_emision) {
        this.Fecha_emision = Fecha_emision;
    }

    public Date getFecha_pago() {
        return Fecha_pago;
    }

    public void setFecha_pago(Date Fecha_pago) {
        this.Fecha_pago = Fecha_pago;
    }

    public int getIdpago() {
        return Idpago;
    }

    public void setIdpago(int Idpago) {
        this.Idpago = Idpago;
    }

    public int getIdreserva() {
        return Idreserva;
    }

    public void setIdreserva(int Idreserva) {
        this.Idreserva = Idreserva;
    }

    public Double getIgv() {
        return Igv;
    }

    public void setIgv(Double Igv) {
        this.Igv = Igv;
    }

    public String getNum_comprobante() {
        return Num_comprobante;
    }

    public void setNum_comprobante(String Num_comprobante) {
        this.Num_comprobante = Num_comprobante;
    }

    public String getTipo_comprobante() {
        return Tipo_comprobante;
    }

    public void setTipo_comprobante(String Tipo_comprobante) {
        this.Tipo_comprobante = Tipo_comprobante;
    }

    public Double getTotal_pago() {
        return Total_pago;
    }

    public void setTotal_pago(Double Total_pago) {
        this.Total_pago = Total_pago;
    }
    
    
    
    
    
}
