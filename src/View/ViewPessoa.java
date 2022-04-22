
package View;

import Model.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewPessoa extends javax.swing.JFrame {
    DefaultTableModel tabela = null;
    List<Pessoa> pessoas;
    
    public ViewPessoa() {
        initComponents();
    }
    
    int peso;
    double altura;
    double imc;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_idPessoa = new javax.swing.JLabel();
        lb_nomePessoa = new javax.swing.JLabel();
        lb_idadePessoa = new javax.swing.JLabel();
        lb_alturaPessoa = new javax.swing.JLabel();
        lb_pesoPessoa = new javax.swing.JLabel();
        lb_imcPessoa = new javax.swing.JLabel();
        lb_RecebImcPessoa = new javax.swing.JLabel();
        txt_idPessoa = new javax.swing.JTextField();
        txt_nomePessoa = new javax.swing.JTextField();
        txt_idadePessoa = new javax.swing.JTextField();
        txt_alturaPessoa = new javax.swing.JTextField();
        txt_pesoPessoa = new javax.swing.JTextField();
        bt_salvarPessoa = new javax.swing.JButton();
        bt_buscarPessoa = new javax.swing.JButton();
        bt_alterarPessoa = new javax.swing.JButton();
        bt_excluirPessoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_consultarPessoa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPessoa = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lb_idPessoa.setText("CÓDIGO:");

        lb_nomePessoa.setText("NOME:");

        lb_idadePessoa.setText("IDADE:");

        lb_alturaPessoa.setText("ALTURA:");

        lb_pesoPessoa.setText("PESO:");

        lb_imcPessoa.setText("IMC:");

        lb_RecebImcPessoa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lb_RecebImcPessoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bt_salvarPessoa.setText("SALVAR");
        bt_salvarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarPessoaActionPerformed(evt);
            }
        });

        bt_buscarPessoa.setText("BUSCAR");
        bt_buscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarPessoaActionPerformed(evt);
            }
        });

        bt_alterarPessoa.setText("ALTERAR");
        bt_alterarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarPessoaActionPerformed(evt);
            }
        });

        bt_excluirPessoa.setText("EXCLUIR");
        bt_excluirPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirPessoaActionPerformed(evt);
            }
        });

        jLabel1.setText("DIGITE O NOME PARA A PESQUISA:");

        txt_consultarPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_consultarPessoaKeyReleased(evt);
            }
        });

        jTPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOME", "IDADE", "ALTURA", "PESO", "IMC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTPessoa.getTableHeader().setReorderingAllowed(false);
        jTPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTPessoa);
        if (jTPessoa.getColumnModel().getColumnCount() > 0) {
            jTPessoa.getColumnModel().getColumn(0).setResizable(false);
            jTPessoa.getColumnModel().getColumn(1).setResizable(false);
            jTPessoa.getColumnModel().getColumn(2).setResizable(false);
            jTPessoa.getColumnModel().getColumn(3).setResizable(false);
            jTPessoa.getColumnModel().getColumn(4).setResizable(false);
            jTPessoa.getColumnModel().getColumn(5).setResizable(false);
        }

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_nomePessoa)
                    .addComponent(lb_idPessoa)
                    .addComponent(lb_idadePessoa)
                    .addComponent(lb_alturaPessoa)
                    .addComponent(lb_pesoPessoa)
                    .addComponent(lb_imcPessoa))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_alturaPessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txt_idadePessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txt_nomePessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txt_idPessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_RecebImcPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_pesoPessoa))))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_consultarPessoa)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(bt_salvarPessoa)
                        .addGap(18, 18, 18)
                        .addComponent(bt_buscarPessoa)
                        .addGap(18, 18, 18)
                        .addComponent(bt_alterarPessoa)
                        .addGap(18, 18, 18)
                        .addComponent(bt_excluirPessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_idPessoa)
                    .addComponent(txt_idPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nomePessoa)
                    .addComponent(txt_nomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_idadePessoa)
                    .addComponent(txt_idadePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_alturaPessoa)
                    .addComponent(txt_alturaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_pesoPessoa)
                    .addComponent(txt_pesoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_imcPessoa)
                            .addComponent(lb_RecebImcPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_salvarPessoa)
                            .addComponent(bt_buscarPessoa)
                            .addComponent(bt_alterarPessoa)
                            .addComponent(bt_excluirPessoa))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_consultarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarPessoaActionPerformed
    Pessoa p = new Pessoa();
	PessoaDao pdao = new PessoaDao();
        if(evt.getSource() == bt_salvarPessoa) {
			p.setNome(txt_nomePessoa.getText());
                        p.setIdade(Integer.parseInt(txt_idadePessoa.getText()));                        
			p.setAltura(Double.parseDouble(txt_alturaPessoa.getText()));                        
                        p.setPeso(Integer.parseInt(txt_pesoPessoa.getText()));                                                
                        p.setImc(Double.parseDouble(lb_RecebImcPessoa.getText()));
			pdao.salvar(p);
			txt_nomePessoa.setText("");
                        txt_idadePessoa.setText("");
			txt_alturaPessoa.setText("");
                        txt_pesoPessoa.setText("");
                        lb_RecebImcPessoa.setText("");
                        
		}
    }//GEN-LAST:event_bt_salvarPessoaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    altura = Double.parseDouble(txt_alturaPessoa.getText());
    peso = Integer.parseInt(txt_pesoPessoa.getText());
    imc = peso/ (altura * altura);
    lb_RecebImcPessoa.setText(String.format("%.0f",imc));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_buscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarPessoaActionPerformed
    Pessoa p = new Pessoa();
	PessoaDao pdao = new PessoaDao();
        if(evt.getSource() == bt_buscarPessoa) {
			p = pdao.pesquisarId(Integer.parseInt(txt_idPessoa.getText()));
			
			if(p == null) {
				JOptionPane.showMessageDialog(null,"Código inexistente !");
                                txt_idPessoa.setText("");
                                txt_nomePessoa.setText("");
                                txt_idadePessoa.setText("");
                                txt_alturaPessoa.setText("");
                                txt_pesoPessoa.setText("");
                                lb_RecebImcPessoa.setText("");
                                
                                
			}else {
				txt_nomePessoa.setText(p.getNome());
				txt_idadePessoa.setText(String.valueOf(p.getIdade()));
                                txt_alturaPessoa.setText (String.valueOf(p.getAltura()));
                                txt_pesoPessoa.setText(String.valueOf(p.getPeso()));
                                lb_RecebImcPessoa.setText(String.valueOf(p.getImc()));
			}
        }
    }//GEN-LAST:event_bt_buscarPessoaActionPerformed

    private void bt_alterarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarPessoaActionPerformed
    Pessoa p = new Pessoa();
	PessoaDao pdao = new PessoaDao();
        if(evt.getSource() == bt_alterarPessoa) {
			p = pdao.pesquisarId(Integer.parseInt(txt_idPessoa.getText()));
			
			p.setNome(txt_nomePessoa.getText());
			p.setIdade(Integer.parseInt(txt_idadePessoa.getText()));
                        p.setAltura(Double.parseDouble(txt_alturaPessoa.getText()));
                        p.setPeso(Integer.parseInt(txt_pesoPessoa.getText()));
                        p.setImc(Double.parseDouble(lb_RecebImcPessoa.getText()));
			pdao.alterar(p);
                        txt_idPessoa.setText("");
			txt_nomePessoa.setText("");
			txt_idadePessoa.setText("");
                        txt_alturaPessoa.setText("");
                        txt_pesoPessoa.setText("");
                        lb_RecebImcPessoa.setText("");
        }
    }//GEN-LAST:event_bt_alterarPessoaActionPerformed

    private void bt_excluirPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirPessoaActionPerformed
    Pessoa p = new Pessoa();
	PessoaDao pdao = new PessoaDao();
        if(evt.getSource() == bt_excluirPessoa) {
			p = pdao.pesquisarId(Integer.parseInt(txt_idPessoa.getText()));
			
			if(p == null) {
				JOptionPane.showMessageDialog(null,"Código inexistente !");
			}else {
				pdao.excluir(p);
                                txt_idPessoa.setText("");
                                txt_nomePessoa.setText("");
                                txt_idadePessoa.setText("");
                                txt_alturaPessoa.setText("");
                                txt_pesoPessoa.setText("");
                                lb_RecebImcPessoa.setText("");
			}
			
		}
    }//GEN-LAST:event_bt_excluirPessoaActionPerformed

    private void jTPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPessoaMouseClicked
    int linha = jTPessoa.getSelectedRow();

        System.out.println("linha " + linha);
        txt_idPessoa.setText(String.valueOf(jTPessoa.getValueAt(linha, 0)));
        txt_nomePessoa.setText(String.valueOf(jTPessoa.getValueAt(linha, 1)));
        txt_idadePessoa.setText(String.valueOf(jTPessoa.getValueAt(linha, 2)));
        txt_alturaPessoa.setText(String.valueOf(jTPessoa.getValueAt(linha, 3)));
        txt_pesoPessoa.setText(String.valueOf(jTPessoa.getValueAt(linha, 4)));
        lb_RecebImcPessoa.setText(String.valueOf(jTPessoa.getValueAt(linha, 5)));
    }//GEN-LAST:event_jTPessoaMouseClicked

    private void txt_consultarPessoaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_consultarPessoaKeyReleased
    if (txt_consultarPessoa.getText().equals("")) {

            tabela.setNumRows(0);
        } else {
            listarAlunos();

        }
    }//GEN-LAST:event_txt_consultarPessoaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ViewPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ViewPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ViewPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ViewPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterarPessoa;
    private javax.swing.JButton bt_buscarPessoa;
    private javax.swing.JButton bt_excluirPessoa;
    private javax.swing.JButton bt_salvarPessoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPessoa;
    private javax.swing.JLabel lb_RecebImcPessoa;
    private javax.swing.JLabel lb_alturaPessoa;
    private javax.swing.JLabel lb_idPessoa;
    private javax.swing.JLabel lb_idadePessoa;
    private javax.swing.JLabel lb_imcPessoa;
    private javax.swing.JLabel lb_nomePessoa;
    private javax.swing.JLabel lb_pesoPessoa;
    private javax.swing.JTextField txt_alturaPessoa;
    private javax.swing.JTextField txt_consultarPessoa;
    private javax.swing.JTextField txt_idPessoa;
    private javax.swing.JTextField txt_idadePessoa;
    private javax.swing.JTextField txt_nomePessoa;
    private javax.swing.JTextField txt_pesoPessoa;
    // End of variables declaration//GEN-END:variables
private void listarAlunos() {
        PessoaDao ad = new PessoaDao();
        tabela = (DefaultTableModel) jTPessoa.getModel();
        String nome = txt_consultarPessoa.getText();
        tabela.setNumRows(0);
        try {
            pessoas = ad.listar(nome);
            for (Pessoa a : pessoas) {
                tabela.addRow(new Object[]{a.getId(), a.getNome(), a.getIdade(), String.format("%.2f",a.getAltura() ), a.getPeso(), a.getImc()});
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao listar " + ex.getMessage());
        }
    }
}
