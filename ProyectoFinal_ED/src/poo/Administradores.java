
package poo;

import conexion.ConectarBD;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.Administrador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;


public class Administradores extends javax.swing.JFrame {
    
    ArrayList <Administrador> listaAdministradores = new ArrayList();
    Administrador ingresoAdministrador;
    ConectarBD con = new ConectarBD();
   
    public Administradores() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panGestor = new javax.swing.JPanel();
        panAccesoAdmin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        btnAcceder = new javax.swing.JButton();
        lblTitulo3 = new javax.swing.JLabel();
        lblTexto3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTrabajadores = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Salarios Agustin");

        panGestor.setBackground(new java.awt.Color(153, 204, 255));
        panGestor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));

        panAccesoAdmin.setBackground(new java.awt.Color(102, 204, 0));
        panAccesoAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acceso Administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContraseña.setText("Contraseña");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        btnAcceder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAccesoAdminLayout = new javax.swing.GroupLayout(panAccesoAdmin);
        panAccesoAdmin.setLayout(panAccesoAdminLayout);
        panAccesoAdminLayout.setHorizontalGroup(
            panAccesoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAccesoAdminLayout.createSequentialGroup()
                .addGroup(panAccesoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAccesoAdminLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panAccesoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsuario)
                            .addComponent(lblContraseña))
                        .addGap(42, 42, 42)
                        .addGroup(panAccesoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(txtContraseña)))
                    .addGroup(panAccesoAdminLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnAcceder)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panAccesoAdminLayout.setVerticalGroup(
            panAccesoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAccesoAdminLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panAccesoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAccesoAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnAcceder)
                .addContainerGap())
        );

        lblTitulo3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo3.setText("Gestor de Salarios");

        lblTexto3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTexto3.setText("Si tiene algun problema para acceder o actulizar datos, dirigase al departamento de Telecomunicaciones y Sistemas");

        jtTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Area", "Turno", "Horas laboradas", "Días laborados", "Salario final"
            }
        ));
        jScrollPane1.setViewportView(jtTrabajadores);

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar a Inicio");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panGestorLayout = new javax.swing.GroupLayout(panGestor);
        panGestor.setLayout(panGestorLayout);
        panGestorLayout.setHorizontalGroup(
            panGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panAccesoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGestorLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(279, 279, 279))
            .addGroup(panGestorLayout.createSequentialGroup()
                .addGroup(panGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panGestorLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lblTexto3))
                    .addGroup(panGestorLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(lblTitulo3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panGestorLayout.setVerticalGroup(
            panGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGestorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panGestorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panAccesoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panGestorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnRegresar))
                .addGap(18, 18, 18)
                .addComponent(lblTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panGestor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        
        String usuario = txtUsuario.getText();
        String password = txtContraseña.getText();
        
        ingresoAdministrador = new Administrador(usuario, password);
        listaAdministradores.add(ingresoAdministrador);
        
        for (Administrador usuario1 : listaAdministradores) {//inicia for each
            JOptionPane.showMessageDialog(null, "Datos Usuario \n\n"
                                                +"Usuario: " +usuario1.getUsuario()
                                                +"\nPassword: " +usuario1.getPassword());
            
        }//termina for each
        try {
            con.conectarBDOracle();
    String altaUsuario="INSERT INTO usuarios Values ('"+ingresoAdministrador.getUsuario()+"','"+ingresoAdministrador.getPassword()+"')";       
        con.stmt.executeUpdate(altaUsuario);
        JOptionPane.showMessageDialog(null, "Reguistro Insertado con exito!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 1. de BD Alta\n" +ex);
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuGeneral abrirVentMenu = new MenuGeneral();
        abrirVentMenu.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {//inicia try
            con.conectarBDOracle();
            DefaultTableModel modeloUsuario = new DefaultTableModel();
            
            this.jtTrabajadores.setModel(modeloUsuario);
            
            con.rs = con.stmt.executeQuery("select * from usuarios");
            ResultSetMetaData rsmd = con.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            
            modeloUsuario.addColumn("Usuario");
            modeloUsuario.addColumn("Password");
            
            while (con.rs.next()) {//inicia while
                Object [] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                    fila [i] = con.rs.getObject(i+1);
                }//termina for
                modeloUsuario.addRow(fila);
            }//termina while
        } catch (SQLException ex) {//inicia catch
            JOptionPane.showMessageDialog(null, "Error 2. de BD Consulta\n" +ex);
        }//termina catch
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTrabajadores;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblTexto3;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panAccesoAdmin;
    private javax.swing.JPanel panGestor;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
