
package bancodelbienestar;


public class VPrincipal extends javax.swing.JFrame {

   Administrador cuentas;
    public VPrincipal() {
        cuentas= new Administrador();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        altas = new javax.swing.JMenu();
        eliminar = new javax.swing.JMenu();
        cambios = new javax.swing.JMenu();
        buscar = new javax.swing.JMenu();
        SaldoCuenta = new javax.swing.JMenu();
        cargos = new javax.swing.JMenu();
        abonos = new javax.swing.JMenu();
        saldocuenta = new javax.swing.JMenu();
        reportes = new javax.swing.JMenu();
        salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jMenu1.setText("Gestión Cuentas");

        altas.setText("Altas");
        altas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                altasMouseClicked(evt);
            }
        });
        jMenu1.add(altas);

        eliminar.setText("Eliminar");
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        jMenu1.add(eliminar);

        cambios.setText("Cambios");
        cambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiosMouseClicked(evt);
            }
        });
        jMenu1.add(cambios);

        buscar.setText("Buscar");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        jMenu1.add(buscar);

        jMenuBar1.add(jMenu1);

        SaldoCuenta.setText("Movimientos Cuenta");

        cargos.setText("Cargos");
        cargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargosMouseClicked(evt);
            }
        });
        SaldoCuenta.add(cargos);

        abonos.setText("Abonos");
        abonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abonosMouseClicked(evt);
            }
        });
        SaldoCuenta.add(abonos);

        saldocuenta.setText("Saldo Cuenta");
        saldocuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saldocuentaMouseClicked(evt);
            }
        });
        SaldoCuenta.add(saldocuenta);

        jMenuBar1.add(SaldoCuenta);

        reportes.setText("Reportes");
        reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportesMouseClicked(evt);
            }
        });
        jMenuBar1.add(reportes);

        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        Eliminar eliminar = new Eliminar(cuentas);
        escritorio.add(eliminar);
        eliminar.setVisible(true);
    }//GEN-LAST:event_eliminarMouseClicked

    private void reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportesMouseClicked
        VReportes reportes = new VReportes(cuentas);
        escritorio.add(reportes);
        reportes.setVisible(true);
    }//GEN-LAST:event_reportesMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        cuentas.close();
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void cargosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargosMouseClicked
        Cargos cargos = new Cargos(cuentas);
        escritorio.add(cargos);
        cargos.setVisible(true);
    }//GEN-LAST:event_cargosMouseClicked

    private void abonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abonosMouseClicked
        Abonos abonos = new Abonos(cuentas);
        escritorio.add(abonos);
        abonos.setVisible(true);
    }//GEN-LAST:event_abonosMouseClicked

    private void saldocuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saldocuentaMouseClicked
        SaldoCuenta saldo = new SaldoCuenta(cuentas);
        escritorio.add(saldo);
        saldo.setVisible(true);
    }//GEN-LAST:event_saldocuentaMouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        Buscar buscar = new Buscar(cuentas);
        escritorio.add(buscar);
        buscar.setVisible(true);
    }//GEN-LAST:event_buscarMouseClicked

    private void altasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altasMouseClicked
       Altas altasform = new Altas(cuentas);
       escritorio.add(altasform);
       altasform.setVisible(true);
    }//GEN-LAST:event_altasMouseClicked

    private void cambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiosMouseClicked
       VCambios form = new VCambios(cuentas);
       escritorio.add(form);
       form.setVisible(true);
    }//GEN-LAST:event_cambiosMouseClicked

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu SaldoCuenta;
    private javax.swing.JMenu abonos;
    private javax.swing.JMenu altas;
    private javax.swing.JMenu buscar;
    private javax.swing.JMenu cambios;
    private javax.swing.JMenu cargos;
    private javax.swing.JMenu eliminar;
    private javax.swing.JPanel escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu reportes;
    private javax.swing.JMenu saldocuenta;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
