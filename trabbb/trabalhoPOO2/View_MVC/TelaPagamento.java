/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_MVC;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author xpimenta
 */
public class TelaPagamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form MarcaConsultaa
     */
    public TelaPagamento() {
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

        JPanel_MenuPrincipal_Cadastro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botaoConfirma = new javax.swing.JButton();
        botaoCancela = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(457, 300));

        JPanel_MenuPrincipal_Cadastro.setBackground(new java.awt.Color(248, 248, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel2.setText("Pagamento");

        botaoConfirma.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        botaoConfirma.setIcon(new javax.swing.ImageIcon("A:\\Bibliotecas\\Documentos\\POO2\\trabbb\\trabalhoPOO2\\View_MVC\\Icons\\icons8-checkmark-64.png")); // NOI18N
        botaoConfirma.setText("Gerar Recibo");
        botaoConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaActionPerformed(evt);
            }
        });

        botaoCancela.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        botaoCancela.setIcon(new javax.swing.ImageIcon("A:\\Bibliotecas\\Documentos\\POO2\\trabbb\\trabalhoPOO2\\View_MVC\\Icons\\icons8-cancel-64.png")); // NOI18N
        botaoCancela.setText("RecebePagamento");
        botaoCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel_MenuPrincipal_CadastroLayout = new javax.swing.GroupLayout(JPanel_MenuPrincipal_Cadastro);
        JPanel_MenuPrincipal_Cadastro.setLayout(JPanel_MenuPrincipal_CadastroLayout);
        JPanel_MenuPrincipal_CadastroLayout.setHorizontalGroup(
            JPanel_MenuPrincipal_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MenuPrincipal_CadastroLayout.createSequentialGroup()
                .addGroup(JPanel_MenuPrincipal_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_MenuPrincipal_CadastroLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(botaoCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(JPanel_MenuPrincipal_CadastroLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_MenuPrincipal_CadastroLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(botaoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_MenuPrincipal_CadastroLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel_MenuPrincipal_CadastroLayout.setVerticalGroup(
            JPanel_MenuPrincipal_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_MenuPrincipal_CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(botaoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanel_MenuPrincipal_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_MenuPrincipal_CadastroLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel10))
                    .addGroup(JPanel_MenuPrincipal_CadastroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botaoCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_MenuPrincipal_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_MenuPrincipal_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoConfirmaActionPerformed

    private void botaoCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCancelaActionPerformed

    public JButton getBotaoCancela() {
        return botaoCancela;
    }

    public JButton getBotaoConfirma() {
        return botaoConfirma;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

 


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_MenuPrincipal_Cadastro;
    private javax.swing.JButton botaoCancela;
    private javax.swing.JButton botaoConfirma;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
