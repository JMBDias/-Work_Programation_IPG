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
public class Menu_EEMI_SAV_SIM extends javax.swing.JFrame {

    /**
     * Creates new form Menu_PCR
     */
    public Menu_EEMI_SAV_SIM() {
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
        Label_Procedimento_SAV = new javax.swing.JLabel();
        Label_RCE = new javax.swing.JLabel();
        RCE_S = new javax.swing.JButton();
        RCE_N = new javax.swing.JButton();
        Label_Hora_Inicio_SAV = new javax.swing.JLabel();
        Hora_Inicio_SAV = new javax.swing.JFormattedTextField();
        SAV_Ventilacao = new javax.swing.JCheckBox();
        SAV_CTE = new javax.swing.JCheckBox();
        SAV_Desfibrlhação = new javax.swing.JCheckBox();
        SAV_Farmacos = new javax.swing.JCheckBox();
        Label_Hora_Inicio_SAV1 = new javax.swing.JLabel();
        Hora_Inicio_SAV1 = new javax.swing.JFormattedTextField();
        EEMI_SAV_SIM_VOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jDesktopPanePCR1.setBackground(new java.awt.Color(242, 242, 242));
        jDesktopPanePCR1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EEMI SAV SIM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        jDesktopPanePCR1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        Label_Procedimento_SAV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Procedimento_SAV.setText("Procedimentos SAV");

        Label_RCE.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_RCE.setText("RCE");

        RCE_S.setBackground(new java.awt.Color(242, 242, 242));
        RCE_S.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        RCE_S.setText("Sim");
        RCE_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCE_SActionPerformed(evt);
            }
        });

        RCE_N.setBackground(new java.awt.Color(242, 242, 242));
        RCE_N.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        RCE_N.setText("Nao");
        RCE_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCE_NActionPerformed(evt);
            }
        });

        Label_Hora_Inicio_SAV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Hora_Inicio_SAV.setText("Hora Inicio SAV:");

        Hora_Inicio_SAV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        Hora_Inicio_SAV.setText("00:00");
        Hora_Inicio_SAV.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Hora_Inicio_SAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hora_Inicio_SAVActionPerformed(evt);
            }
        });

        SAV_Ventilacao.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SAV_Ventilacao.setText("Ventilação");

        SAV_CTE.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SAV_CTE.setText("CTE");

        SAV_Desfibrlhação.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SAV_Desfibrlhação.setText("Desfibrilhação");

        SAV_Farmacos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SAV_Farmacos.setText("Fármacos");

        Label_Hora_Inicio_SAV1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Hora_Inicio_SAV1.setText("Hora 1º Choque");

        Hora_Inicio_SAV1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        Hora_Inicio_SAV1.setText("00:00");
        Hora_Inicio_SAV1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Hora_Inicio_SAV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hora_Inicio_SAV1ActionPerformed(evt);
            }
        });

        EEMI_SAV_SIM_VOLTAR.setBackground(new java.awt.Color(242, 242, 242));
        EEMI_SAV_SIM_VOLTAR.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        EEMI_SAV_SIM_VOLTAR.setText("Voltar");
        EEMI_SAV_SIM_VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EEMI_SAV_SIM_VOLTARActionPerformed(evt);
            }
        });

        jDesktopPanePCR1.setLayer(Label_Procedimento_SAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Label_RCE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(RCE_S, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(RCE_N, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Label_Hora_Inicio_SAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Hora_Inicio_SAV, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(SAV_Ventilacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(SAV_CTE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(SAV_Desfibrlhação, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(SAV_Farmacos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Label_Hora_Inicio_SAV1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(Hora_Inicio_SAV1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanePCR1.setLayer(EEMI_SAV_SIM_VOLTAR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanePCR1Layout = new javax.swing.GroupLayout(jDesktopPanePCR1);
        jDesktopPanePCR1.setLayout(jDesktopPanePCR1Layout);
        jDesktopPanePCR1Layout.setHorizontalGroup(
            jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Label_Hora_Inicio_SAV, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(Label_Procedimento_SAV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hora_Inicio_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                                        .addComponent(SAV_CTE)
                                        .addGap(41, 41, 41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePCR1Layout.createSequentialGroup()
                                        .addComponent(SAV_Ventilacao)
                                        .addGap(18, 18, 18)))
                                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SAV_Farmacos)
                                    .addComponent(SAV_Desfibrlhação)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePCR1Layout.createSequentialGroup()
                        .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Hora_Inicio_SAV1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_RCE, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                                .addComponent(RCE_S)
                                .addGap(18, 18, 18)
                                .addComponent(RCE_N, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Hora_Inicio_SAV1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePCR1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EEMI_SAV_SIM_VOLTAR)
                .addContainerGap())
        );
        jDesktopPanePCR1Layout.setVerticalGroup(
            jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanePCR1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Hora_Inicio_SAV)
                    .addComponent(Hora_Inicio_SAV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Procedimento_SAV)
                    .addComponent(SAV_Ventilacao)
                    .addComponent(SAV_Desfibrlhação))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SAV_CTE)
                    .addComponent(SAV_Farmacos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Hora_Inicio_SAV1)
                    .addComponent(Hora_Inicio_SAV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPanePCR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RCE_S)
                    .addComponent(Label_RCE)
                    .addComponent(RCE_N))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EEMI_SAV_SIM_VOLTAR))
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
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPanePCR1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RCE_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCE_NActionPerformed
        // TODO add your handling code here:
        Menu_RCE_Nao menuRCE_Nao = new Menu_RCE_Nao();
    
        // Configura o JFrame para fechar apenas o Menu_EEMI_SAV_Nao ao ser fechado
         menuRCE_Nao.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Torna o Menu_Destino visível
         menuRCE_Nao.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_RCE_NActionPerformed

    private void RCE_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCE_SActionPerformed
        // TODO add your handling code here:
        Menu_RCE_Sim menuRCE_Sim = new Menu_RCE_Sim();
    
        // Configura o JFrame para fechar apenas o Menu_EEMI_SAV_Nao ao ser fechado
         menuRCE_Sim.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        // Torna o Menu_Destino visível
         menuRCE_Sim.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_RCE_SActionPerformed

    private void Hora_Inicio_SAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hora_Inicio_SAVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hora_Inicio_SAVActionPerformed

    private void Hora_Inicio_SAV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hora_Inicio_SAV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hora_Inicio_SAV1ActionPerformed

    private void EEMI_SAV_SIM_VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEMI_SAV_SIM_VOLTARActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_EEMI_SAV_SIM_VOLTARActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_EEMI_SAV_SIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_EEMI_SAV_SIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_EEMI_SAV_SIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_EEMI_SAV_SIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_EEMI_SAV_SIM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EEMI_SAV_SIM_VOLTAR;
    private javax.swing.JFormattedTextField Hora_Inicio_SAV;
    private javax.swing.JFormattedTextField Hora_Inicio_SAV1;
    private javax.swing.JLabel Label_Hora_Inicio_SAV;
    private javax.swing.JLabel Label_Hora_Inicio_SAV1;
    private javax.swing.JLabel Label_Procedimento_SAV;
    private javax.swing.JLabel Label_RCE;
    private javax.swing.JButton RCE_N;
    private javax.swing.JButton RCE_S;
    private javax.swing.JCheckBox SAV_CTE;
    private javax.swing.JCheckBox SAV_Desfibrlhação;
    private javax.swing.JCheckBox SAV_Farmacos;
    private javax.swing.JCheckBox SAV_Ventilacao;
    private javax.swing.JDesktopPane jDesktopPanePCR1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
