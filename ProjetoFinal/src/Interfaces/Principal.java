
package Interfaces;

/**
 *
 * @author Juliana Xavier Silva e Thiago Soares Mota
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInterno = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        DadosDoAutor = new javax.swing.JMenuItem();
        DadosDaEditora = new javax.swing.JMenuItem();
        DadosDoLivro = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        painelInterno.setBackground(new java.awt.Color(255, 255, 255));
        painelInterno.setBorder(null);
        painelInterno.setForeground(new java.awt.Color(255, 255, 255));
        painelInterno.setToolTipText("");
        painelInterno.setDoubleBuffered(true);
        painelInterno.setEnabled(false);
        painelInterno.setFocusTraversalPolicy(null);
        painelInterno.setOpaque(false);
        getContentPane().add(painelInterno);
        painelInterno.setBounds(0, 0, 950, 670);

        mainMenu.setText("Cadastro");
        mainMenu.setIconTextGap(6);
        mainMenu.setMaximumSize(new java.awt.Dimension(71, 92767));

        DadosDoAutor.setText("Dados do Autor");
        DadosDoAutor.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                DadosDoAutorComponentShown(evt);
            }
        });
        DadosDoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadosDoAutorActionPerformed(evt);
            }
        });
        mainMenu.add(DadosDoAutor);

        DadosDaEditora.setText("Dados da Editora");
        DadosDaEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadosDaEditoraActionPerformed(evt);
            }
        });
        mainMenu.add(DadosDaEditora);

        DadosDoLivro.setText("Dados do Livro");
        DadosDoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadosDoLivroActionPerformed(evt);
            }
        });
        mainMenu.add(DadosDoLivro);

        jMenuBar1.add(mainMenu);

        exit.setText("Sair");
        exit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                exitStateChanged(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 952, 678);
    }// </editor-fold>//GEN-END:initComponents

    private void DadosDoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadosDoAutorActionPerformed
        DadosDoAutor dadosDoAutor = new DadosDoAutor();
        painelInterno.add(dadosDoAutor);
        dadosDoAutor.setVisible(true);
    }//GEN-LAST:event_DadosDoAutorActionPerformed

    private void DadosDaEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadosDaEditoraActionPerformed
        DadosEditora dadosEditora = new DadosEditora();
        painelInterno.add(dadosEditora);
        dadosEditora.setVisible(true);
    }//GEN-LAST:event_DadosDaEditoraActionPerformed

    private void DadosDoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadosDoLivroActionPerformed
        DadosLivro dadosLivros = new DadosLivro();
        painelInterno.add(dadosLivros);
        dadosLivros.setVisible(true);
    }//GEN-LAST:event_DadosDoLivroActionPerformed

    private void DadosDoAutorComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DadosDoAutorComponentShown

        
    }//GEN-LAST:event_DadosDoAutorComponentShown

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_exitActionPerformed

    private void exitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_exitStateChanged
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitStateChanged

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DadosDaEditora;
    private javax.swing.JMenuItem DadosDoAutor;
    private javax.swing.JMenuItem DadosDoLivro;
    private javax.swing.JMenu exit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JDesktopPane painelInterno;
    // End of variables declaration//GEN-END:variables
}
