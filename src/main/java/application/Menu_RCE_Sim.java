/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import javax.swing.*;

/**
 *
 * @author GASS
 */
public class Menu_RCE_Sim extends javax.swing.JFrame {

    /**
     * Creates new form Menu_PCR
     */
    public Menu_RCE_Sim() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jDesktopPanePCR1 = new javax.swing.JDesktopPane();
        RCE_Sim_Seguinte = new javax.swing.JButton();
        Label_Hora_Inicio_SAV = new javax.swing.JLabel();
        Hora_Inicio_SAV = new javax.swing.JFormattedTextField();
        EEMI_RCE_SIM_VOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jDesktopPanePCR1.setBackground(new java.awt.Color(242, 242, 242));
        jDesktopPanePCR1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RCE Sim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        jDesktopPanePCR1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        RCE_Sim_Seguinte.setBackground(new java.awt.Color(242, 242, 242));
        RCE_Sim_Seguinte.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        RCE_Sim_Seguinte.setText("Seguinte");
        RCE_Sim_Seguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCE_Sim_SeguinteActionPerformed(evt);
            }
        });

        Label_Hora_Inicio_SAV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Hora_Inicio_SAV.setText("Hora RCE:");

        Hora_Inicio_SAV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        Hora_Inicio_SAV.setText("00:00");
        Hora_Inicio_SAV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Hora_Inicio_SAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hora_Inicio_SAVActionPerformed(evt);
            }
        });

        EEMI_RCE_SIM_VOLTAR.setBackground(new java.awt.Color(242, 242, 242));
        EEMI_RCE_SIM_VOLTAR.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        EEMI_RCE_SIM_VOLTAR.setText("Voltar");
        EEMI_RCE_SIM_VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EEMI_RCE_SIM_VOLTARActionPerformed(evt);
            }
        });

        jDesktopPanePCR1.setLayer(RCE_Sim_Seguinte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Label_Hora_Inicio_SAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Hora_Inicio_SAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(EEMI_RCE_SIM_VOLTAR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanePCR1Layout = new javax.swing.GroupLayout(jDesktopPanePCR1);
        jDesktopPanePCR1.setLayout(jDesktopPanePCR1Layout);
        jDesktopPanePCR1Layout.setHorizontalGroup(
            jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePCR1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Hora_Inicio_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                        .addComponent(RCE_Sim_Seguinte)
                        .addGap(18, 18, 18)
                        .addComponent(EEMI_RCE_SIM_VOLTAR))
                    .addComponent(Hora_Inicio_SAV))
                .addContainerGap())
        );
        jDesktopPanePCR1Layout.setVerticalGroup(
            jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Hora_Inicio_SAV)
                    .addComponent(Hora_Inicio_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RCE_Sim_Seguinte)
                    .addComponent(EEMI_RCE_SIM_VOLTAR))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPanePCR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPanePCR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RCE_Sim_SeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCE_Sim_SeguinteActionPerformed
        // TODO add your handling code here:
        Menu_Destino menuDestino = new Menu_Destino();
    
        // Configura o JFrame para fechar apenas o Menu_EEMI_SAV_Nao ao ser fechado
         menuDestino.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Torna o Menu_Destino visível
         menuDestino.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_RCE_Sim_SeguinteActionPerformed

    private void Hora_Inicio_SAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hora_Inicio_SAVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hora_Inicio_SAVActionPerformed

    private void EEMI_RCE_SIM_VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEMI_RCE_SIM_VOLTARActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_EEMI_RCE_SIM_VOLTARActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_RCE_Sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_RCE_Sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_RCE_Sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_RCE_Sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_RCE_Sim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EEMI_RCE_SIM_VOLTAR;
    private javax.swing.JFormattedTextField Hora_Inicio_SAV;
    private javax.swing.JLabel Label_Hora_Inicio_SAV;
    private javax.swing.JButton RCE_Sim_Seguinte;
    private javax.swing.JDesktopPane jDesktopPanePCR1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
