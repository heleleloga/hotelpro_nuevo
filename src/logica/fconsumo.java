/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import datos.vconsumo;
import datos.vproducto;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class fconsumo {
    
    private conexion mysql=new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public  Integer TotalRegistro;
    public Double totalconsumo;
    
    
    
    
     public DefaultTableModel mostrar(String Buscar){
         DefaultTableModel Modelo;
      
        
        String[]titulos = {"ID","Idreserva","Idproducto","Producto","Cantidad","Precio venta","Estado"};
         
        String [] Registro = new String [7];
        
        TotalRegistro=0;
        totalconsumo=0.0;
        
        Modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select c.Idconsumo,c.Idreserva,c.Idproducto,p.Nombre,c.Cantidad,c.Precio_venta "
                + ",c.Estado from Consumo c inner join Producto p on c.Idproducto=p.Idproducto"
                + " where c.Idreserva="+ Buscar +" order by c.Idconsumo desc";
          
           
         try {
             
             Statement st = (Statement) cn.createStatement();
             ResultSet rs=st.executeQuery(sSQL);
              
             while (rs.next()) {                 
                 Registro [0]=rs.getString("Idconsumo");
                 Registro [1]=rs.getString("Idreserva");
                 Registro [2]=rs.getString("Idproducto");
                 Registro [3]=rs.getString("Nombre");
                 Registro [4]=rs.getString("Cantidad");
                 Registro [5]=rs.getString("Precio_venta");
                 Registro [6]=rs.getString("Estado");
                 
                 
                 
                 TotalRegistro=TotalRegistro+1;
                 totalconsumo=totalconsumo + (rs.getDouble("Cantidad")* rs.getDouble("Precio_venta"));
                 
                 
                 Modelo.addRow(Registro );
             }   
             return  Modelo;
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
        return null;
        
    
     }
    
     public boolean insertar (vconsumo dts){
       sSQL="insert into consumo (Idreserva,Idproducto,Cantidad,Precio_Venta,Estado)" +
          "values (?,?,?,?,?)" ;    
         try {
           
             PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
             pst.setInt( 1, dts.getIdreserva());
             pst.setInt( 2, dts.getIdproducto());
             pst.setDouble( 3, dts.getCantidad());
             pst.setDouble(4, dts.getPrecio_venta());
             pst.setString(5, dts.getEstado());
             
              
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
     
      public boolean editar (vconsumo dts){
         sSQL=" update consumo set Idreserva=?,Idproducto=?,Cantidad=?Precio_venta=?,Estado=?"+
          " where Idconsumo=?";           
                 
          try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
             pst.setInt( 1, dts.getIdreserva());
             pst.setInt( 2, dts.getIdproducto());
             pst.setDouble( 3, dts.getCantidad());
             pst.setDouble(4, dts.getPrecio_venta());
             pst.setString(5, dts.getEstado());
             
             
             pst.setInt( 6, dts.getIdconsumo());
              
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
    
       public boolean eliminar (vconsumo dts){
           sSQL="delete from consumo where Idconsumo=?";
         try {
              PreparedStatement pst=(PreparedStatement) cn.prepareStatement(sSQL); 
           
             pst.setInt( 1, dts.getIdconsumo());
              
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
