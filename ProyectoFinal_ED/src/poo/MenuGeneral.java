
package poo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MenuGeneral extends javax.swing.JFrame {
    
    ImageIcon icon = new ImageIcon("src/imagenes/warning.gif");
    
    public MenuGeneral() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panInicio = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblImgLogo = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();
        btnAccesoTrabajador = new javax.swing.JButton();
        btnAccesoAdmin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuOpciones = new javax.swing.JMenu();
        mnuIAdministrador = new javax.swing.JMenuItem();
        mnuITrabajador = new javax.swing.JMenuItem();
        mnuIInforme = new javax.swing.JMenuItem();
        sp1 = new javax.swing.JPopupMenu.Separator();
        sp2 = new javax.swing.JPopupMenu.Separator();
        mnuISalir = new javax.swing.JMenuItem();
        mnuVersion = new javax.swing.JMenu();
        mnuIAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Registro Inicio Agustin");

        panInicio.setBackground(new java.awt.Color(51, 153, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Sistema de Registro de Asistencias");

        lblImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpeg"))); // NOI18N

        lblTexto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("Recordatorio que su cuenta, matricula y contraseña son unicas e intransferibles");

        lblTexto2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTexto2.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto2.setText("¡Nunca las comparta!");

        btnAccesoTrabajador.setBackground(new java.awt.Color(255, 255, 51));
        btnAccesoTrabajador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAccesoTrabajador.setText("Acceso Trabajador");
        btnAccesoTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoTrabajadorActionPerformed(evt);
            }
        });

        btnAccesoAdmin.setBackground(new java.awt.Color(51, 153, 255));
        btnAccesoAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAccesoAdmin.setText("Acceso Administrador");

        javax.swing.GroupLayout panInicioLayout = new javax.swing.GroupLayout(panInicio);
        panInicio.setLayout(panInicioLayout);
        panInicioLayout.setHorizontalGroup(
            panInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInicioLayout.createSequentialGroup()
                .addGroup(panInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInicioLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblTexto))
                    .addGroup(panInicioLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(lblImgLogo))
                    .addGroup(panInicioLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(lblTitulo))
                    .addGroup(panInicioLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(lblTexto2))
                    .addGroup(panInicioLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnAccesoTrabajador)
                        .addGap(156, 156, 156)
                        .addComponent(btnAccesoAdmin)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        panInicioLayout.setVerticalGroup(
            panInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInicioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblImgLogo)
                .addGap(18, 18, 18)
                .addGroup(panInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccesoTrabajador)
                    .addComponent(btnAccesoAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTexto2)
                .addGap(16, 16, 16))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 153, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 153, 0)));

        mnuOpciones.setText("Opciones");

        mnuIAdministrador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuIAdministrador.setText("Administrador");
        mnuIAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIAdministradorActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuIAdministrador);

        mnuITrabajador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuITrabajador.setText("Trabajador");
        mnuITrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuITrabajadorActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuITrabajador);

        mnuIInforme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuIInforme.setText("Informe de Salario");
        mnuIInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIInformeActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuIInforme);
        mnuOpciones.add(sp1);
        mnuOpciones.add(sp2);

        mnuISalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuISalir.setText("Salir");
        mnuISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuISalirActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuISalir);

        jMenuBar1.add(mnuOpciones);

        mnuVersion.setText("Versión");

        mnuIAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuIAcerca.setText("Acerca de ...");
        mnuVersion.add(mnuIAcerca);

        jMenuBar1.add(mnuVersion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuITrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuITrabajadorActionPerformed
        Trabajadores abrirVentTrabajadores = new Trabajadores(); //llamado de la clase
        abrirVentTrabajadores.setVisible(true);//visualiza ventana
        this.hide();//oculta ventana anterior
    }//GEN-LAST:event_mnuITrabajadorActionPerformed

    private void btnAccesoTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesoTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccesoTrabajadorActionPerformed

    private void mnuIAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIAdministradorActionPerformed
        Administradores abrirVentAdministradores = new Administradores(); //llamado de la clase
        abrirVentAdministradores.setVisible(true);//visualiza ventana
        this.hide();//oculta ventana anterior
    }//GEN-LAST:event_mnuIAdministradorActionPerformed

    private void mnuIInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIInformeActionPerformed
        ResumenDias abrirVentResumDias = new ResumenDias(); //llamado de la clase
        abrirVentResumDias.setVisible(true);//visualiza ventana
        this.hide();//oculta ventana anterior
    }//GEN-LAST:event_mnuIInformeActionPerformed

    private void mnuISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuISalirActionPerformed
        System.exit(0);//cierra ventana
        JOptionPane.showMessageDialog(null, "Saliendo del sistema, Todos los cambios se han guardado con exito!...");
    }//GEN-LAST:event_mnuISalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccesoAdmin;
    private javax.swing.JButton btnAccesoTrabajador;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnuIAcerca;
    private javax.swing.JMenuItem mnuIAdministrador;
    private javax.swing.JMenuItem mnuIInforme;
    private javax.swing.JMenuItem mnuISalir;
    private javax.swing.JMenuItem mnuITrabajador;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenu mnuVersion;
    private javax.swing.JPanel panInicio;
    private javax.swing.JPopupMenu.Separator sp1;
    private javax.swing.JPopupMenu.Separator sp2;
    // End of variables declaration//GEN-END:variables
}
