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
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class fcliente {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer TotalRegistro;

    public DefaultTableModel mostrar(String Buscar) {
        DefaultTableModel Modelo;


        String[] titulos = {"ID", "Nombre", "Apellidos", "Tipo Documento", "Numero Documento", "Direccion", "Telefono", "Email", "Codigo"};

        String[] Registro = new String[9];

        TotalRegistro = 0;
        Modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.Idpersona,p.nombre,p.Apellidos,p.Tipo_Documento,p.Num_Documento,"
                +"p.Direccion,p.Telefono,p.Email,c.Codigo_Cliente from Persona p inner join Cliente c "
                + "on p.Idpersona=c.Idpersona where Num_Documento like '%"
                + Buscar + "%' order by Idpersona desc";


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
                Registro[8] = rs.getString("Codigo_Cliente");


                TotalRegistro = TotalRegistro + 1;
                Modelo.addRow(Registro);
            }
            return Modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return null;


    }

    public boolean insertar(vcliente dts) {
        sSQL = "insert into persona (Nombre,Apellidos,Tipo_Documento,Num_Documento,Direccion,Telefono,Email)"
                + "values (?,?,?,?,?,?,?)";

        sSQL2 = "insert into cliente (Idpersona,Codigo_Cliente)"
                + "values ((select Idpersona from persona order by Idpersona desc limit 1),?)";

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

            pst2.setString(1, dts.getCodigo_Cliente());


            int n = pst.executeUpdate();
            if (n != 0) {

                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
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

    public boolean editar(vcliente dts) {
        sSQL = " update persona set Nombre=?,Apellidos=?,Tipo_Documento=?Num_documento=?,"
                + "Direccion=?,Telefono=?,Email=? where Idpersona=?";
        
         sSQL2 = " update cliente set Codigo_Cliente=?"
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
            
            pst2.setString(1, dts.getCodigo_Cliente());
            pst2.setInt(2, dts.getIdpersona());    

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

    public boolean eliminar(vcliente dts) {
        sSQL = "delete from cliente where Idpersona=?";
        sSQL2 = "delete from persona where Idpersona=?";
        
       
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
}
