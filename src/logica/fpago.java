/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import datos.vpago;
import datos.vproducto;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class fpago {
    
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public  Integer TotalRegistro;
    
     public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","Idreserva","Tipo comprobante","Num comprobante","Igv","Total pago","Fecha emision","Fecha pago"};
         
        String [] Registro = new String [8];
        
        TotalRegistro=0;
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from pago where Idreserva=" + Buscar + "order by Idpago desc";
          
           
         try {
             
             Statement st = (Statement) cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("Idpago");
                 Registro [1]=rs.getString("Idreserva");
                 Registro [2]=rs.getString("Tipo_comprobante");
                 Registro [3]=rs.getString("Num_comprobante");
                 Registro [4]=rs.getString("Igv");
                 Registro [5]=rs.getString("Total_pago");
                 Registro [6]=rs.getString("Fecha_emision");
                 Registro [7]=rs.getString("Fecha_pago");
               
                 
                 TotalRegistro=TotalRegistro+1;
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
        
    
     }
    
     public boolean insertar (vpago dts){
       sSQL="insert into pago(Idreserva,Tipo_comprobante,Num_comprobante,Igv,Total_pago,Fecha_emision,Fecha_pago)" +
          "values (?,?,?,?,?,?,?)" ;    
         try {
           
             PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
             
             pst.setInt( 1, dts.getIdreserva());
             pst.setString( 2, dts.getTipo_comprobante());
             pst.setString( 3, dts.getNum_comprobante());
             pst.setDouble(4, dts.getIgv());
             pst.setDouble(5, dts.getTotal_pago());
             pst.setDate(6, dts.getFecha_emision());
             pst.setDate(7, dts.getFecha_pago());
             
             
             
              
             int n=pst.executeUpdate();
             if (n!=0){
                 return true;
             } 
             else{
                 return false;
             }
             
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return false;
  
     }
     
      public boolean editar (vpago dts){
         sSQL=" update pago set Idreserva=?,Tipo_comprobante=?,Num_comprobante=?Igv=?,Total_pago=?,Fecha_emision=?,Fecha_pago=?"+
          " where Idpago=?";           
                 
          try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
              
             pst.setInt( 1, dts.getIdreserva());
             pst.setString( 2, dts.getTipo_comprobante());
             pst.setString( 3, dts.getNum_comprobante());
             pst.setDouble(4, dts.getIgv());
             pst.setDouble(5, dts.getTotal_pago());
             pst.setDate(6, dts.getFecha_emision());
             pst.setDate(7, dts.getFecha_pago());
             
             pst.setInt( 8, dts.getIdpago());
              
             int n=pst.executeUpdate();
             if (n!=0){
                 return true;
               } 
             else{
                 return false;
             }
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
            return false;
         }
    
         
  
     }
    
       public boolean eliminar (vpago dts){
           sSQL="delete from pago where Idpago=?";
         try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
           
             pst.setInt( 1, dts.getIdpago());
              
             int n=pst.executeUpdate();
             
             if (n!=0){
                 return true;
               } 
             else{
                 return false;
             }  
             
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
             return false;
         }
  
       }
}
