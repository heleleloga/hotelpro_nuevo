/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import datos.vhabitacion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class fhabitacion {
    
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public  Integer TotalRegistro;
    
    
     public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","Numero","Piso","Descripcion","Caracteristica","Precio","Estado","Tipo_Habitacion"};
         
        String [] Registro = new String [8];
        
        TotalRegistro=0;
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from Habitacion where Piso like '%" + Buscar + "%' order by IdHabitacion";
          
           
         try {
             
             Statement st = (Statement) cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("IdHabitacion");
                 Registro [1]=rs.getString("Numero");
                 Registro [2]=rs.getString("Piso");
                 Registro [3]=rs.getString("Descripcion");
                 Registro [4]=rs.getString("Caracteristica");
                 Registro [5]=rs.getString("Precio_Diario");
                 Registro [6]=rs.getString("Estado");
                 Registro [7]=rs.getString("Tipo_Habitacion");
                 
                 TotalRegistro=TotalRegistro+1;
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
        
    
     }
     
      public DefaultTableModel mostrarvista(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","Numero","Piso","Descripcion","Caracteristica","Precio","Estado","Tipo_Habitacion"};
         
        String [] Registro = new String [8];
        
        TotalRegistro=0;
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from Habitacion where Piso like '%" + Buscar + "%'and Estado='Disponible' order by IdHabitacion";
          
           
         try {
             
             Statement st = (Statement) cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("IdHabitacion");
                 Registro [1]=rs.getString("Numero");
                 Registro [2]=rs.getString("Piso");
                 Registro [3]=rs.getString("Descripcion");
                 Registro [4]=rs.getString("Caracteristica");
                 Registro [5]=rs.getString("Precio_Diario");
                 Registro [6]=rs.getString("Estado");
                 Registro [7]=rs.getString("Tipo_Habitacion");
                 
                 TotalRegistro=TotalRegistro+1;
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
        
    
     }
     
     
     
     
     
    
     public boolean insertar (vhabitacion dts){
       sSQL="insert into habitacion(Numero,Piso,Descripcion,Caracteristica,Precio_Diario,Estado,Tipo_Habitacion)" +
          "values (?,?,?,?,?,?,?)" ;    
         try {
           
             PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
             pst.setString( 1, dts.getNumero());
             pst.setString( 2, dts.getPiso());
             pst.setString( 3, dts.getDescripcion());
             pst.setString( 4, dts.getCaracteristica());
             pst.setDouble( 5, dts.getPrecio_Diario());
             pst.setString( 6, dts.getEstado());
             pst.setString( 7, dts.getTipo_Habitacion());
              
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
     
      public boolean editar (vhabitacion dts){
         sSQL=" update habitacion set Numero=?,Piso=?,Descripcion=?,Caracteristica=?Precio_Habitacion=?,Estado=?,Tipo_Habitacion=?"+
          " where IdHabitacion=?";           
                 
          try {
             PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
             pst.setString( 1, dts.getNumero());
             pst.setString( 2, dts.getPiso());
             pst.setString( 3, dts.getDescripcion());
             pst.setString( 4, dts.getCaracteristica());
             pst.setDouble( 5, dts.getPrecio_Diario());
             pst.setString( 6, dts.getEstado());
             pst.setString( 7, dts.getTipo_Habitacion());
             pst.setInt( 8, dts.getIdHabhitacion());
              
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
    
       public boolean eliminar (vhabitacion dts){
           sSQL="delete from habitacion where Idhabitacion=?";
         try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
           
             pst.setInt( 1, dts.getIdHabhitacion());
              
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
