/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import datos.vhabitacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.fhabitacion;

/**
 *
 * @author Leonardo
 */
public class forhabitacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form forhabitacion
     */
    public forhabitacion() {
        initComponents();
        mostrar("");
        inhabilitar();
             
    }
    private String accion="guardar";

    void ocultar_columnas (){

    tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
    tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
    tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
}
    void inhabilitar (){
        
       txtnumero.setVisible(true);
       cbopiso.setEnabled(false);
       txtnumero.setEnabled(false);
       txtdescripcion.setEnabled(false);
        txtcaracteristicas.setEnabled(false);
        txtpreciodiario.setEnabled(false);
        cboestado.setEnabled(false);
        cbotipodehabitacion.setEnabled(false);
        
       btnguardar.setEnabled(false);
       btncancelar.setEnabled(false);
       btneliminar.setEnabled(false);
       txtidhabitacion.setText("");
       txtpreciodiario.setText("");
       txtcaracteristicas.setText("");
       txtdescripcion.setText("");
    }
    
    void habilitar (){
        
       txtidhabitacion.setVisible(false);
       
       cbopiso.setEnabled(true);
       txtnumero.setEnabled(true);
       txtdescripcion.setEnabled(true);
        txtcaracteristicas.setEnabled(true);
        txtpreciodiario.setEnabled(true);
        cboestado.setEnabled(true);
        cbotipodehabitacion.setEnabled(true);
        
       btnguardar.setEnabled(true);
       btncancelar.setEnabled(true);
       btneliminar.setEnabled(true);
       txtidhabitacion.setText("");
       txtpreciodiario.setText("");
       txtcaracteristicas.setText("");
       txtdescripcion.setText("");
    }
    
    void mostrar(String buscar){
    
    try {
    
        DefaultTableModel modelo;
        fhabitacion func= new fhabitacion();
        modelo= func.mostrar(buscar);
        tablalistado.setModel(modelo);
        ocultar_columnas();
        lbltotalregistros.setText("total registros: "+ Integer.toString( func.TotalRegistro));
        
    }catch (Exception e){
    
        JOptionPane.showConfirmDialog(rootPane, e);
    }
    
    
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidhabitacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbopiso = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcaracteristicas = new javax.swing.JTextArea();
        txtpreciodiario = new javax.swing.JTextField();
        cboestado = new javax.swing.JComboBox();
        cbotipodehabitacion = new javax.swing.JComboBox();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbltotalregistros = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro De Habitaciones"));

        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero:");

        jLabel3.setText("Pisio:");

        cbopiso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        cbopiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbopisoActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripcion:");

        jLabel5.setText("Precio Diario:");

        jLabel6.setText("Estado:");

        jLabel7.setText("Tipo de habitacion:");

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        jLabel8.setText("Caracteristicas:");

        txtcaracteristicas.setColumns(20);
        txtcaracteristicas.setRows(5);
        jScrollPane2.setViewportView(txtcaracteristicas);

        txtpreciodiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreciodiarioActionPerformed(evt);
            }
        });

        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Ocupado", "Mantenimiento" }));
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
            }
        });

        cbotipodehabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Individual ", "Matrimonial", "Familiar", "Presidencial" }));
        cbotipodehabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipodehabitacionActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(153, 153, 153));
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/CUADERNO.png"))); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(153, 153, 153));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/GUARDAR.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(153, 153, 153));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/cancelar-icono-4824-32.png"))); // NOI18N
        btncancelar.setText("CANCELAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumero)
                    .addComponent(cbopiso, 0, 154, Short.MAX_VALUE)
                    .addComponent(txtpreciodiario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboestado, 0, 154, Short.MAX_VALUE)
                    .addComponent(cbotipodehabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnnuevo)
                .addGap(54, 54, 54)
                .addComponent(btnguardar)
                .addGap(47, 47, 47)
                .addComponent(btncancelar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidhabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbopiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpreciodiario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbotipodehabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnguardar)
                    .addComponent(btncancelar))
                .addGap(26, 26, 26))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("HABITACION");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado De Habitaciones"));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Piso", "Descripcion", "Precio diario", "Estado", "Tipo de habitacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistado);

        btnbuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/xmag-icono-5512-32.png"))); // NOI18N
        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(153, 153, 153));
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/ELIMINAR.png"))); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(153, 153, 153));
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/salir-de-gnome-icono-8179-32.png"))); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jLabel9.setText("BUSCAR");

        lbltotalregistros.setBackground(new java.awt.Color(204, 204, 204));
        lbltotalregistros.setText("REGISTROS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(jScrollPane3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnbuscar)
                        .addGap(74, 74, 74)
                        .addComponent(btneliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207)
                .addComponent(lbltotalregistros)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitar();
        btnguardar.setText("Guardar");
        accion="guardar";
   }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (txtnumero.getText().length()== 0 ){
        
        JOptionPane.showConfirmDialog(rootPane,"debes ingresar un Numero de Habitacion");
        txtnumero.requestFocus();
        return;
        }
        if (txtdescripcion.getText().length()== 0 ){
        
        JOptionPane.showConfirmDialog(rootPane,"debes ingresar una descripcion para la habitacion");
        txtdescripcion.requestFocus();
        return;
        }
        if (txtpreciodiario.getText().length()== 0 ){
        
        JOptionPane.showConfirmDialog(rootPane,"debes ingrese un precio diario para la habitacion");
        txtpreciodiario.requestFocus();
        return;
        }
        if (txtcaracteristicas.getText().length()== 0 ){
        
        JOptionPane.showConfirmDialog(rootPane,"debes ingresar una caracteristica para la habitacion");
        txtcaracteristicas.requestFocus();
        return;
        }
        vhabitacion dts=new vhabitacion();
        fhabitacion func=new fhabitacion();
        
    dts.setNumero(txtnumero.getText());
    
    int seleccionado = cbopiso.getSelectedIndex();
    dts.setPiso((String) cbopiso.getItemAt(seleccionado));
        
    dts.setDescripcion(txtdescripcion.getText());
    dts.setCaracteristica(txtcaracteristicas.getText());
    dts.setPrecio_Diario(Double.parseDouble(txtpreciodiario.getText()));
    
     seleccionado = cboestado.getSelectedIndex();
     dts.setEstado((String) cboestado.getItemAt(seleccionado));
     seleccionado = cbotipodehabitacion.getSelectedIndex();
     dts.setTipo_Habitacion((String) cbotipodehabitacion.getItemAt(seleccionado));
    
        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane,"la habitacion fue registrada correctamente");
                mostrar ("");
                inhabilitar();
                
            }
        }else if (accion.equals("editar")){
        
        dts.setIdHabhitacion(Integer.parseInt(txtidhabitacion.getText()));
        
            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane,"la habitacion fue Editada correctamente");
                mostrar ("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
         if (txtidhabitacion.getText().equals("")) {
            int confirmacion=JOptionPane.showConfirmDialog(rootPane,"estas seguro de eliminar la habitacion?","confirmar",2);
            if (confirmacion==0) {
                fhabitacion func= new fhabitacion();
                vhabitacion dts=new vhabitacion();
                dts.setIdHabhitacion(Integer.parseInt(txtidhabitacion.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();
            }
        
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
      mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
          txtnumero.transferFocus();
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void cbopisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbopisoActionPerformed
        cbopiso.transferFocus();
    }//GEN-LAST:event_cbopisoActionPerformed

    private void txtpreciodiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreciodiarioActionPerformed
         txtpreciodiario.transferFocus();
    }//GEN-LAST:event_txtpreciodiarioActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        cboestado.transferFocus();
    }//GEN-LAST:event_cboestadoActionPerformed

    private void cbotipodehabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipodehabitacionActionPerformed
       cbotipodehabitacion.transferFocus();
    }//GEN-LAST:event_cbotipodehabitacionActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar.setText("editar");
       habilitar();
       btneliminar.setEnabled(true);
       accion="editar";
       
       int fila=tablalistado.rowAtPoint(evt.getPoint());
       txtidhabitacion.setText(tablalistado.getValueAt(fila, 0).toString());
       txtnumero.setText(tablalistado.getValueAt(fila, 1).toString());
       cbopiso.setSelectedItem(tablalistado.getValueAt(fila, 2).toString());
       txtdescripcion.setText(tablalistado.getValueAt(fila, 3).toString());
       txtcaracteristicas.setText(tablalistado.getValueAt(fila, 4).toString());
       txtpreciodiario.setText(tablalistado.getValueAt(fila, 5).toString());
       
       cboestado.setSelectedItem(tablalistado.getValueAt(fila, 6).toString());
       cbotipodehabitacion.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(forhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new forhabitacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox cboestado;
    private javax.swing.JComboBox cbopiso;
    private javax.swing.JComboBox cbotipodehabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton lbltotalregistros;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextArea txtcaracteristicas;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtidhabitacion;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpreciodiario;
    // End of variables declaration//GEN-END:variables
}
