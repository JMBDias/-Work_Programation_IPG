/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import classesApp.Destino;
import java.awt.*;
import classesApp.Quem_Ativa;
import java.util.List;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author GASS
 */
public class Menu_Destino extends javax.swing.JFrame {

     /**
     * Creates new form Menu_Destino
     */
    
    
    public Menu_Destino() {
    
        Servico = new JComboBox<>();
        Instituicao = new JComboBox<>();
        
        initComponents();
        setupComboBox();
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
        jDesktopPaneDestino = new javax.swing.JDesktopPane();
        Label_Destino_Serviço = new javax.swing.JLabel();
        Label_Destino_Instituição = new javax.swing.JLabel();
        Label_Destino_Gravar = new javax.swing.JLabel();
        Destino_Gravar_S = new javax.swing.JButton();
        Destino_Gravar_N = new javax.swing.JButton();
        Servico = new javax.swing.JComboBox<>();
        Instituicao = new javax.swing.JComboBox<>();
        DESTINO_VOLTAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jDesktopPaneDestino.setBackground(new java.awt.Color(242, 242, 242));
        jDesktopPaneDestino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N
        jDesktopPaneDestino.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        Label_Destino_Serviço.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Destino_Serviço.setText("Serviço");

        Label_Destino_Instituição.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Destino_Instituição.setText("Instituição");

        Label_Destino_Gravar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Label_Destino_Gravar.setText("Gravar");

        Destino_Gravar_S.setBackground(new java.awt.Color(242, 242, 242));
        Destino_Gravar_S.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Destino_Gravar_S.setText("Sim");
        Destino_Gravar_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Destino_Gravar_SActionPerformed(evt);
            }
        });

        Destino_Gravar_N.setBackground(new java.awt.Color(242, 242, 242));
        Destino_Gravar_N.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Destino_Gravar_N.setText("Nao");
        Destino_Gravar_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Destino_Gravar_NActionPerformed(evt);
            }
        });

        Servico.setBackground(new java.awt.Color(242, 242, 242));
        Servico.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicoActionPerformed(evt);
            }
        });

        Instituicao.setBackground(new java.awt.Color(242, 242, 242));
        Instituicao.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Instituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstituicaoActionPerformed(evt);
            }
        });

        DESTINO_VOLTAR.setBackground(new java.awt.Color(242, 242, 242));
        DESTINO_VOLTAR.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        DESTINO_VOLTAR.setText("Voltar");
        DESTINO_VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESTINO_VOLTARActionPerformed(evt);
            }
        });

        jDesktopPaneDestino.setLayer(Label_Destino_Serviço, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneDestino.setLayer(Label_Destino_Instituição, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneDestino.setLayer(Label_Destino_Gravar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneDestino.setLayer(Destino_Gravar_S, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneDestino.setLayer(Destino_Gravar_N, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneDestino.setLayer(Servico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneDestino.setLayer(Instituicao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPaneDestino.setLayer(DESTINO_VOLTAR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneDestinoLayout = new javax.swing.GroupLayout(jDesktopPaneDestino);
        jDesktopPaneDestino.setLayout(jDesktopPaneDestinoLayout);
        jDesktopPaneDestinoLayout.setHorizontalGroup(
            jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Label_Destino_Instituição, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(Label_Destino_Serviço, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Label_Destino_Gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPaneDestinoLayout.createSequentialGroup()
                        .addComponent(Destino_Gravar_S, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Destino_Gravar_N, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DESTINO_VOLTAR)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Servico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Instituicao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPaneDestinoLayout.setVerticalGroup(
            jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneDestinoLayout.createSequentialGroup()
                .addGroup(jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Destino_Serviço)
                    .addComponent(Servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Destino_Instituição)
                    .addComponent(Instituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Destino_Gravar_N)
                        .addComponent(DESTINO_VOLTAR))
                    .addGroup(jDesktopPaneDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Destino_Gravar_S)
                        .addComponent(Label_Destino_Gravar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Servico.getAccessibleContext().setAccessibleName("Servico");
        Instituicao.getAccessibleContext().setAccessibleName("Instituicao");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jDesktopPaneDestino)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPaneDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setupComboBox() {
        Servico.addItem("-");
        Instituicao.addItem("-");
    
        List<Destino> servicos = Destino.getAllDestinos();
        for (Destino destino : servicos) {
            Servico.addItem(destino.getSERVICO());
        }
        List<Destino> instituicoes = Destino.getAllDestinos();
        for (Destino destino : instituicoes) {
            Instituicao.addItem(destino.getINSTITUICAO());
        }
    }
    private void setupOptions() {
     
    }

    private void InstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstituicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstituicaoActionPerformed

    private void ServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServicoActionPerformed

    private void Destino_Gravar_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Destino_Gravar_NActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Destino_Gravar_NActionPerformed

    private void Destino_Gravar_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Destino_Gravar_SActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Destino_Gravar_SActionPerformed

    private void DESTINO_VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESTINO_VOLTARActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_DESTINO_VOLTARActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Destino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Destino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Destino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Destino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Destino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DESTINO_VOLTAR;
    private javax.swing.JButton Destino_Gravar_N;
    private javax.swing.JButton Destino_Gravar_S;
    private javax.swing.JComboBox<String> Instituicao;
    private javax.swing.JLabel Label_Destino_Gravar;
    private javax.swing.JLabel Label_Destino_Instituição;
    private javax.swing.JLabel Label_Destino_Serviço;
    private javax.swing.JComboBox<String> Servico;
    private javax.swing.JDesktopPane jDesktopPaneDestino;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
