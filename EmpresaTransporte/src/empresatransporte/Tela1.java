package empresatransporte;

public class Tela1 extends javax.swing.JFrame {
    
    
    public String funcao;
    public String tsalario;
    public double horas;
    public double comissao;
    public String carga;
    
    public Tela1() {
    
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btMotorista = new javax.swing.JButton();
        btVendedor = new javax.swing.JButton();
        btExecutar = new javax.swing.JButton();
        btGerenteLogistica = new javax.swing.JButton();
        btGerenteLogistica1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btMotorista.setText("Motorista");
        btMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMotoristaActionPerformed(evt);
            }
        });

        btVendedor.setText("Vendedor");
        btVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendedorActionPerformed(evt);
            }
        });

        btExecutar.setText("Sair");
        btExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExecutarActionPerformed(evt);
            }
        });

        btGerenteLogistica.setText("Gerente de logistica");
        btGerenteLogistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenteLogisticaActionPerformed(evt);
            }
        });

        btGerenteLogistica1.setText("Gerente de vendas");
        btGerenteLogistica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenteLogistica1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGerenteLogistica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMotorista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGerenteLogistica1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btMotorista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGerenteLogistica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGerenteLogistica1)
                .addGap(26, 26, 26)
                .addComponent(btExecutar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExecutarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExecutarActionPerformed

    private void btMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMotoristaActionPerformed
        Tela2Motorista tmoto = new Tela2Motorista();
        tmoto.setVisible(true);
    }//GEN-LAST:event_btMotoristaActionPerformed

    private void btVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendedorActionPerformed
        Tela2Vendedor tvend = new Tela2Vendedor();
        tvend.setVisible(true);
    }//GEN-LAST:event_btVendedorActionPerformed

    private void btGerenteLogisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerenteLogisticaActionPerformed
        Tela2GerenteLogistica tgerentelog = new Tela2GerenteLogistica();
        tgerentelog.setVisible(true);
    }//GEN-LAST:event_btGerenteLogisticaActionPerformed

    private void btGerenteLogistica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerenteLogistica1ActionPerformed
        Tela2GerenteVendas tgerenteven = new Tela2GerenteVendas();
        tgerenteven.setVisible(true);
    }//GEN-LAST:event_btGerenteLogistica1ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExecutar;
    private javax.swing.JButton btGerenteLogistica;
    private javax.swing.JButton btGerenteLogistica1;
    private javax.swing.JButton btMotorista;
    private javax.swing.JButton btVendedor;
    // End of variables declaration//GEN-END:variables
}
