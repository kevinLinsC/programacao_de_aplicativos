/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author k.andrade
 */
public class mostra_patos extends javax.swing.JFrame {

    /**
     * Creates new form mostra_patos
     */
    public mostra_patos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_mostra_pato = new javax.swing.JTable();
        jlbl_nome = new javax.swing.JLabel();
        jfield_nome = new javax.swing.JTextField();
        jlbl_peso = new javax.swing.JLabel();
        jfield_peso = new javax.swing.JTextField();
        jlbl_velocidade = new javax.swing.JLabel();
        jfield_velocidade = new javax.swing.JTextField();
        jbutton_cadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbl_nome_DA = new javax.swing.JLabel();
        jfield_nome_DA = new javax.swing.JTextField();
        jlbl_peso_DA = new javax.swing.JLabel();
        jfield_peso_DA = new javax.swing.JTextField();
        jlbl_velocidade_DA = new javax.swing.JLabel();
        jfield_velocidade_DA = new javax.swing.JTextField();
        jbutton_deletar = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        jlbl_id_DA = new javax.swing.JLabel();
        jfield_id_DA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jtbl_mostra_pato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_pato", "Nome", "Peso", "Velocidade"
            }
        ));
        jtbl_mostra_pato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_mostra_patoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl_mostra_pato);

        jlbl_nome.setText("Nome:");

        jfield_nome.setOpaque(true);
        jfield_nome.setPreferredSize(new java.awt.Dimension(200, 40));
        jfield_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfield_nomeActionPerformed(evt);
            }
        });

        jlbl_peso.setText("Peso:");

        jfield_peso.setPreferredSize(new java.awt.Dimension(200, 40));

        jlbl_velocidade.setText("Velocidade:");

        jfield_velocidade.setPreferredSize(new java.awt.Dimension(200, 40));
        jfield_velocidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfield_velocidadeActionPerformed(evt);
            }
        });

        jbutton_cadastrar.setText("Cadastrar");
        jbutton_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_cadastrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Cadastrar");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Deletar/Atualizar");

        jlbl_nome_DA.setText("Nome:");

        jfield_nome_DA.setOpaque(true);
        jfield_nome_DA.setPreferredSize(new java.awt.Dimension(200, 40));
        jfield_nome_DA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfield_nome_DAActionPerformed(evt);
            }
        });

        jlbl_peso_DA.setText("Peso:");

        jfield_peso_DA.setPreferredSize(new java.awt.Dimension(200, 40));

        jlbl_velocidade_DA.setText("Velocidade:");

        jfield_velocidade_DA.setPreferredSize(new java.awt.Dimension(200, 40));
        jfield_velocidade_DA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfield_velocidade_DAActionPerformed(evt);
            }
        });

        jbutton_deletar.setText("Deletar");
        jbutton_deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbutton_deletarMouseClicked(evt);
            }
        });

        Atualizar.setText("Atualizar");
        Atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtualizarMouseClicked(evt);
            }
        });

        jlbl_id_DA.setText("ID:");

        jfield_id_DA.setOpaque(true);
        jfield_id_DA.setPreferredSize(new java.awt.Dimension(200, 40));
        jfield_id_DA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfield_id_DAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_nome)
                            .addComponent(jfield_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_peso)
                            .addComponent(jfield_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_velocidade)
                            .addComponent(jfield_velocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jbutton_cadastrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(124, 124, 124)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jlbl_nome_DA)
                    .addComponent(jfield_nome_DA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_peso_DA)
                    .addComponent(jfield_peso_DA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl_velocidade_DA)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbutton_deletar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Atualizar))
                        .addComponent(jfield_velocidade_DA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbl_id_DA)
                    .addComponent(jfield_id_DA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbl_id_DA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfield_id_DA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbl_nome_DA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfield_nome_DA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbl_peso_DA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfield_peso_DA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbl_velocidade_DA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfield_velocidade_DA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbutton_deletar)
                            .addComponent(Atualizar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbl_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfield_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbl_peso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfield_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbl_velocidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfield_velocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbutton_cadastrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(318, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        PopularJTable("SELECT * FROM pato");
    }//GEN-LAST:event_formWindowOpened

    private void jfield_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfield_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfield_nomeActionPerformed

    private void jfield_velocidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfield_velocidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfield_velocidadeActionPerformed

    private void jbutton_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_cadastrarActionPerformed
        // TODO add your handling code here:
        
        Connection conexao = null;
        PreparedStatement statement = null;
        
        String url = "jdbc:mysql://localhost:3306/pato_corrida";
        String usuario = "root";
        String senha = "";
        
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "INSERT INTO pato (nome, peso, velocidade) VALUES (?, ?, ?)";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, jfield_nome.getText());
            statement.setString(2, jfield_peso.getText());
            statement.setString(3, jfield_velocidade.getText());
            
            statement.executeUpdate();
            System.out.println("Deu certo aqui.");
            
            jfield_nome.setText("");
            jfield_peso.setText("");
            jfield_velocidade.setText("");
            
            PopularJTable("SELECT * FROM pato");
        }
        catch (SQLException e) {
            System.out.println("Deu esse erro aqui ô " + e.getMessage());
        }
    }//GEN-LAST:event_jbutton_cadastrarActionPerformed

    private void jfield_nome_DAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfield_nome_DAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfield_nome_DAActionPerformed

    private void jfield_velocidade_DAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfield_velocidade_DAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfield_velocidade_DAActionPerformed

    private void jtbl_mostra_patoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_mostra_patoMouseClicked
        // TODO add your handling code here:
        int linha = jtbl_mostra_pato.getSelectedRow();
        
        jfield_id_DA.setText(jtbl_mostra_pato.getValueAt(linha, 0).toString());
                
        jfield_nome_DA.setText(jtbl_mostra_pato.getValueAt(linha,1).toString());
                
        jfield_peso_DA.setText(jtbl_mostra_pato.getValueAt(linha, 2).toString());
                        
        jfield_velocidade_DA.setText(jtbl_mostra_pato.getValueAt(linha, 3).toString());
    }//GEN-LAST:event_jtbl_mostra_patoMouseClicked

    private void jfield_id_DAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfield_id_DAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfield_id_DAActionPerformed

    private void jbutton_deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbutton_deletarMouseClicked
        // TODO add your handling code here:
        Connection conexao = null;
        PreparedStatement statement = null;
        
        String url = "jdbc:mysql://localhost:3306/pato_corrida";
        String usuario = "root";
        String senha = "";
        
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "DELETE FROM pato WHERE id_pato = ?";
            statement = conexao.prepareStatement(sql);

            statement.setString(1, jfield_id_DA.getText());
            
            statement.executeUpdate();
            System.out.println("Deu certo aqui.");
            
            jfield_id_DA.setText("");
            jfield_nome_DA.setText("");
            jfield_peso_DA.setText("");
            jfield_velocidade_DA.setText("");
            
            PopularJTable("SELECT * FROM pato");
        }
        catch (SQLException e) {
            System.out.println("Deu esse erro aqui ô " + e.getMessage());
        }
        
    }//GEN-LAST:event_jbutton_deletarMouseClicked

    private void AtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtualizarMouseClicked
        // TODO add your handling code here:
        Connection conexao = null;
        PreparedStatement statement = null;
        
        String url = "jdbc:mysql://localhost:3306/pato_corrida";
        String usuario = "root";
        String senha = "";
        
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "UPDATE pato SET nome = ?, peso = ?, velocidade = ? WHERE id_pato = ?";
            statement = conexao.prepareStatement(sql);

            statement.setString(1, jfield_nome_DA.getText());
            statement.setString(2, jfield_peso_DA.getText());
            statement.setString(3, jfield_velocidade_DA.getText());
            statement.setString(4, jfield_id_DA.getText());
            
            statement.executeUpdate();
            
            System.out.println("Deu certo aqui.");
            
            jfield_id_DA.setText("");
            jfield_nome_DA.setText("");
            jfield_peso_DA.setText("");
            jfield_velocidade_DA.setText("");
            
            PopularJTable("SELECT * FROM pato");
        }
        catch (SQLException e) {
            System.out.println("Deu esse erro aqui ô " + e.getMessage());
        }
    }//GEN-LAST:event_AtualizarMouseClicked

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
            java.util.logging.Logger.getLogger(mostra_patos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostra_patos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostra_patos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostra_patos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostra_patos().setVisible(true);
            }
        });
    }
    
    public void PopularJTable(String sql) {
        try {
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/pato_corrida", "root", "");
            PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
            banco.execute();
            
            ResultSet resultado = banco.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel) jtbl_mostra_pato.getModel();
            model.setNumRows(0);
            
            while (resultado.next())
            {
                model.addRow(new Object[]
                {
                   resultado.getString("id_pato"),
                   resultado.getString("nome"),
                   resultado.getString("peso"),
                   resultado.getString("velocidade")
                });
            }
            
            banco.close();
            con.close();
        }
        catch (SQLException e) {
            System.out.println("O erro foi esse ô" + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbutton_cadastrar;
    private javax.swing.JButton jbutton_deletar;
    private javax.swing.JTextField jfield_id_DA;
    private javax.swing.JTextField jfield_nome;
    private javax.swing.JTextField jfield_nome_DA;
    private javax.swing.JTextField jfield_peso;
    private javax.swing.JTextField jfield_peso_DA;
    private javax.swing.JTextField jfield_velocidade;
    private javax.swing.JTextField jfield_velocidade_DA;
    private javax.swing.JLabel jlbl_id_DA;
    private javax.swing.JLabel jlbl_nome;
    private javax.swing.JLabel jlbl_nome_DA;
    private javax.swing.JLabel jlbl_peso;
    private javax.swing.JLabel jlbl_peso_DA;
    private javax.swing.JLabel jlbl_velocidade;
    private javax.swing.JLabel jlbl_velocidade_DA;
    private javax.swing.JTable jtbl_mostra_pato;
    // End of variables declaration//GEN-END:variables
}