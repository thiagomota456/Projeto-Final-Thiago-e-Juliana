/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ManipulaçãoDeDados.Arquivo;
import javax.swing.JOptionPane;

/**
 *
 * @author juliana
 */
public class DadosDoAutor extends javax.swing.JInternalFrame {

    /**
     * Creates new form jfcadastro
     */
    public DadosDoAutor() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        primeiroNome = new javax.swing.JTextField();
        segundoNome = new javax.swing.JTextField();
        incluir = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Autor");
        setDoubleBuffered(true);

        jLabel1.setText("Dados do Autor");

        jLabel2.setText("Primeiro Nome: ");

        jLabel3.setText("Segundo Nome: ");

        primeiroNome.setName("primeiroNome"); // NOI18N

        segundoNome.setName("segundoNome"); // NOI18N

        incluir.setText("Incluir");
        incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirActionPerformed(evt);
            }
        });

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(incluir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(primeiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(pesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)))
                .addGap(80, 80, 80))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelar, incluir, pesquisar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {primeiroNome, segundoNome});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(primeiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(segundoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incluir)
                    .addComponent(pesquisar)
                    .addComponent(cancelar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpar(){
        primeiroNome.setText("");
        segundoNome.setText("");
    }
    private void incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirActionPerformed
        // TODO add your handling code here:
        String pNome = primeiroNome.getText();
        String sNome = segundoNome.getText();
        
        limpar();
        
        String autor = pNome + " " + sNome;
        
        Arquivo.gravarEmArquivo("Autores.txt", autor);
        
        
    }//GEN-LAST:event_incluirActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_cancelarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed

        Integer ind = null;
        Arquivo a = new Arquivo("Autores.txt");
        
        a.listarPorLinha();
        
        String pNome = primeiroNome.getText();
        String sNome = segundoNome.getText();
        
        //pesquisar com o primeiro nome
        if(!((pNome.equals("")) || (pNome.equals(" ")))){
            for(int i = 0; i < a.sizeList(); i++){
                if(a.getElementoLista(i).toLowerCase().contains(pNome.toLowerCase())){
                    ind = i;
                    break;
                }
            }
            if(ind != null)
                JOptionPane.showMessageDialog(null,"O autor que procura é: " + a.getElementoLista(ind) + ". \n"
                    + "Ele é o " + (ind + 1) + " elemento da lista");
            else
                JOptionPane.showMessageDialog(null, "Não encontramos");
        
        //pesquisar com segundo nome
        }else if(!((sNome.equals("")) || (sNome.equals(" ")))){
            
            for(int i = 0; i < a.sizeList(); i++){
                if(a.getElementoLista(i).toLowerCase().contains(sNome.toLowerCase())){
                    ind = i;
                    break;
                }
            }
            if(ind != null)
                JOptionPane.showMessageDialog(null,"O autor que procura é: " + a.getElementoLista(ind) + ". \n"
                    + "Ele é o " + (ind + 1) + " elemento da lista");
            else
                JOptionPane.showMessageDialog(null, "Não encontramos");
        
        }
               
    }//GEN-LAST:event_pesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton incluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTextField primeiroNome;
    private javax.swing.JTextField segundoNome;
    // End of variables declaration//GEN-END:variables
}
