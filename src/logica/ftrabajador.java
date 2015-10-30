/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import datos.vcliente;
import datos.vproducto;
import datos.vtrabajador;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class ftrabajador {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer TotalRegistro;

    public DefaultTableModel mostrar(String Buscar) {
        DefaultTableModel Modelo;


        String[] titulos = {"ID", "Nombre", "Apellidos", "Tipo Documento", "Numero Documento", "Direccion", "Telefono", "Email", "Sueldo","Acceso","Login","Password","Estado"};

        String[] Registro = new String[13];

        TotalRegistro = 0;
        Modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.idpersona,p.nombre,p.apellidos,p.tipo_documento,p.num_documento,"
                +"p.direccion,p.telefono,p.email,t.sueldo,t.acceso,t.login,t.password,t.estado from persona p inner join Trabajador t "
                + "on p.idpersona=t.idpersona where num_documento like '%"
                + Buscar + "%' order by idpersona desc";


        try {

            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                Registro[0] = rs.getString("Idpersona");
                Registro[1] = rs.getString("Nombre");
                Registro[2] = rs.getString("Apellidos");
                Registro[3] = rs.getString("Tipo_Documento");
                Registro[4] = rs.getString("Num_Documento");
                Registro[5] = rs.getString("Direccion");
                Registro[6] = rs.getString("Telefono");
                Registro[7] = rs.getString("Email");
                Registro[8] = rs.getString("Sueldo");
                Registro[9] = rs.getString("Acceso");
                Registro[10] = rs.getString("Login");
                Registro[11] = rs.getString("Password");
                Registro[12] = rs.getString("Estado");

                TotalRegistro = TotalRegistro + 1;
                Modelo.addRow(Registro);
            }
            return Modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return null;


    }

    public boolean insertar(vtrabajador dts) {
        sSQL = "insert into persona (Nombre,Apellidos,Tipo_Documento,Num_Documento,Direccion,Telefono,Email)"
                + "values (?,?,?,?,?,?,?)";

        sSQL2 = "insert into trabajador (Idpersona,Sueldo,Acceso,Login,Password,Estado)"
                + "values ((select Idpersona from persona order by Idpersona desc limit 1),?,?,?,?,?)";

        try {

            PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sSQL);
            PreparedStatement pst2 = (PreparedStatement) cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellidos());
            pst.setString(3, dts.getTipo_Documento());
            pst.setString(4, dts.getNum_Documento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getTelefono());
            pst.setString(7, dts.getEmail());

            pst2.setDouble(1, dts.getSueldo());
            pst2.setString(2, dts.getAcceso());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getEstado());

            int n = pst.executeUpdate();
            if (n != 0) {

                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return false;
                } else {

                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;

    }

    public boolean editar(vtrabajador dts) {
        sSQL = " update persona set Nombre=?,Apellidos=?,Tipo_Documento=?Num_documento=?,"
                + "Direccion=?,Telefono=?,Email=? where Idpersona=?";
        
         sSQL2 = " update Trabajador set Sueldo=?,Acceso=?,Login=?,Password=?,Estado=?"
                + " where Idpersona=?";

         try {

            PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sSQL);
            PreparedStatement pst2 = (PreparedStatement) cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getApellidos());
            pst.setString(3, dts.getTipo_Documento());
            pst.setString(4, dts.getNum_Documento());
            pst.setString(5, dts.getDireccion());
            pst.setString(6, dts.getTelefono());
            pst.setString(7, dts.getEmail());

            pst.setInt(8, dts.getIdpersona());
            
            pst2.setDouble(1, dts.getSueldo());
            pst2.setString(2, dts.getAcceso());
            pst2.setString(3, dts.getLogin());
            pst2.setString(4, dts.getPassword());
            pst2.setString(5, dts.getEstado());
            pst2.setInt(6, dts.getIdpersona());    

            int n = pst.executeUpdate();
            if (n != 0) {

                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return false;
                } else {

                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;

    }

    public boolean eliminar(vtrabajador dts) {
        sSQL = "delete from Trabajador where Idpersona=?";
        sSQL2 = "delete from Persona where Idpersona=?";
        
       
         try {

            PreparedStatement pst = (PreparedStatement) cn.prepareStatement(sSQL);
            PreparedStatement pst2 = (PreparedStatement) cn.prepareStatement(sSQL2);

           

            pst.setInt(1, dts.getIdpersona());
            
            pst2.setInt(1, dts.getIdpersona());    

            int n = pst.executeUpdate();
            if (n != 0) {

                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return false;
                } else {

                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return false;
    }
    
    public DefaultTableModel login(String login,String password) {
        DefaultTableModel Modelo;


        String[] titulos = {"ID", "Nombre", "Apellidos","Acceso","Login","Password","Estado"};

        String[] Registro = new String[7];

        TotalRegistro = 0;
        Modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.Idpersona,p.Nombre,p.Apellidos,"
                +"t.Acceso,t.Login,t.Password,t.Estado from Persona p inner join Trabajador t "
                + "on p.Idpersona=t.Idpersona where t.Login='"
                + login + "' and t.Password='" + password +  "' and t.estado='Activada'";


        try {

            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                Registro[0] = rs.getString("Idpersona");
                Registro[1] = rs.getString("Nombre");
                Registro[2] = rs.getString("Apellidos");
                
                Registro[3] = rs.getString("Acceso");
                Registro[4] = rs.getString("Login");
                Registro[5] = rs.getString("Password");
                Registro[6] = rs.getString("Estado");

                TotalRegistro = TotalRegistro + 1;
                Modelo.addRow(Registro);
            }
            return Modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return null;


    }
    
    
  
}
