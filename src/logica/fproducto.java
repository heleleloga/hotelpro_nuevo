/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import datos.vproducto;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class fproducto {
    
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public  Integer TotalRegistro;
    
     public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","Producto","Descripcion","Unidad Medida","Precio Venta"};
         
        String [] Registro = new String [5];
        
        TotalRegistro=0;
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from producto where nombre like '%" + Buscar + "%' order by idproducto desc";
          
           
         try {
             
             Statement st = (Statement) cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("Idproducto");
                 Registro [1]=rs.getString("Nombre");
                 Registro [2]=rs.getString("Descripcion");
                 Registro [3]=rs.getString("Unidad_Medida");
                 Registro [4]=rs.getString("Precio_Venta");
                 
                 
                 TotalRegistro=TotalRegistro+1;
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
        
    
     }
    
     public boolean insertar (vproducto dts){
       sSQL="insert into producto(Nombre,Descripcion,Unidad_Medida,Precio_Venta)" +
          "values (?,?,?,?)" ;    
         try {
           
             PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
             pst.setString( 1, dts.getNombre());
             pst.setString( 2, dts.getDescripcion());
             pst.setString( 3, dts.getUnidad_medida());
             pst.setDouble(4, dts.getPrecio_venta());
             
              
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
     
      public boolean editar (vproducto dts){
         sSQL=" update producto set Nombre=?,Descripcion=?,unidad_medida=?Precio_venta=?"+
          " where Idproducto=?";           
                 
          try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
             pst.setString( 1, dts.getNombre());
             pst.setString( 2, dts.getDescripcion());
             pst.setString( 3, dts.getUnidad_medida());
             pst.setDouble(4, dts.getPrecio_venta());
             
             pst.setInt( 5, dts.getIdproducto());
              
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
    
       public boolean eliminar (vproducto dts){
           sSQL="delete from producto where Idproducto=?";
         try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
           
             pst.setInt( 1, dts.getIdproducto());
              
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
