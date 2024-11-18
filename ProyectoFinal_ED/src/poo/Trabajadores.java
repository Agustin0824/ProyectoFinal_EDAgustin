
package poo;

import conexion.ConectarBD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import vista.Trabajador;

public class Trabajadores extends javax.swing.JFrame {
    
    ArrayList <Trabajador> listaTrabajadores = new ArrayList();
    Trabajador ingresoTrabajador;
    ConectarBD conexion = new ConectarBD(); 
    
    public Trabajadores() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panInforme = new javax.swing.JPanel();
        panBuscador = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblTitulo2 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtInforme = new javax.swing.JTable();
        btnRegresar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informe de Salario Agustin");

        panInforme.setBackground(new java.awt.Color(255, 255, 51));
        panInforme.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));

        panBuscador.setBackground(new java.awt.Color(102, 204, 0));
        panBuscador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscador Trabajador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        lblMatricula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMatricula.setText("Matricula");

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBuscadorLayout = new javax.swing.GroupLayout(panBuscador);
        panBuscador.setLayout(panBuscadorLayout);
        panBuscadorLayout.setHorizontalGroup(
            panBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuscadorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre)
                    .addComponent(lblMatricula))
                .addGap(42, 42, 42)
                .addGroup(panBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addGroup(panBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addComponent(txtMatricula)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panBuscadorLayout.setVerticalGroup(
            panBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuscadorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addContainerGap())
        );

        lblTitulo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo2.setText("Informe Semanal de Salario");

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescripcion.setText("Si detecta alguna anomalía en la información mostrada en la tabla, acuda con su TeamLeader para reportar la situación");

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar Información");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jtInforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Horas laboradas", "Días laborados", "Salario final"
            }
        ));
        jScrollPane2.setViewportView(jtInforme);

        btnRegresar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar2.setText("Regresar a Inicio");
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panInformeLayout = new javax.swing.GroupLayout(panInforme);
        panInforme.setLayout(panInformeLayout);
        panInformeLayout.setHorizontalGroup(
            panInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInformeLayout.createSequentialGroup()
                .addGroup(panInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInformeLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInformeLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lblDescripcion))
                    .addGroup(panInformeLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(lblTitulo2)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInformeLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnRegresar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(256, 256, 256))
        );
        panInformeLayout.setVerticalGroup(
            panInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInformeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInformeLayout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegresar2))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panInforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panInforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        MenuGeneral abrirVentMenu = new MenuGeneral();
        abrirVentMenu.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnRegresar2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {//inicia try
            con.conectarBDOracle();
            DefaultTableModel modeloTrabajador = new DefaultTableModel();
            
            this.jtInforme.setModel(modeloTrabajador);
            
            con.rs = con.stmt.executeQuery("select * from usuarios");
            ResultSetMetaData rsmd = con.rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            
            modeloTrabajador.addColumn("Matricula");
            modeloTrabajador.addColumn("Nombre");
            modeloTrabajador.addColumn("Horas laboradas");
            modeloTrabajador.addColumn("Días laborados");
            modeloTrabajador.addColumn("Salario final");
            
            while (con.rs.next()) {//inicia while
                Object [] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                    fila [i] = con.rs.getObject(i+1);
                }//termina for
                modeloTrabajador.addRow(fila);
            }//termina while
        } catch (SQLException ex) {//inicia catch
            JOptionPane.showMessageDialog(null, "Error 2. de BD Consulta\n" +ex);
        }//termina catch
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Trabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trabajadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtInforme;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JPanel panBuscador;
    private javax.swing.JPanel panInforme;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
