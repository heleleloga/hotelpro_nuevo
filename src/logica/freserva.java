/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import datos.vreserva;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class freserva {
    
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public  Integer TotalRegistro;
    
     public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","Idhabitacion","Numero","Idcliente","Cliente","Idtrabajador","Trabajador","Tipo reserva","Fecha reserva","Fecha ingreso","Fecha salida","Costo","Estado"};
         
        String [] Registro = new String [13];
        
        TotalRegistro=0;
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select r.Idreserva,r.Idhabitacion,h.Numero,r.Idcliente,"+
               "(select nombre from persona where Idpersona=r.Idcliente)as clieten,"+
               "(select Apellidos from persona where Idpersona=r.Idcliente)as clienteAp,"+
               "r.Idtrabajador,(select nombre from persona where Idpersona=r.Idtrabajador)as trabajadorn,"+
               "(select Apellidos from persona where Idpersona=r.Idtrabajador)as trabajadorAp,"+
               "r.tipo_reserva,r.fecha_reserva,r.fecha_ingresa,r.fecha_salida,"+
               "r.costo_alojamiento,r.estado from reserva r inner join habitacion h on r.Idhabitacion=h.Idhabitacion where r.Fecha_reserva like '%" + Buscar + "%' order by Idreserva desc";
          
           
         try {
             
             Statement st = (Statement) cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("Idreserva");
                 Registro [1]=rs.getString("Idhabitacion");
                 Registro [2]=rs.getString("Numero");
                 Registro [3]=rs.getString("Idcliente");
                 Registro [4]=rs.getString("clienten") + " " + rs.getString("clienteAp"); 
                 Registro [5]=rs.getString("Idtrabajador");
                 Registro [6]=rs.getString("trabajadorn") + " " + rs.getString("trabajadorAp");
                 Registro [7]=rs.getString("tipo_reserva");
                 Registro [8]=rs.getString("fecha_reserva");
                 Registro [9]=rs.getString("fecha_ingresa");
                 Registro [10]=rs.getString("fecha_salida");
                 Registro [11]=rs.getString("costo_alojamiento");
                 Registro [12]=rs.getString("estado");
                 
                 
                 
                 TotalRegistro=TotalRegistro+1;
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
        
    
     }
    
     public boolean insertar (vreserva dts){
        sSQL="insert into reserva(Idhabitacion,Idcliente,Idtrabajador,Tipo_reserva,Fecha_reserva,Fecha_ingresa,Fecha_salida,Costo_alojamiento,Estado)" +
            "values (?,?,?,?,?,?,?,?,?)" ;    
         try {
           
             PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
             pst.setInt( 1, dts.getIdhabitacion());
             pst.setInt( 2, dts.getIdcliente());
             pst.setInt( 3, dts.getIdtrabajador());
             pst.setString(4, dts.getTipo_reserva());
             pst.setDate(5, dts.getFecha_reserva());
             pst.setDate(6, dts.getFecha_ingresa());
             pst.setDate(7, dts.getFecha_salida());
             pst.setDouble(8, dts.getCosto_alojamiento());
             pst.setString(9, dts.getEstado());
             
              
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
     
      public boolean editar (vreserva dts){
         sSQL=" update reserva set Idhabitacion=?,Idcliente=?,Idtrabajador=?,Tipo_reserva=?,Fecha_reserva=?,Fecha_ingresa=?,Fecha_salida=?,Costo_alojamiento=?,Estado=?"+
          " where Idreserva=?";           
                 
          try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
              pst.setInt( 1, dts.getIdhabitacion());
             pst.setInt( 2, dts.getIdcliente());
             pst.setInt( 3, dts.getIdtrabajador());
             pst.setString(4, dts.getTipo_reserva());
             pst.setDate(5, dts.getFecha_reserva());
             pst.setDate(6, dts.getFecha_ingresa());
             pst.setDate(7, dts.getFecha_salida());
             pst.setDouble(8, dts.getCosto_alojamiento());
             pst.setString(9, dts.getEstado());
             
             
             pst.setInt( 10, dts.getIdreserva());
              
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
    
      
      public boolean pagar (vreserva dts){
         sSQL=" update reserva set Estado='Pagada'"+
          " where Idreserva=?";           
                 
          try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
             
             
             
             pst.setInt( 1, dts.getIdreserva());
              
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
    
      
      
      
      
      
      
      
      
      
       public boolean eliminar (vreserva dts){
           sSQL="delete from reserva where Idreserva=?";
        
           
           try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
           
             pst.setInt( 1, dts.getIdreserva());
              
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
